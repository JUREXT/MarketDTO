
package market.company.models;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    private Integer id;
    private String name;
    private String dateAdded;
    private List<Variant> variants = null;
    private Tax tax;
    private String priceRange;
    private String currency;
    private Boolean isShortlisted = false;

    public Product() { }

    public Product(Integer id, String name, String dateAdded, List<Variant> variants, Tax tax, String priceRange, String currency, Boolean isShortlisted) {
        this.id = id;
        this.name = name;
        this.dateAdded = dateAdded;
        this.variants = variants;
        this.tax = tax;
        this.priceRange = priceRange;
        this.currency = currency;
        this.isShortlisted = isShortlisted;
    }

    public Boolean getShortlisted() {
        return isShortlisted;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public Tax getTax() {
        return tax;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateAdded='" + dateAdded + '\'' +
                ", tax=" + tax.toString() +
                ", priceRange='" + priceRange + '\'' +
                ", currency='" + currency + '\'' +
                ", isShortlisted=" + isShortlisted +
                '}';
    }
}
