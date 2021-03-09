public class Solution {

   static int linearSearch(String[] arr,String key,int n){
        int occurences =0;
        for(int i =0;i<n;i++){
            if (key.equals(arr[i])) {
                occurences++;
            }
        }
        return occurences;
    }
    static void solution(String[] a,String[] b,int n, int m){
        int[] o = new int[m];
        for (int i=0; i<m; i++){
            o[i]=linearSearch(a,b[i],n);
            System.out.println(o[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        int n = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            String stringsItem = scan.nextLine();
            strings[i] = stringsItem;
        }

        int m = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[m];

        for (int i = 0; i < m; i++) {
            String queriesItem = scan.nextLine();
            queries[i] = queriesItem;
        }
        solution(strings,queries,n,m);
    }
}
