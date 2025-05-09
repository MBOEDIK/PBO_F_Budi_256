package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {

    String namaBarang, dekrpisiBarang, lokasiTerakhirDitemukan;

    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login(User user){
        if(user.getNama().equals("Muhammad Budi Kusuma") && user.getNim().equals("202410370110256")){
            isValid = true;
        }
    }

    @Override
    public void displayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        while (true){
            System.out.println("\n" +
                    "0. Logout\n" +
                    "1. Kelola Laporan Barang\n" +
                    "2. Kelola Data Mahasiswa\n");
            pilihan = input.nextInt();
            if(pilihan == 0){
                break;
            }
            switch (pilihan){
                case 1: this.reportItem(); break;
                case 2: this.viewReportedItems(); break;
                default:
            }
        }
    }

    @Override
    public void reportItem() {
        Scanner input = new Scanner(System.in);
        namaBarang = input.nextLine();
        dekrpisiBarang = input.nextLine();
        lokasiTerakhirDitemukan = input.nextLine();
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">>Fitur Lihat Laporan Belum Tersedioa<<");
    }
}
