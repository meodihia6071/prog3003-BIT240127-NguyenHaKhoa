import java.util.*;

class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Melon");

        fruit.add(1, "Mango");          
        fruit.set(fruit.indexOf("Banana"), "Grape");

        System.out.println(fruit);
        if(fruit.contains("Apple")==true){
            System.err.println("Co apple trong list");
        }else{
            System.out.println("Khong co");
        }
    }
}
