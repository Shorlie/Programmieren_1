package Block_2_Theorie;

public class student extends person {
    private int matrikelNummer;
    private String name;

    public static void main(String[] args) {
        student s1 = new student(1234);
        student s2 = new student("Affe");

    }

    public student(int matrikelNummer) {
        this.matrikelNummer = matrikelNummer;
        System.out.println(matrikelNummer);

    }
    public student(String name){
        this.name = name;
        System.out.println(name);
        super();
    }



}
