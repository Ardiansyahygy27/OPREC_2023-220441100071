package Oprec;

import java.util.Scanner;


public class Pembeli {
    Scanner input =  new Scanner(System.in);
    String NamaPembeli;

    public Pembeli(String NamaPembeli) {
        this.NamaPembeli = NamaPembeli;
    }

    void MenuPilih() {
        System.out.println("========== Menu ==========");
        System.out.println("1. Pilih Menu");
        System.out.println("2. Lihat Pesanan");
        System.out.println("3. Selesaikan Pemesanan");
        System.out.println("===========================");
        System.out.print("Pilih Menu(1-3) : ");
        String MenuPilih = input.nextLine();
    
    }

    void Menu() {
        System.out.println("========= Paket Menu Yang Tersedia ========");
        System.out.println("1. Biasa   (Rp.5.000.0");
        System.out.println("2. Double  (Rp.7.000.0");
        System.out.println("3. Special (Rp.9.000.0");
        System.out.println("============================================");
        System.out.print("Pilih Menu (1-3) : ");
        String Menu = input.nextLine();
    }
    
    
    void Pilih(){
        System.out.println("Apakah tambah nasi(ya/tidak) : ");
        String Pilih = input.nextLine();
        System.out.println("Apakah Ingin Memesan Lagi (ya/tidak) : ");
        String Pilih1 = input.nextLine();
    }
    
    void LihatPesanan(){
        System.out.println("========== Pesanan Anda ==========");
        System.out.println("Pesanan : ");
        System.out.println("Detail Pesanan : ");
    }
    
}
