package Class;

// ini adalah kelas
class Mahasiswa{
    String Nama;
    double IPK;
    int NIM;

    void show(Mahasiswa x){
        System.out.println("Nama : " + x.Nama);
        System.out.println("NIM : " + x.NIM);
        System.out.println("IPK : " + x.IPK);
    }
}

public class Class {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(); // ini adalah objek
        mahasiswa1.Nama = "Beti";
        mahasiswa1.IPK = 4;
        mahasiswa1.NIM = 123456;
        mahasiswa1.show(mahasiswa1);
        System.out.println();
        Mahasiswa mahasiswa2 = new Mahasiswa();// ini juga objek
        mahasiswa2.Nama = "Boti";
        mahasiswa2.IPK = 2.2 ;
        mahasiswa2.NIM = 121212;
        mahasiswa2.show(mahasiswa2);

    }
}

// class pada java dapat diartikan sebagai sebuah blueprint / cetak besar
// object adalah bentuk instansiasi dari suatu kelas (penggunaan kelas)
// object dibuat dengan menuliskan keyword new + nama kelas yang akan digunakan
