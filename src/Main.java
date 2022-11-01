import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                //NWD
                //greatest common denominator
                int a, b;
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();
                b = scanner.nextInt();

                while (a!=b) {
                    if (a<b) {
                        b = b-a;
                    }else {
                        a = a-b;
                    }
                }
                System.out.print("NWD= "+a);
            }

        }