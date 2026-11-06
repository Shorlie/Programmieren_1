package Block_5;

public class Arrays_3 {
    static void main() {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for( int[] ar: arr)
        {
            for (int a: ar)
                {
                    if(a % 2 == 0)
                    {
                        break;
                    }
                System.out.print(a + " ");
                }
        }
        System.out.println();
        System.out.println("Continue: ");
        for( int[] ar: arr)
        {
            for (int a: ar)
            {
                if(a % 2 == 0)
                {
                    continue;
                }
                System.out.print(a + " ");
            }
        }

    }
}
