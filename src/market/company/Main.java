package market.company;

import market.company.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Market DTO Running");

        ResponseJSON data = createTractorData();
        printData(data);


    }

    private static void printData(ResponseJSON data) {
        for (Category category : data.getCategories()) {
            System.out.println("Category Name: " + category.getName());
            for (Product product : category.getProducts()) {
                System.out.println("  Product: " + product.toString());
                for (Variant variant : product.getVariants()) {
                    System.out.println("   Variant: " + variant.toString());
                }
            }
        }
    }


    private static ResponseJSON createTractorData() {
        List<Category> categories = new ArrayList<>();

        List<Variant> variants = new ArrayList<>();
        variants.add(new Variant(1, "Red", "100 KS", "29,000", "€"));
        variants.add(new Variant(2, "Blue", "130 KS", "50,000", "€"));

        Tax tax = new Tax("DDV", 22.0);

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Hurlimann", "14.02.2021", variants, tax, "21.000/50.000", "€", false));
        products.add(new Product(2, "Same", "14.02.2021", variants, tax, "21.000/50.000", "€", true));

        List<Integer> childCategories = new ArrayList<>();
        childCategories.add(1);
        childCategories.add(2);
        childCategories.add(3);

        categories.add(new Category(1, "Tractors", products, childCategories));


        List<Ranking> rankings = new ArrayList<>();
        List<ProductRank> productRankList = new ArrayList<>();
        productRankList.add(new ProductRank(1, 36, 2, 10));

        rankings.add(new Ranking("1", productRankList));

        return new ResponseJSON(categories, rankings);
    }
}
