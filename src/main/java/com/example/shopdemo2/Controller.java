package com.example.shopdemo2;

import com.example.shopdemo2.category.Category;
import com.example.shopdemo2.category.CategoryService;
import com.example.shopdemo2.product.Product;
import com.example.shopdemo2.product.ProductService;
import com.example.shopdemo2.subcategory.SubCategory;
import com.example.shopdemo2.subcategory.SubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    //****CATEGORY***//
    @Autowired
    CategoryService categoryService;

    //    retrieves all the category detail from the database
    @GetMapping("/category")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }
    //    post the category detail in the database
    @PostMapping("/catsave")
    private String saveCategory(@RequestBody Category category) {
        categoryService.save(category);
        return category.getCategoryname();
    }
    //update/edit the category detail
    @PutMapping("/catedit")
    private Category update(@RequestBody Category category)
    {
        categoryService.save(category);
        return category;
    }
    // for delete
    @DeleteMapping("/catdelete/{catid}")
    private void deleteCategory(@PathVariable("catid") int id)
    {
        categoryService.delete(id);
    }

    // for filter
    @RequestMapping("/filter/{categoryname}")
    public List<Category> getCategoryByCategoryName(@PathVariable String categoryname){
        return categoryService.getCategoryByCategoryName(categoryname);
    }

    //***SUBCATEGORY***//

    @Autowired
    SubService subService;

    //    retrieves all the category detail from the database
    @GetMapping("/subcategory")
    public List<SubCategory> getAllSubCategory() {
        return subService.getAllSubCategory();
    }

    //    post the category detail in the database
    @PostMapping("/subsave")
    private String saveSubCategory(@RequestBody SubCategory subCategory) {
        subService.save(subCategory);
        return subCategory.getMaincategory();

    }
    //update/edit the category detail
    @PutMapping("/subedit/{subid}")
    private SubCategory update(@RequestBody SubCategory subCategory)
    {
        subService.save(subCategory);
        return subCategory;
    }
    // for delete
    @DeleteMapping("/subdelete/{subid}")
    private void deleteSubCategory(@PathVariable("subid") int id)
    {
        subService.delete(id);
    }

    //***PRODUCT***//

    @Autowired
    ProductService productService;

    //    retrieves all the category detail from the database
    @GetMapping("/product")
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }

    //    post the category detail in the database
    @PostMapping("/prodsave")
    private String saveProduct(@RequestBody Product product) {
        productService.save(product);
        return product.getCategory();

    }
    //update/edit the category detail
    @PutMapping("/prodedit/{prodid}")
    private Product update(@RequestBody Product product)
    {
        productService.save(product);
        return product;
    }

    // for delete
    @DeleteMapping("/proddelete/{prodid}")
    private void deleteProduct(@PathVariable("prodid") int id)
    {
        productService.delete(id);
    }

    // for filter
    @RequestMapping("/prodfilter/{price}")
    public List<Product> getProductByPrice(@PathVariable Long price){
        return productService.getProductByPrice(price);
    }

    @RequestMapping("/prodfilter1/{category}")
    public List<Product> getProductByCategory(@PathVariable String category){
        return productService.getProductByCategory(category);
    }


    //    call two values in single api
    @GetMapping("/productbyprice")
    public List<Product> getProductByPriceBetween(@RequestParam Long start, @RequestParam Long end){
        return productService.getProductByPriceBetween(start, end);
    }

}

