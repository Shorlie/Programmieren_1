package Block_2;

public class Auf_3 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.print(" | ");
            for (int j = 1; j <= 10; j++) {

                System.out.print(i*j + "\t");
                System.out.print(" | ");
            }
            System.out.println("");
            System.out.println("----------------------------------------------------------------------------------");

        }
    }
}
