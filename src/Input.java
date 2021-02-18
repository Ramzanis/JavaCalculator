import java.util.Scanner;

public class Input {

    int number1;
    int number2;

    public void print() {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

            System.out.println("Choose one of the letters");
            System.out.print("\nA: Subtract");
            System.out.print("\nB: Addition");
            System.out.print("\nC: Multiplication");
            System.out.print("\nD: Division");

             System.out.println();

            char letter = scanner.next().toUpperCase().charAt(0);

            String choice = "";

        switch (letter) {

            case 'A':
                choice = "Subtract";
                break;

            case 'B':
                choice = "Addition";
                break;

            case 'C':
                choice = "Multiplication";
                break;

            case 'D':
                choice = "Division";
                break;

        }

        do {


            if (choice.equals("Subtract")) {

                System.out.println("Enter numbers to subtract");

                number1 = scanner.nextInt();
                number2 = scanner.nextInt();

                System.out.println(calculator.subtract(number1, number2));

            } else if (choice.equals("Addition")) {

                System.out.println("Enter numbers to add");

                number1 = scanner.nextInt();
                number2 = scanner.nextInt();

                System.out.println(calculator.addition(number1, number2));

            } else if (choice.equals("Multiplication")) {

                System.out.println("Enter numbers to multiply");

                number1 = scanner.nextInt();
                number2 = scanner.nextInt();

                System.out.println(calculator.multiply(number1, number2));

            } else if (choice.equals("Division")) {

                System.out.println("Enter numbers to divide");

                number1 = scanner.nextInt();
                number2 = scanner.nextInt();

                System.out.println(calculator.division(number1, number2));

            }


        } while (true);


    }

}