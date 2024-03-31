import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{ 3,4,6,8,5,6,7,8,9,10 };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumofElements(n-1, intArray));
    }

    public static int sumofElements( int n,int[] intArray) {
        if(n==0)

            return (intArray[n]);
        else {

            return intArray[n]+ sumofElements(n-1, intArray);

        }
    }
}
