package com.trekurator.service;

import java.util.List;

import com.trekurator.model.TrekDetail;

public interface TrekDetailsService
{
	public List<TrekDetail> getTrekDetails();
	
	public TrekDetail getTrekDetailByID(long id);

}