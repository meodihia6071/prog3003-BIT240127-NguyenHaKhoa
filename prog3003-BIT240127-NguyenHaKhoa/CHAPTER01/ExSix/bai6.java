import java.util.HashSet;

class HashSetTest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 2, 5, 8, 1};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x:arr) {
            hashSet.add(x);
        }

        System.out.println(hashSet);
    }
}
//No k giong mang ban dau vi ham hashset luu bang hashing chu khong phai index
