package Package.Main;

class Player {
    private String nama;
    private int NIM;
    private double IPK;

    Player(String nama , int NIM , double IPK){
        this.nama = nama ;
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public int getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public double getIPK() {
        return IPK;
    }
}
