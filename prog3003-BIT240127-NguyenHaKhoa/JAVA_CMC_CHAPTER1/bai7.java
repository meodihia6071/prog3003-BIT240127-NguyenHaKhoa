import java.util.TreeSet;

class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        
        for (int i = 1;i<5;i++){
            names.add("Khoa" + i);
        }
        System.out.println("sorted :" + names);
        System.out.println("min :" + names.first());
        System.out.println("max :"+ names.last());
    }
}
