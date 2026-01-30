import java.util.*;

class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer,String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        System.out.println(employees.get(102));

        if (!employees.containsKey(105)) {
            employees.put(105, "404");
        }

        System.out.println(employees);
    }
}
