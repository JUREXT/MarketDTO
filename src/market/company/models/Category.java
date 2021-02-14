package market.company.models;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {


    private Integer id;
    private String name;
    private List<Product> products = null;
    private List<Integer> childCategories = null;

    public Category() {  }

    public Category(Integer id, String name, List<Product> products, List<Integer> childCategories) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.childCategories = childCategories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Integer> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(List<Integer> childCategories) {
        this.childCategories = childCategories;
    }

}
