package com.user;

public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    @Override
    public void login(User user){
        if(user.getNama().equals("Muhammad Budi Kusuma") && user.getNim().equals("202410370110256")){
            isValid = true;
        }
    }

    public void DisplayInfo(){
        System.out.printf("" +
                "\n===============================\n" +
                "Nama: Muhammad Budi Kusuma\n" +
                "NIM: 202410370110256" +
                "\n===============================\n");
    }
}
