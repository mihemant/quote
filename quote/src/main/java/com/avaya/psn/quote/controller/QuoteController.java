package com.avaya.psn.quote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.avaya.psn.quote.model.Quote;
import com.avaya.psn.quote.service.QuoteService;

@RestController
public class QuoteController {
	@Autowired
	private QuoteService quoteService;
	
	@GetMapping("/")
    public String home() {
        return "Home page";
    }
	 
	@RequestMapping("/create")
	public String create(@RequestParam int configId,@RequestParam String configurationName,@RequestParam String country) {
		Quote quote=quoteService.create(configId, configurationName, country);
		return quote.toString();
	}
	
	@RequestMapping("/get")
	public Quote get(@RequestParam int configId) {
		return quoteService.getByConfigId(configId);
	}
	
	@RequestMapping("/getAll")
	public List<Quote> getAll() {
		return quoteService.getAll();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam int configId,@RequestParam String configurationName,@RequestParam String country) {
		Quote quote=quoteService.update(configId, configurationName, country);
		return quote.toString();
	}
}
