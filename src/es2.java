import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrings = new String[3];
        System.out.println("inserisci prima stringa");
        inputStrings[0] = scanner.nextLine();
        System.out.println("inserisci seconda stringa");
        inputStrings[1] = scanner.nextLine();
        System.out.println("inserisci terza stringa");
        inputStrings[2] = scanner.nextLine();

        System.out.println(inputStrings[0] + inputStrings[1] + inputStrings[2]);

        System.out.println(inputStrings[2] + inputStrings[1] + inputStrings[0]);
    }
}
