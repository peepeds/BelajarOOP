package Overwritting;

public class Mahasiswa extends User{
    private int NIM;

    Mahasiswa(String nama, String email, int NIM){
        super(nama,email);
        this.NIM = NIM;
    }

    public int getNIM() {
        return NIM;
    }

    public void display(){
        System.out.println("Mahasiswa");
        System.out.println("Nama: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM : " +getNIM());
    }
}