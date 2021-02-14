
package market.company.models;

import java.util.List;

public class Ranking {

    private String ranking;
    private List<ProductRank> productRanks;

    public Ranking(String ranking, List<ProductRank> products) {
        this.ranking = ranking;
        this.productRanks = products;
    }

    public String getRanking() {
        return ranking;
    }

    public List<ProductRank> getProducts() {
        return productRanks;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "ranking='" + ranking + '\'' +
                '}';
    }
}
