import java.util.Scanner;
public class numberCompare {

    public static void main(String[] args) {
        int winner;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number to compare");
        int a = input.nextInt();
        
        System.out.println("Enter the second number to compare");
        int b = input.nextInt();
        
        System.out.println("Enter the third number to compare");
        int c = input.nextInt();
        
        if (a>b){
            winner=a;
        }else{
            winner=b;
        }
        if (winner>c){
            System.out.println("The largest number entered: "+winner);
        }else{
            System.out.println("The largest number entered: "+c);
        }

    }
}
