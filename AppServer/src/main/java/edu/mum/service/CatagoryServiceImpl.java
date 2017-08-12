package edu.mum.service;

import edu.mum.dao.CatagoryRepository;
import edu.mum.domain.Catagory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yentran
 */

@Service
public class CatagoryServiceImpl implements ICatagoryService {
    @Autowired
    private CatagoryRepository cRep;

    @Override
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
    public Catagory delete(Catagory t) {
        // TODO Auto-generated method stub
        cRep.delete(t);
        return t;
    }

    @Override
    public List<Catagory> getAll() {
        // TODO Auto-generated method stub
        return cRep.findAll();
    }

    @Override
    public Catagory get(String id) {
        // TODO Auto-generated method stub
        return cRep.findById(id);
    }

}
