package Encapsulation;

class Dosen {
    private String kode;
    private String nama;
    private String email;
    protected Dosen(String kode , String nama , String email){
        this.nama = nama ;
        this.email = email;
        this.kode = kode;
    }

    private Dosen(){
        this.nama = "NULL";
        this.kode = "NULL";
        this.email = "NULL";
    }

    private void  display(){
        System.out.println("NIM: " + kode);
        System.out.println("IPK: " + email);
        System.out.println("Nama: " + nama);
    }

    protected void Display(){
        System.out.println("NIM: " + kode);
        System.out.println("IPK: " + email);
        System.out.println("Nama: " + nama);
    }
}
