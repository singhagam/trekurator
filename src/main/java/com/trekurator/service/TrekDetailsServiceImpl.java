package com.trekurator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trekurator.model.TrekDetail;
import com.trekurator.repository.TrekDetailsRepository;

@Service
public class TrekDetailsServiceImpl implements TrekDetailsService {

	@Autowired
	private TrekDetailsRepository trekDetailsRepo;
	
	@Override
	public List<TrekDetail> getTrekDetails() {
		return  trekDetailsRepo.findAll();
	}

	@Override
	public TrekDetail getTrekDetailByID(long id) {
		Optional<TrekDetail> optinalEntity= trekDetailsRepo.findById(id);
		TrekDetail trekDetailByID=optinalEntity.get();
		return trekDetailByID;
	}

}
