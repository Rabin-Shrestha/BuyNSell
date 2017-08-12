package edu.mum.service;

import edu.mum.domain.User;

import java.util.List;

/**
 * Created by Rabin Shrestha on 8/10/2017.
 */
public interface IService<T> {
    T add(T t);
    T update(String id,T t);
    T delete(T t);
    List<T> getAll();
    T get(String id);
}
