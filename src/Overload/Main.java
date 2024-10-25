package Overload;

class Mahasiswa {
    private String nama;
    private double IPK;
    private String gender;

    // Constructor default
    Mahasiswa() {
        this.nama = null;
        this.IPK = 0;
    }

    // Constructor dengan parameter nama
    Mahasiswa(String nama) {
        this.nama = nama;
        this.IPK = 0;
    }

    // Constructor dengan parameter nama dan IPK
    Mahasiswa(String nama, double IPK) {
        this.nama = nama;
        this.IPK = IPK;
    }

    // Method overloading untuk setGender
    public void setGender(char gender) {
        this.gender = String.valueOf(gender);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();
        Mahasiswa mahasiswa2 = new Mahasiswa("tono");
        Mahasiswa mahasiswa3 = new Mahasiswa("budi", 3.3);

        // Memanggil metode setGender
        mahasiswa3.setGender('L');

        // Tambahkan logika tambahan jika diperlukan
    }
}
