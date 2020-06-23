package com.avaya.psn.quote.repository;

//import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avaya.psn.quote.model.Quote;

@Repository
public interface QuoteRepository extends MongoRepository<Quote,String>{
	public Quote findByconfigId(int configId);
	//public List<Quote> findBylinkId(int linkId);
}
