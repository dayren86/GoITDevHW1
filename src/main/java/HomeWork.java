import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class HomeWork {

    public void calculateQuantityProducts(String product) {
        List<Products> products = new ArrayList<>();
        String[] splitProduct = product.split("");

        for (String s : splitProduct) {
            switch (s.toUpperCase()) {
                case "A":
                    products.get(0).setDiscountQuantity(products.get(0).getDiscountQuantity() + 1);
            }
        }

        System.out.println(products.get(0).getDiscountQuantity());
    }

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        homeWork.discountСalculation("CCDDCABDDBACCCAA");
    }
}
