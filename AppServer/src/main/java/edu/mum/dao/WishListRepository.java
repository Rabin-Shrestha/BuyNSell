package edu.mum.dao;

import edu.mum.domain.WishList;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yentran
 */
public interface WishListRepository extends MongoRepository<WishList, Long> {

    //	public WishList findByCatagory(WishList wl);
    public WishList findByDesc(String name);

    public Long deleteById(String wl_id);
}
