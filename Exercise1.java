import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        System.out.println("il risultato della moltiplicazione é : " + multiplication(10, 20));
        System.out.println("il risultato della concatenazione é : " + numberAndStringConcat("hello", 3));
        String[] arrayOfFiveStrings = {"primo", "secondo", "terzo", "quarto", "quinto"};
        System.out.println("inserisci stringa in array: " + Arrays.toString(newArrayOfStrings(arrayOfFiveStrings, "nuova stringa")));

    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public static String numberAndStringConcat(String str, int n) {
        String numberToString = Integer.toString(n);
        return str + numberToString;
    }

    public static String[] newArrayOfStrings(String[] array, String newString) {
        String[] newArray = new String[6];
        for (int i = 0; i < 2; i++) {
            newArray[i] = array[i];
        }
        newArray[2] = newString;

        for (int i = 0; i < 3; i++) {
            newArray[3 + i] = array[2 + i];
        }


        return newArray;
    }
}
