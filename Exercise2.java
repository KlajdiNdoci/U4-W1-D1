import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la prima parola");
        String primaParola = input.nextLine();

        System.out.println("Inserisci la seconda parola");
        String secondaParola = input.nextLine();

        System.out.println("Inserisci la terza parola");
        String terzaParola = input.nextLine();

        System.out.println("il risultato della concatenazione é : " + concatStrings(primaParola, secondaParola, terzaParola));

        System.out.println("il risultato della concatenazione inversa é : " + reverseConcatStrings(primaParola, secondaParola, terzaParola));


        input.close();
    }

    public static String concatStrings(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static String reverseConcatStrings(String str1, String str2, String str3) {
        return str3 + str2 + str1;
    }


}
