import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

public class ProductsArray {
    private static final String json = "./src/main/java/products.json";

    public FileReader readProductsFromJson() {
        FileReader reader = null;
        try {
            reader = new FileReader(json);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader;
    }

    public List<Products> jsonToObject() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Type typeToken = new TypeToken<List<Products>>() {}.getType();

        return gson.fromJson(readProductsFromJson(), typeToken);
    }
}
