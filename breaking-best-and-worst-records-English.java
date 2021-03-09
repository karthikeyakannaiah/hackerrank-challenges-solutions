import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Long[] scores = new Long[n];
        for (int i=0; i < n ;i++){
            scores[i]=scan.nextLong();
        }
        Long high = null, low = null;
        int h= 0, l= 0;
        for (int i=0; i < n ;i++){
            if (i==0){
                high = scores[i];
                low =  scores[i];
            } else if(scores[i]==scores[i-1]){
                high = scores[i];
                low =  scores[i];
            } else if(scores[i]>high){
                h++;
                high = scores[i];
            } else if(scores[i]<low){
                l++;
                low = scores[i];
            }
        }
        System.out.println(h+" "+l);
    }
}
