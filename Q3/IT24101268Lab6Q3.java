import java.util.Scanner;

import static java.lang.Math.sqrt;

public class IT24101268 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum_sqr = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99): ");


        while (true){
            System.out.print("Enter a number: ");
            int input = sc.nextInt();

            if (input== -99){
                break;
            }
            if (input<0){
                System.out.print("Invalid Input. Please enter a positive integer or -99 to terminate");
                continue;
            }
            sum_sqr += input*input;
            count++;
        }

        System.out.println("\nThe Root Mean square (RMS) is: "+sqrt(sum_sqr/count));
    }
}