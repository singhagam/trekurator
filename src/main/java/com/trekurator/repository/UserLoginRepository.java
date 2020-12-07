package com.trekurator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.trekurator.model.UserLogin;

@Repository
public interface UserLoginRepository extends CrudRepository<UserLogin, Long>
{
	
}