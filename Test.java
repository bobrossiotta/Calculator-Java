
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /**
         * by bobrossiotta
         */
    // integer
    // Calculator
    //
        int numero1,numero2,select;
        Scanner bob = new Scanner(System.in);

        System.out.print("First Number: ");
        numero1 = bob.nextInt();

        System.out.print("Second Number: ");
        numero2 = bob.nextInt();

        System.out.println("Select: 1-> +\n 2-> -\n 3-> *\n 4-> / ");
        select= bob.nextInt();
        switch (select) {
            case 1:
                System.out.println(numero1+numero2);
                        break;

            case 2:
                System.out.println(numero1-numero2);
                break;

            case 3:
                System.out.println(numero1*numero2);
                break;

            case 4:
                System.out.println(numero1/numero2);
                break;


    } } }