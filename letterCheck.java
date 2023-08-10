import java.util.Scanner;
public class letterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        char newChar = letter.charAt(0);
        switch (newChar){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harf girilmiştir ya da cümle kalın sesli harfle başlar");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("İnce sesli harf girilmiştir ya da cümle kalın sesli harfle başlar");
                break;
            default:
                System.out.println("Sayı, sessiz harf ya da sembol girilmiştir.");
        }

    }
}