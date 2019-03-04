import java.util.Scanner;
public class kul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1; i<=2; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }System.out.print(" ");
        }System.out.println();

        for(int i=1; i<=n-2; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }System.out.println("* *");
        }

        for(int i=1; i<=(n+1)/2; i++){
            System.out.print(" ");
        }
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(" ");
            }System.out.println("*");
        }
        sc.close();
    }
}

