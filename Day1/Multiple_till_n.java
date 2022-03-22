import java.util.Scanner;


public class Multiple_till_n {
    public static void main(String[] args) {
        //int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n");
        int n  = sc.nextInt();
        for (int i = 1; i<=n;i++){
            int a = i*i;
            System.out.println(a);
        }



    }
}