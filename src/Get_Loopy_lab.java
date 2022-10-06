import java.util.Scanner;

public class Get_Loopy_lab
{
    public static void main(String[] args) {
        //1
        for (int x = 0; x <= 30; x++) {
            System.out.println(x);
        }
        System.out.println();
        //2
        for (int x = 30; x >= 0; x--) {
            System.out.println(x);
        }
        System.out.println();
        //3
        for (int x = 0; x <= 18; x += 3) {
            System.out.println(x);
        }
        System.out.println();
        //4
        for (int x = 10; x >= 0; x -= 2) {
            System.out.println(x);
        }
        System.out.println();
        //5
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //6
        for (int r = 5; r >= 1; r--) {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //7
        for (int r = 0; r <= 4; r++) {
            for (int c = 0; c <= 4; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //8

        Scanner in = new Scanner(System.in);
        double celsius = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("Enter the temperature in celsius: ");
            if (in.hasNextDouble())
            {
             celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash+ " is not a valid input try again");
            }
        }while(!done);
        System.out.println("The temp in Fahrenheit is " + (celsius * 1.8 +32));
    }
}
