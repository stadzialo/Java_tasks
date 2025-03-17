import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String imie = "Stachu";
        int wiek = 19;
        System.out.println("siemaczesc " + imie + "! Mam " + wiek + " lat");

        System.out.println("A ty jak masz na imie?");
        Scanner scanner = new Scanner(System.in);
        String imie2 = scanner.nextLine();

        System.out.println("Ile masz lat?");
        int wiek2 = scanner.nextInt();

        System.out.println("Siema " + imie2 + ", masz " + wiek2 + " lat.");

    }
}