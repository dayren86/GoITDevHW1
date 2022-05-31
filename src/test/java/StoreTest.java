import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StoreTest {
    @Test
    public void testAmountProducts() {
        HashMap<String, Integer> expected = new LinkedHashMap<>();
        expected.put("A", 4);
        expected.put("B", 2);
        expected.put("C", 6);
        expected.put("D", 4);

        Store store = new Store();
        List<Products> products = store.calculateQuantityProducts("CCDDCA   BDDBACCCAA");

        for (Map.Entry<String, Integer> stringIntegerEntry : expected.entrySet()) {
            for (Products product : products) {
                if (product.getProduct().equals(stringIntegerEntry.getKey())) {
                    //also, the Product class doesn't have any amount field :/
                    Assertions.assertEquals(stringIntegerEntry.getValue(), product.getAmount());
                }
            }
        }
    }

    @Test
    public void testDiscountProducts() {
        Store store = new Store();
        //Actually I'm confused here, you call calculateDiscount() method but Store class doesn't have any
        double actual = store.discount(store.calculateQuantityProducts(" ABCDABA"));
        Assertions.assertEquals(13.25,actual);
        //double actual = store.discount(store.calculateQuantityProducts("CCDDCA   BDDBACCCAA));
        //Assertions.assertEquals(20.75,actual);
    }
}
