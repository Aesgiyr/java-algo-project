import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        int check;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the prime number checker");
        System.out.println("Enter a number for check");
        int number = scanner.nextInt();

        for (int i = 2 ; i<number ; i++){

            check = number%i;

            if (check!=0){
                System.out.println("The number you entered is prime");
                break;
            } else if (check==0) {
                System.out.println("The number you entered is not prime");
                break;

            }
        }
    }
}