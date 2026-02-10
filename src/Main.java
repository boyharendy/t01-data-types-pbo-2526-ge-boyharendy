import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih soal (1-5): ");
        int pilihan = sc.nextInt();

        // ================= SOAL 1 =================
        if (pilihan == 1) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
                System.out.println("OVERFLOW");
            }
            else if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
                System.out.println("OVERFLOW");
            }
            else {
                System.out.println(a + b);
            }
        }

        // ================= SOAL 2 =================
        else if (pilihan == 2) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float floatSum = (float)x + (float)y;
            double doubleSum = x + y;

            double diff = Math.abs(doubleSum - floatSum);

            System.out.printf("%.6f%n", diff);
        }


        // ================= SOAL 3 =================
        else if (pilihan == 3) {
            int n = sc.nextInt();

            Integer a = n;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // ================= SOAL 4 =================
        else if (pilihan == 4) {
            String s = sc.next();

            String a = s;
            String b = new String(s);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        // ================= SOAL 5 =================
        else if (pilihan == 5) {
            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean b = Boolean.parseBoolean(boolStr);

            double result = i * d;

            if (!b) {
                result = result * -1;
            }

            System.out.printf("%.2f%n", result);
        }

        else {
            System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }
}
