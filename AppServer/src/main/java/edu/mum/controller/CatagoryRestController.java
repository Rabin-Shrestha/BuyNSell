package edu.mum.controller;

import edu.mum.dao.CatagoryRepository;
import edu.mum.domain.Catagory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yentran
 */
@RestController
@RequestMapping("/catagory")
public class CatagoryRestController implements IController<Catagory> {

    @Autowired
    private CatagoryRepository cRep;

    @Override
    @PostMapping("/")
    public Catagory add(@RequestBody Catagory t) {
        // TODO Auto-generated method stub
        return cRep.save(t);
    }

    @Override
    @PutMapping("/update/{id}")
    public Catagory update(@RequestBody Catagory t, @PathVariable("id") String id) {
        // TODO Auto-generated method stub
        t.setCata_id(id);
        return cRep.save(t);
    }

    @Override
    @DeleteMapping("/detele/{id}")
    public Catagory delete(@RequestBody Catagory t, @PathVariable("id") String id) {
        // TODO Auto-generated method stub
        cRep.deleteById(id);
        return t;
    }

    @Override
    @GetMapping("/all")
    public List<Catagory> getAll() {
        // TODO Auto-generated method stub
        return cRep.findAll();
    }

    @Override
    @GetMapping("/get/{id}")
    public Catagory get(@PathVariable("id") String id) {
        // TODO Auto-generated method stub
        return cRep.findById(id);
    }

}
