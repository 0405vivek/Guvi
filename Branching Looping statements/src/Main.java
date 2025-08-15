import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Q1: Print numbers from 10 to 50
        System.out.println("Q1: Numbers from 10 to 50:");
        for (int i = 10; i <= 50; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Q2: Check Positive or Negative
        System.out.println("Q2: Check Positive or Negative:");
        int num1 = 123;
        int num2 = -100;
        if (num1 >= 0)
            System.out.println("Input=" + num1 + " → Output = Positive");
        else
            System.out.println("Input=" + num1 + " → Output = Negative");

        if (num2 >= 0)
            System.out.println("Input=" + num2 + " → Output = Positive");
        else
            System.out.println("Input=" + num2 + " → Output = Negative");
        System.out.println();

        // Q3: Reverse a number
        System.out.println("Q3: Reverse a Number:");
        int number = 876;
        int rev = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("Input=" + number + " → Output=" + rev);
        System.out.println();

        // Q4: Smallest among three numbers
        System.out.println("Q4: Smallest among three numbers:");
        int a = 15, b = 9, c = 27;
        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Smallest number is: " + smallest);
        System.out.println();

        // Q5: Discount calculator
        System.out.println("Q5: Discount Calculation:");
        double amt1 = 400, amt2 = 800, amt3 = 1500;
        System.out.println("Purchase = " + amt1 + " → Final Payable = " + calcDiscount(amt1));
        System.out.println("Purchase = " + amt2 + " → Final Payable = " + calcDiscount(amt2));
        System.out.println("Purchase = " + amt3 + " → Final Payable = " + calcDiscount(amt3));
        System.out.println();

        // Q6: Pattern Printing
        System.out.println("Q6: Pattern Printing (n=5):");
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(i);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    // Helper method for discount (Q5)
    public static double calcDiscount(double amount) {
        double discount = 0;
        if (amount >= 500 && amount <= 1000) {
            discount = amount * 0.10;
        } else if (amount > 1000) {
            discount = amount * 0.20;
        }
        return amount - discount;
    }
}


//Q1: Numbers from 10 to 50:
//        10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
//
//Q2: Check Positive or Negative:
//Input=123 → Output = Positive
//        Input=-100 → Output = Negative
//
//Q3: Reverse a Number:
//Input=876 → Output=678
//
//Q4: Smallest among three numbers:
//Numbers: 15, 9, 27
//Smallest number is: 9
//
//Q5: Discount Calculation:
//Purchase = 400.0 → Final Payable = 400.0
//Purchase = 800.0 → Final Payable = 720.0
//Purchase = 1500.0 → Final Payable = 1200.0
//
//Q6: Pattern Printing (n=5):
//        54321
//        44321
//        33321
//        22221
//        11111
//
//Process finished with exit code 0