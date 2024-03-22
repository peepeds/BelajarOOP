package Encapsulation;

public  class Main {
    public static void  main(String[] args){
        // public
        Mahasiswa mahasiswa1 = new Mahasiswa(123, 2.3 , "Babi");
        mahasiswa1.display();
        mahasiswa1.NIM = 123 ;
        System.out.println();
        mahasiswa1.display();

        // protected
        Dosen dosen1 = new Dosen("D123","baaaa","babaaa@baba.com");
        dosen1.Display();
        // private
        //Dosen dosen1 = new Dosen(); ga akan bisa karena private harus dikelas yang sama
        //dosen1.nama
        //dosen1.display;
    }
}