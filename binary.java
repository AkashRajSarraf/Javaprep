import java.util.*;
/*this is the code of binary to decimal .
and this part is function/method of the code */
public class binary {

    public static void  bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum = decnum+(lastdigit*(int)Math.pow(2,pow));

            pow++;
            binnum=binnum/10;
        }
        System.out.println("decimal of " + mynum + " = " + decnum);
    }
    //this is the main method 
    public static void main(String[] args) {
        System.out.println("Enter your Binary number to change into Decimal number");
        Scanner sc = new Scanner(System.in);
        int binnum=sc.nextInt();
        bintodec(binnum);
        sc.close();
    }
}
