package edu.mum.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.dao.CatagoryRepository;
import edu.mum.domain.Catagory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Created by yentran
 */
@RestController
@RequestMapping("/catagory")
public class CatagoryRestController implements IController<Catagory> {

	@Autowired
	private CatagoryRepository cRep;
	
	@Override
	@PostMapping
	public Catagory add(Catagory t) {
		// TODO Auto-generated method stub
		return cRep.save(t);
	}

	@Override
	public Catagory update(Catagory t, String id) {
		// TODO Auto-generated method stub
		t.setCata_id(id);
		return cRep.save(t);
	}

	@Override
	public Catagory delete(Catagory t, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Catagory> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Catagory get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
