package jatek.kopapirollo;

import java.util.Scanner;

public class Kopapirollo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Válassz: (kő, papír, olló): ");
        
        String valasz = sc.nextLine();
        
        int gepValasztSzam = (int) (Math.random() * 3);
        String gepValasztas = "";
        
        if (gepValasztSzam == 0){
            gepValasztas = "kő";
        } else if (gepValasztSzam == 1){
            gepValasztas = "papír";
        } else if (gepValasztSzam == 2){
            gepValasztas = "olló";
        }
        System.out.println("A gép választása: " + gepValasztas);
        
        if (valasz.equals(gepValasztas)){
            System.out.println("Döntetlen");
        }
    }
    
}
