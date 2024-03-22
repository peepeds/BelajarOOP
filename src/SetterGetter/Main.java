package SetterGetter;

public class Main {
    public static void  main(String[] args){
        Mahasiswa mahasiswa1 = new Mahasiswa(123,"Budi", "Pekerti");
        mahasiswa1.display();
        //mahasiswa1.email = "Budi.pekerti@blabla.com";
        // ga akan bisa karena enkapsulasi. makanya butuh setter unuk memanipulasi
        System.out.println();
        mahasiswa1.setEmail();
        mahasiswa1.display();


    }
}
