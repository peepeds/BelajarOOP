package Methods;

class Mahasiswa{
    String nama ;
    double IPK ;
    int NIM ;

    Mahasiswa(String nama ,double IPK ,int NIM ){
        this.IPK = IPK;
        this.NIM = NIM;
        this.nama = nama;
    }

    String getNama(){
        return this.nama;
    }
    int getNIM(){
        return this.NIM;
    }
    double getIPK(){
        return this.IPK;
    }

    void setNama(String nama){
        this.nama = nama;
    }
    void setIPK(double IPK){
        this.IPK = IPK;
    }
    void setNIM(int NIM){
        this.NIM = NIM;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
        System.out.println("IPK : " + this.IPK);
    }
}
public class Main {
    public static  void  main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa("Bono",0,123);
        mahasiswa1.show();
        System.out.println();

        mahasiswa1.setNama("Haloo");
        System.out.println(mahasiswa1.getNama());
        System.out.println();

        mahasiswa1.show();

    }

}
