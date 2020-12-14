package psc;

public class App {
    public static void main(String[] args) {
        long sc = 0;
        for (long i = 1; i <= 2147483647; i++) {
            if (i % 2 == 1) {
                sc += i;
            }
        }
        System.out.println("求和结果为：" + sc);
    }
}
