package market.company.models;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {


    private Integer id;
    private String name;
    private List<Product> products;
    private List<Integer> childCategories;

    public Category(Integer id, String name, List<Product> products, List<Integer> childCategories) {
        this.id = id;
        this.name = name;
        this.products = products;
        this.childCategories = childCategories;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getChildCategories() {
        return childCategories;
    }

}
