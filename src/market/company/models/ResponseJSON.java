
package market.company.models;

import java.util.List;

public class ResponseJSON {


    private List<Category> categories = null;
    private List<Ranking> rankings = null;

    public ResponseJSON(List<Category> categories, List<Ranking> rankings) {
        this.categories = categories;
        this.rankings = rankings;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Ranking> getRankings() {
        return rankings;
    }

    public void setRankings(List<Ranking> rankings) {
        this.rankings = rankings;
    }

}
