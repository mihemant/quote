package com.avaya.psn.quote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avaya.psn.quote.model.Quote;
import com.avaya.psn.quote.repository.QuoteRepository;

@Service
public class QuoteService {
	@Autowired
	private QuoteRepository quoteRepository;
	
	//Create Quote
	public Quote create(int configId,String configurationName,String country) {
		return quoteRepository.save(new Quote(configId,configurationName,country));
	}
	public List<Quote> getAll(){
		return quoteRepository.findAll();
	}
	
	public Quote getByConfigId(int configId) {
		return quoteRepository.findByconfigId(configId);
	}
	
	//Update 
	public Quote update(int configId,String configurationName,String country) {
		Quote q=quoteRepository.findByconfigId(configId);
		q.setConfigurationName(configurationName);
		q.setCountry(country);
		return quoteRepository.save(q);
	}

}
