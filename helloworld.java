import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        System.out.println("enter char");
        Scanner sc = new Scanner(System.in);
        char c= sc.next().charAt(0);
        System.out.println(c);
        sc.close();
    }
}