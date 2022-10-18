import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 20;
        int[] arr = getArr(n, -100, 100);

        System.out.println("Al numbers from our array");
        for (var item : arr) {
            System.out.print(item + " ");
        }

        System.out.println("\nEven numbers only:");
        for (var item : arr) {
            if (item % 2 == 0) {
                System.out.print(item + " ");
            }
        }
    }

    private static int[] getArr(int count, int min, int max) {
        int[] res = new int[count];
        Random random = new Random();
        for (int i = 0; i < res.length; i++) {
            res[i] = random.nextInt(min, max);
        }
        return res;
    }
}