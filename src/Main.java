import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // wpisz z klawiat. 1 string, prezniesz ost. 2 znaki na przod, jezeli jest ich conajmnie 3
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj łańcuch do zmiany (długość powinna być większa lub równa 3):");
        String string1 = scan.nextLine();
        if (string1.length() >= 3) {
            String substr1 = string1.substring(string1.length() - 2);
            String substr2 = string1.substring(0,string1.length() - 2);
            string1 = substr1.concat(substr2);
            System.out.println( "Oto zmieniony łańcuch:" );
            System.out.println(string1);

        } else {
            System.out.println("Długość podanego łańcucha jest mniejsza niż 3 - nie wykonano zamiany.");
        }

    }
}