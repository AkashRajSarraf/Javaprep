import java.util.Scanner;
public class one {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A");
    int A = sc.nextInt();
    System.out.println("Enter the number B");
    int B = sc.nextInt();
    System.out.println("Enter the number C");
    int C = sc.nextInt();
    int total  = (A+B+C);
    System.out.println("total is : " + total);
    sc.close();
    }
}