import java.util.Scanner
package Tasks;



public class Task1 {

    //1. Napisz metodę, która zwróci twoje imię oraz aktualny wiek.
    public static void Zad1(String[] args) {
        String imie = "Stanisław";
        int wiek = 19;
        System.out.println("Jestem " + imie + ", mam " + wiek + " lat");

    }
    //2. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
    //Argumenty przekazywane do metody są liczbami wprowadzanymi przez użytkownika z klawiatury.
    public static void Zad2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = scanner.nextDouble();

        double suma = a + b;
        double roznica = a - b;
        double iloczyn = a * b;

        System.out.println("Suma: " + suma + ", Różnica: " + roznica + ", Iloczyn: " + iloczyn);
        System.out.println();
    }

    //3. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static void Zad3() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę, aby sprawdzić, czy jest parzysta: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest parzysta.");
        }
        System.out.println();
    }

    // 4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez
    //3 i przez 5.
    public static void Zad4() {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Podaj liczbę, aby sprawdzić, czy jest podzielna przez 3 i 5: ");
        int liczba = scanner.nextInt();

        if (liczba % 3 == 0 && liczba % 5 == 0) {
            System.out.println("Liczba " + liczba + " jest podzielna przez 3 i 5.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest podzielna przez 3 i 5.");
        }
        System.out.println();
    }

    // 5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
    public static void Zad5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę, aby obliczyć jej 3 potęgę: ");
        double liczba = scanner.nextDouble();

        double wynik = Math.pow(liczba, 3);
        System.out.println("Liczba " + liczba + " podniesiona do 3 potęgi wynosi: " + wynik);
        System.out.println();
    }

    //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy.
    public static void Zad6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę, aby obliczyć jej pierwiastek kwadratowy: ");
        double liczba = scanner.nextDouble();

        if (liczba < 0) {
            System.out.println("Nie można obliczyć pierwiastka z liczby ujemnej.");
        } else {
            double wynik = Math.sqrt(liczba);
            System.out.println("Pierwiastek kwadratowy liczby " + liczba + " wynosi: " + wynik);
        }
        System.out.println();
    }

    //7. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
    //z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    //Argumenty przekazywane do metody są liczbami losowymi z przedziału <a,b> a i b wczytywane są
    //przez użytkownika z klawiatury.
    public static void Zad7() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość pierwszego odcinka: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj długość drugiego odcinka: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj długość trzeciego odcinka: ");
        double c = scanner.nextDouble();

        double[] boki = {a, b, c};
        java.util.Arrays.sort(boki);

        if (boki[0] * boki[0] + boki[1] * boki[1] == boki[2] * boki[2]) {
            System.out.println("Z odcinków o długości " + a + ", " + b + " i " + c + " można zbudować trójkąt prostokątny.");
        } else {
            System.out.println("Z odcinków o długości " + a + ", " + b + " i " + c + " nie można zbudować trójkąta prostokątnego.");
        }
        System.out.println();
    }

}