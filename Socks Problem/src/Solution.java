import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        int t=0;
        for (int i=0;i<n-1;i++){
        	 System.out.println("i " +  i); 
            if(c[i]==c[i+1]){
                t++;
              System.out.println("i++" +  i++); 
            }
        }
        System.out.println(t);
    }
}