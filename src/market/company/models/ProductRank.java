
package market.company.models;


public class ProductRank {


    private Integer id;
    private Integer viewCount;
    private Integer orderCount;
    private Integer shares;

    public ProductRank(Integer id, Integer viewCount, Integer orderCount, Integer shares) {
        this.id = id;
        this.viewCount = viewCount;
        this.orderCount = orderCount;
        this.shares = shares;
    }

    public Integer getId() {
        return id;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public Integer getShares() {
        return shares;
    }

    @Override
    public String toString() {
        return "ProductRank{" +
                "id=" + id +
                ", viewCount=" + viewCount +
                ", orderCount=" + orderCount +
                ", shares=" + shares +
                '}';
    }
}
