package com.java.trekurator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.trekurator.dao.TrekuratorDao;
import com.java.trekurator.model.TrekuratorLogin;

@RestController
@RequestMapping("/login")
public class TrekuratorController
{
	@Autowired
	private TrekuratorDao dao;
	
	@PostMapping("/setlogin")
	public String setLoginData(@RequestBody List<TrekuratorLogin> loginData)
	{
		dao.saveAll(loginData);
		return "total users logged in :"+ loginData.size();	
	}
	@GetMapping("/getlogin")
	public List<TrekuratorLogin> getLoginData()
	{
		return (List<TrekuratorLogin>) dao.findAll();	
	}
}