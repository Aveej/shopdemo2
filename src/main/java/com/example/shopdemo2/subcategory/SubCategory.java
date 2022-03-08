package com.example.shopdemo2.subcategory;


import javax.persistence.*;

@Entity
@Table(name = "subcategory")
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;

    @Column(name = "maincategory")
   private String maincategory;

    @Column(name = "name")
   private String name;

    @Column(name = "isactive")
   private String isactive;

    public SubCategory() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaincategory() {
        return maincategory;
    }

    public void setMaincategory(String maincategory) {
        this.maincategory = maincategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public SubCategory(int id, String maincategory, String name, String isactive) {
        this.id = id;
        this.maincategory = maincategory;
        this.name = name;
        this.isactive = isactive;
    }
}
