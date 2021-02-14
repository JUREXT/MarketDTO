
package market.company.models;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {


    private Integer id;
    private String name;
    private String dateAdded;
    private List<Variant> variants = null;
    private Tax tax;
    private String price_range;

    public Product() { }

    public Product(Integer id, String name, String dateAdded, List<Variant> variants, Tax tax, String price_range, Boolean isShortlisted) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.variants = variants;
        this.tax = tax;
        this.price_range = price_range;
        this.isShortlisted = isShortlisted;
    }

    private Boolean isShortlisted = false;

    public Boolean getShortlisted() {
        return isShortlisted;
    }

    public void setShortlisted(Boolean shortlisted) {
        isShortlisted = shortlisted;
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

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public String getPrice_range() {
        return price_range;
    }

    public void setPrice_range(String price_range) {
        this.price_range = price_range;
    }
}
