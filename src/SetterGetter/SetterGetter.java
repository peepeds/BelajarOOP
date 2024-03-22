package SetterGetter;

class Mahasiswa{
    private int NIM ;
    private String firstName;
    private String lastName;
    private String email;

    protected Mahasiswa(int NIM , String firstName , String lastName){
        this.NIM = NIM;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected int getNIM(){
        return  NIM;
    }
    protected String getFirstName(){
        return firstName;
    }
    protected String getLastName(){
        return lastName;
    }

    protected void setNIM(int NIM){
        this.NIM = NIM;
    }
    protected void setFirstName(String firstName){
        this.firstName = firstName;
    }
    protected void setLastName(String lastName){
        this.lastName = lastName;
    }
    protected void setEmail(){
        this.email = firstName +"." + lastName + "@blabla.com";
    }

    protected void display(){
        System.out.println("Nama : " + firstName + " " +lastName);
        System.out.println("NIM : "+ NIM);
        System.out.println("Email : " + email);
    }
}
