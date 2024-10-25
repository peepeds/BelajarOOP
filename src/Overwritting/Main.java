package Overwritting;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bego","Bego@mail.com");
        Mahasiswa mahasiswa = new Mahasiswa("Halo", "halo@mail.com",123);
        user.display();
        System.out.println();
        mahasiswa.display();
    }
}
