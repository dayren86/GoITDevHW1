import java.util.List;

public class Store {

    public List<Products> calculateQuantityProducts(String product) {
        ProductsArray productsArray = new ProductsArray();
        List<Products> products = productsArray.jsonToObject();

        String[] splitProduct = product.split("");

        for (String s : splitProduct) {
            switch (s.toUpperCase()) {
                case "A":
                    products.get(0).setAmount(products.get(0).getAmount() + 1);
                    break;
                case "B":
                    products.get(1).setAmount(products.get(1).getAmount() + 1);
                    break;
                case "C":
                    products.get(2).setAmount(products.get(2).getAmount() + 1);
                    break;
                case "D":
                    products.get(3).setAmount(products.get(3).getAmount() + 1);
                    break;
            }
        }
        return products;
    }

    public double discount(List<Products> products) {
        double result = 0;
        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getDiscountPrice() != 0) {
                result += products.get(i).getAmount() / products.get(i).getDiscountQuantity() * products.get(i).getDiscountPrice() +
                        products.get(i).getAmount() % products.get(i).getDiscountQuantity() * products.get(i).getPrice();
            } else {
                result += products.get(i).getAmount() * products.get(i).getPrice();
            }
        }
        return result;

    }
}
