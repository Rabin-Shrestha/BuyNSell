package edu.mum.service;

import edu.mum.domain.WishList;

/**
 * Created by yentran
 */
public interface IWishListService extends IService<WishList> {
    public Long deleteByWl_id(String wl_id);
}
