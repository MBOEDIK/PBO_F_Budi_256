package com.praktikum.users;

import com.praktikum.actions.AdminActions;

import java.util.Scanner;

public class Admin extends User implements AdminActions {

    public Admin(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login(User user){
        if(user.getNama().equals("Admin256") && user.getNim().equals("Password256")){
            isValid = true;
        }
    }

    @Override
    public void displayAppMenu(){
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
                case 0: break;
                case 1: this.manageItems(); break;
                case 2: this.manageUsers(); break;
                default:
            }
        }
    }

    @Override
    public void manageItems() {
        System.out.println(">>Fitur Kelola Barang Belum Tersedia\n<<");
    }

    @Override
    public void manageUsers() {
        System.out.println(">>Fitur Kelola Mahasiswa Belum Tersedia<<");
    }
}
