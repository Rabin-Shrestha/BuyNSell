package edu.mum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.mum.domain.WishList;
import edu.mum.service.WishListServiceImpl;
/**
 * Created by yentran
 */
@RestController
@RequestMapping("/wishlist")
public class WishListRestController implements IController<WishList> {
	@Autowired
	private WishListServiceImpl wlService;
	
	@Override
	@PostMapping("/")
	public WishList add(@RequestBody WishList t) {
		// TODO Auto-generated method stub
		return wlService.add(t);
	}

	@Override
	@PutMapping("/{id}")
	public WishList update(@RequestBody WishList t, @PathVariable("id") String id) {
		// TODO Auto-generated method stub
		//t.setWl_id(id);
		return wlService.update(t, id);
	}

	@Override
	public WishList delete(@RequestBody WishList t, @RequestParam String id) {
		// TODO Auto-generated method stub
		wlService.deleteByWl_id(id);
		return t;
	}

	@Override
	@GetMapping("/list")
	public List<WishList> getAll() {
		// TODO Auto-generated method stub
		return wlService.getAll();
	}

	@Override
	@GetMapping("/onelist/{id}")
	public WishList get(@PathVariable("id") String id) {
		// TODO Auto-generated method stub
		return wlService.get(id);
	}

}