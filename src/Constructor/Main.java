package Constructor;

class Mahasiswa{
    String Nama;
    double IPK;
    int NIM;

    Mahasiswa(String Nama,double IPK,int NIM){
        this.Nama = Nama;
        this.IPK = IPK;
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.Nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("IPK : " + this.IPK);
    }

    void show(Mahasiswa x){
        System.out.println("Nama : " + x.Nama);
        System.out.println("NIM : " + x.NIM);
        System.out.println("IPK : " + x.IPK);
    }
}
public  class Main {
    public static void  main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("beti", 2.2 , 109);
        Mahasiswa mahasiswa2 = new Mahasiswa("Tono", 3.3,989);
        mahasiswa1.show();
        System.out.println();
        mahasiswa2.show();
    }
}

// Constructor , sesuai namanya digunakan untuk membnentuk sebuah objek
// beserta dengan nilai yang akan di assign
// Mahasiswa() juga sebenarnya adalah sebuah constructor built in yang tidak memiliki parameter
// keyword this berfungsi untuk menghilangkan kerancuan antar variable dari Class dan parsing parameter
// sehingga this akan memberi acuan ke variable dari kelas itu sendiri.