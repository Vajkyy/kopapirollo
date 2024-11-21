package jatek.kopapirollo;

import java.util.Scanner;

public class Kopapirollo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Válassz: ");
        System.out.println("1: kő");
        System.out.println("2: papír");
        System.out.println("3: olló");
        System.out.print("választásod: (1,2,3:): ");
        int jatekosValasztasSzam = sc.nextInt();
        String jatekosValasztasa = "";
        if (jatekosValasztasSzam == 1){
            jatekosValasztasa = "kő";
        } else if (jatekosValasztasSzam == 2) {
            jatekosValasztasa = "papír";
        } else if (jatekosValasztasSzam == 3){
            jatekosValasztasa = "olló";
        }
        System.out.println("Játékos választása: " + jatekosValasztasa);
        String gepValasztasa = "";
        
        //int gepValaszataSzam = (int)(Math.random() * 3) + 1;
        int gepValaszataSzam = 3;
        
        if (gepValaszataSzam == 1){
            gepValasztasa = "kő";
        } else if (gepValaszataSzam == 2){
            gepValasztasa = "papír";
        } else if (gepValaszataSzam == 3){
            gepValasztasa = "olló";
        }
        System.out.println("A gép válaszátsa: " + gepValasztasa);
        
        if (jatekosValasztasSzam == gepValaszataSzam){
            System.out.println("Döntetlen");
        } else if ((jatekosValasztasSzam == 1 && gepValaszataSzam == 3)){
            System.out.println("Nyertél!");
        } else if ((jatekosValasztasSzam == 2 && gepValaszataSzam == 1)){
            System.out.println("Nyertél!");
        } else if ((jatekosValasztasSzam == 3 && gepValaszataSzam == 2)){
            System.out.println("Nyertél!");
        } else{
            System.out.println("Vesztettél!");
        }
        
        
    }
    
}
