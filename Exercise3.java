import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del lato a del rettangolo: ");
        double aRettangolo = input.nextDouble();

        System.out.print("Inserisci la lunghezza del lato b del rettangolo: ");
        double bRettangolo = input.nextDouble();


        System.out.println("il perimetro del rettangolo é: " + calcRectanglePerimeter(aRettangolo, bRettangolo));


        System.out.print("Inserisci un numero intero: ");
        int number = input.nextInt();
        System.out.println("se il numero risulta 0 é pari, se risulta 1 é dispari: " + isEven(number));


        System.out.print("Inserisci la lunghezza del lato a del triangolo: ");
        double a = input.nextDouble();

        System.out.print("Inserisci la lunghezza del lato b del triangolo: ");
        double b = input.nextDouble();

        System.out.print("Inserisci la lunghezza del lato c del triangolo: ");
        double c = input.nextDouble();


        System.out.println("L'area del triangolo è: " + calcTriangleArea(a, b, c));

        input.close();

    }

    public static double calcRectanglePerimeter(double n1, double n2) {
        return (n1 * 2) + (n2 * 2);
    }

    public static int isEven(int n) {
        return n % 2 == 0 ? 0 : 1;
    }

    public static double calcTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
