package Overwritting;

public class User {
    private String nama;
    private String email;

    User(String nama , String email){
        this.nama = nama;
        this.email = email;
    }
    User(){

    }

    public void display(){
        System.out.println("User");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}
