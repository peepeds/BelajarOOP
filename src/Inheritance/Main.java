package Inheritance;

class User {
    private String nama;
    private String email;

    // Konstruktor
    public User(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}

class Dosen extends User {
    private String emailEdu;
    private int kodeDosen;

    // Konstruktor untuk Dosen
    public Dosen(String emailEdu, int kodeDosen, String nama, String email) {
        super(nama, email); // Memanggil konstruktor parent User
        this.emailEdu = emailEdu;
        this.kodeDosen = kodeDosen;
    }

    // Method untuk menampilkan informasi Dosen
    public void displayInfo() {
        System.out.println("Dosen: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("Email Edu: " + emailEdu);
        System.out.println("Kode Dosen: " + kodeDosen);
    }
}

class Mahasiswa extends User {
    private int NIM;

    // Konstruktor untuk Mahasiswa
    public Mahasiswa(String email, String nama, int NIM) {
        super(nama, email); // Memanggil konstruktor parent User
        this.NIM = NIM;
    }

    // Method untuk menampilkan informasi Mahasiswa
    public void displayInfo() {
        System.out.println("Mahasiswa: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM: " + NIM);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen = new Dosen("dosen@university.edu", 101, "Dr. Budi", "budi@university.com");
        // Menampilkan informasi Dosen
        dosen.displayInfo();

        System.out.println(); // Menambahkan baris kosong untuk pemisah

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("mahasiswa@university.com", "Tono", 2022001);
        // Menampilkan informasi Mahasiswa
        mahasiswa.displayInfo();
    }
}
