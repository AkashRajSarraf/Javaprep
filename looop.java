import java.util.*;

public class looop {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for(int i =0; i<= n; i++){
            for(int j=n; j>=1; j--){
            System.out.println(n);
            count++;
            System.out.println(count);
            }
        }
        sc.close();
    }

}
