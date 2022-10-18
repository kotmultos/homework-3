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

        workWithEnum();
    }

    private static void workWithEnum() {
        DaysOfWeek day = DaysOfWeek.WED;

        String resMessage = switch (day) {
            case MON ->  "Monday";
            case TUE -> "Tuesday";
            case WED -> "Wednesday";
            case THU -> "Thursday";
            case FRI -> "Friday";
            case SAT, SUN -> "Weekend";
            default -> "Wrong day";
        };

        System.out.println("\n" + resMessage);
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