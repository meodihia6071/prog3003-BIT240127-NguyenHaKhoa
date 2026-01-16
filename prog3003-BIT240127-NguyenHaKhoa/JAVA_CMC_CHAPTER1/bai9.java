import java.util.TreeMap;
import java.util.Map;

class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<String,Double> product = new TreeMap<>();

        product.put("Laptop", 1500.0);
        product.put("Mouse", 25.0);
        product.put("Keyboard", 50.0);
        System.out.println(product);

        Map<String,Double> sPro = product.subMap("K", true,
                                                "M", true);

        System.out.println("K->M" + sPro);
    }
}
