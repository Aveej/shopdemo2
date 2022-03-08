package com.example.shopdemo2.category;


import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="categoryname")
    private String categoryname;
//    @JsonIgnore
    @Column(name = "isactive")
    private String isactive;

//    public Category(String s, String furniture, String yes) {
//
//    }

    public Category() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public Category(int id, String categoryname, String isactive) {
        this.id = id;
        this.categoryname = categoryname;
        this.isactive = isactive;
    }
}
