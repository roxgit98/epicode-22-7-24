import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int prodotto = num1 * num2;
        System.out.println(prodotto);


        String stringa = "stringa";
        int num3 = 30;
        String concatena = stringa + num3;
        System.out.println(concatena);

        String[] lista = insertIntoArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");

        System.out.println(Arrays.toString(lista));
    }


    public static String[] insertIntoArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length + 1; i++) {
            if (i < 2) {
                array[i] = stringArray[i];
            } else if (i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }


}