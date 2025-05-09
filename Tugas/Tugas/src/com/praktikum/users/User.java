package com.praktikum.users;

public abstract class User {
    private String nama, nim;
    boolean isValid = false;

    public User(String nama, String nim){ this.nama = nama; this.nim = nim; }

    public abstract void login(User user);

    public abstract void displayAppMenu();

    public void DisplayInfo(){
        System.out.printf("" +
                "\n===============================\n" +
                "Nama: Muhammad Budi Kusuma\n" +
                "NIM: 202410370110256" +
                "\n===============================\n");
    }

    //setter
    public void setNama(String nama){ this.nama = nama; }
    public void setNim(String nim){ this.nim = nim; }

    //getter
    public boolean getAdminValid(){ return isValid; }
    public String getNama(){ return nama; }
    public String getNim(){ return nim; }
}
