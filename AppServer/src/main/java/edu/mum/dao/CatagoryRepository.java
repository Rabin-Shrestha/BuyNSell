package edu.mum.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.mum.domain.Catagory;
/**
 * Created by yentran
 */
public interface CatagoryRepository extends MongoRepository<Catagory, String>{
	public Catagory findByName(String name);
	public Catagory findById(String id);
	public Long deleteById(String userid);
}
