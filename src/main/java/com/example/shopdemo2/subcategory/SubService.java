package com.example.shopdemo2.subcategory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubService {

    @Autowired
    SubRepo subRepo;

    //    for view all

    public List<SubCategory> getAllSubCategory(){
        return this.subRepo.findAll();
    }

    //    for save
    public void save(SubCategory subCategory)
    {
        subRepo.save(subCategory);
    }

    //    for edit
    public void update(SubCategory subCategory, int id)
    {
        subRepo.save(subCategory);
    }


    //    for delete
    public void delete(int id)
    {
        subRepo.deleteById(id);
    }
}

