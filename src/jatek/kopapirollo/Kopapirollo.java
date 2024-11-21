package jatek.kopapirollo;

import java.util.Scanner;

public class Kopapirollo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Válassz: (kő, papír, olló)");
        String valasz = sc.nextLine();
        int gepValasztSzam = (int) (Math.random() * 3);
        String gepValasztas = "";
    }
    
}
