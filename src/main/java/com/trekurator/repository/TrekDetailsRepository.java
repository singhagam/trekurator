package com.trekurator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trekurator.model.TrekDetail;

@Repository
public interface TrekDetailsRepository extends JpaRepository<TrekDetail, Long>
{
	
}