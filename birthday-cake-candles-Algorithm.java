import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int linearSearch(long[]arr,long key,long n){
        int occurences =0;
        for(int i =0;i<n;i++){
            if (key == arr[i]) {
                occurences++;
            }
        }
        return occurences;
    }
    static void bday_candles(long[] arr,int n){
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int occurences = linearSearch(arr,arr[n-1],n);
        //System.out.println(Arrays.toString(arr));
        System.out.println(occurences);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] candles = new long[n];
        for (int i=0; i < n ;i++){
            candles[i]=scan.nextLong();
        }
        bday_candles(candles,n);
    }

}