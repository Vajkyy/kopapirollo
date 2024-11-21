package jatek.kopapirollo;

import java.util.Scanner;

public class Kopapirollo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Válassz: 1: kő, 2: papír, 3: olló ");
        System.out.print("választásod: (1,2,3:): ");
        int jatekosValasztasSzam = sc.nextInt();
        String jatekosValasztasa = "";

        if (jatekosValasztasSzam == 1) {
            jatekosValasztasa = "kő";
        } else if (jatekosValasztasSzam == 2) {
            jatekosValasztasa = "papír";
        } else if (jatekosValasztasSzam == 3) {
            jatekosValasztasa = "olló";
        }
        System.out.println("Játékos választása: " + jatekosValasztasa);
        String gepValasztasa = "";

        int gepValasztasaSzam = (int) (Math.random() * 3) + 1;
        //int gepValaszataSzam = 3;

        if (gepValasztasaSzam == 1) {
            gepValasztasa = "kő";
        } else if (gepValasztasaSzam == 2) {
            gepValasztasa = "papír";
        } else if (gepValasztasaSzam == 3) {
            gepValasztasa = "olló";
        }
        System.out.println("A gép választása: " + gepValasztasa);

        if (jatekosValasztasSzam == gepValasztasaSzam) {
            System.out.println("Döntetlen");
        } else if ((jatekosValasztasSzam == 1 && gepValasztasaSzam == 3)) {
            System.out.println("Nyertél!");
        } else if ((jatekosValasztasSzam == 2 && gepValasztasaSzam == 1)) {
            System.out.println("Nyertél!");
        } else if ((jatekosValasztasSzam == 3 && gepValasztasaSzam == 2)) {
            System.out.println("Nyertél!");
        } else {
            System.out.println("Vesztettél!");
        }

    }

}
