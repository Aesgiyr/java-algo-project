import java.util.Scanner;
public class perfectNumber {
    public static void main(String[] args) {
        int check=0;
        System.out.println("Welcome to the perfect number checker");
        System.out.println("Enter the number to check");
        Scanner number = new Scanner(System.in);
        int perfectN = number.nextInt();
        for (int i=1 ; i<perfectN ; i++){
            if (perfectN%i==0){
                check=check+i;
                System.out.println("The divisor of the number you entered:"+check);
            }
        }
        if (check==perfectN){
            System.out.println("The number you entered is a perfect number");
        }else {
            System.out.println("The number you entered is not a perfect number");
        }
    }
}