import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[100];
        System.out.print("Please enter the number of numbers you want to print : ");
        int n = sc.nextInt();

        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i] +" ");
        }

    }
}