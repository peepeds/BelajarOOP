package Encapsulation;

class Mahasiswa {
    public int NIM;
    public double IPK;
    public String nama;

    public Mahasiswa(int NIM, double IPK, String nama) {
        this.NIM = NIM;
        this.IPK = IPK;
        this.nama = nama;
    }

    public void display() {
        System.out.println("NIM: " + NIM);
        System.out.println("IPK: " + IPK);
        System.out.println("Nama: " + nama);
    }
}
