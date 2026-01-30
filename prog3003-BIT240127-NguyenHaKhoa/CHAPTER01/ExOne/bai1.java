class Test<T> {
    private T value;

    public void set(T t) {
        this.value = t;
    }
    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Test<Integer> intTest = new Test<>();
        intTest.set(90);
        System.out.println("Int :" + intTest.get());

        Test<String> strTest = new Test<>();
        strTest.set("Hello world !");
        System.out.println("String : " + strTest.get());
    }
}
