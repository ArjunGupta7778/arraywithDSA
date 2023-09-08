package ashwaniDSA;

import java.util.Scanner;

public class maxInArray {
    // find the maxiamum element
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" how  many array you want to array");
        int n = in.nextInt();
        System.out.println(" enter all elenete of the array");
        int[]arr = new int [n];
        // loop for getting array
        for(int i = 0; i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        int max = arr[0];
        for(int element : arr){
            if (element >max) {
                max = element;


            }
        }
        System.out.println(" maximum number in the array in : ..."  + max);
        in.close();

    }
}
