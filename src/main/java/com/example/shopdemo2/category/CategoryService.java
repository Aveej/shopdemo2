package com.example.shopdemo2.category;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

//    for view all

    public List<Category> getAllCategory(){
        return this.categoryRepo.findAll();
    }

//    for save
    public void save(Category category)
    {
        categoryRepo.save(category);
    }

//    for edit
    public void update(Category category, int id)
    {
        categoryRepo.save(category);
    }


    //    for delete
    public void delete(int id)
   {
       categoryRepo.deleteById(id);
   }

   public List<Category> getCategoryByCategoryName(String categoryname){
        return categoryRepo.findByCategoryname(categoryname);
   }
}











//    public List<Category> getAllCategory() {
////        List<Category> category = new ArrayList<Category>();
////        categoryRepo.findAll().forEach(category1 -> category.add(category1));
////        return category;
////    }
