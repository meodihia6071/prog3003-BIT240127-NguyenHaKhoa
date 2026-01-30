class PrintArrayTest {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 9 , 3 ,2};
        String[] strArr = {"Nguyen", "Ha", "Khoa"};

        printArray(intArr);
        printArray(strArr);
    }
}
