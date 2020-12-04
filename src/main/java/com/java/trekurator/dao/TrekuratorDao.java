package com.java.trekurator.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.trekurator.model.TrekuratorLogin;

@Repository
public interface TrekuratorDao extends CrudRepository<TrekuratorLogin, Integer>
{
	
}