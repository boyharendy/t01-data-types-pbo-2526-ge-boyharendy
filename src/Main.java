import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {

            // ================= SOAL 1 =================
            case "Soal1":
                int a1 = sc.nextInt();
                int b1 = sc.nextInt();

                int result1 = a1 + b1;

                // Deteksi overflow tanpa long / try-catch
                if ((a1 > 0 && b1 > 0 && result1 < 0) ||
                    (a1 < 0 && b1 < 0 && result1 > 0)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(result1);
                }
                break;

            // ================= SOAL 2 =================
            case "Soal2":

    float xf = sc.nextFloat();
    float yf = sc.nextFloat();

    float sumFloat = xf + yf;

    double xd = xf;
    double yd = yf;
    double sumDouble = xd + yd;

    double diff = Math.abs(sumDouble - sumFloat);

    System.out.printf("%.6f\n", diff);
    break;

            // ================= SOAL 3 =================
            case "Soal3":
                int n = sc.nextInt();

                Integer a = n;
                Integer b = a;

                a = a + 1;

                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;

            // ================= SOAL 4 =================
            case "Soal4":
                String s = sc.next();

                String sa = s;
                String sb = new String(s);

                sa = sa + "X";

                System.out.println("==: " + (sa == sb));
                System.out.println("equals: " + sa.equals(sb));
                break;

            // ================= SOAL 5 =================
            case "Soal5":
                String intStr = sc.next();
                String doubleStr = sc.next();
                String boolStr = sc.next();

                int intVal = Integer.parseInt(intStr);
                double doubleVal = Double.parseDouble(doubleStr);
                boolean boolVal = Boolean.parseBoolean(boolStr);

                double result5 = intVal * doubleVal;

                if (!boolVal) {
                    result5 *= -1;
                }

                System.out.printf("%.2f\n", result5);
                break;
        }

        sc.close();
    }
}
