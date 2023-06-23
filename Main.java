
package Oprec;

import java.awt.Menu;
import java.util.Scanner;

public class Main {

    private static String Eko;
    Scanner input =  new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
        Pembeli p1 = new Pembeli(Eko);
//        PilihMenu m1 = new PilihMenu("1") 
        System.out.println("======== Selamat Datang Di Ayam Geprek Kamal =========");
        p1.MenuPilih();
        p1.Menu();
        p1.Pilih();
        p1.MenuPilih();
        
    }
    
//    void MenuPilih(){
//        
//        1
    
//    }
}
