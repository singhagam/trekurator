package com.trekurator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trekurator.model.TrekDetail;
import com.trekurator.service.TrekDetailsService;

@RestController
@RequestMapping("/trekDetails")
public class TrekDetailsController {
    
	@Autowired
	private TrekDetailsService trekDetailsService;

	@GetMapping(value = "/getTrekDetails")
	public  List<TrekDetail>  getTrekDetails() {
		return trekDetailsService.getTrekDetails();
	}

	@GetMapping(value = "/getTrekDetailById/{trekId}")
	public  TrekDetail getTrekDetailByID(@PathVariable long trekId) {
		return trekDetailsService.getTrekDetailByID(trekId);
	}

}