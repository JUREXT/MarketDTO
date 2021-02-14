
package market.company.models;

public class Variant {


    private Integer id;
    private String color;
    private Object size;
    private String price;

    public Variant() { }

    public Variant(Integer id, String color, Object size, String price) {
        this.id = id;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Object getSize() {
        return size;
    }

    public void setSize(Object size) {
        this.size = size;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
