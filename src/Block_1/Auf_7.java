package Block_1;

import java.util.*;

public class Auf_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("zahl: ");
        int n = input.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " ist gerade");
        }else{
            System.out.print(n + " ist ungerade");
        }

    }
}
