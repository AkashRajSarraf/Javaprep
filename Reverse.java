import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = " ";
        char ch;

        for(int i =0; i<= str.length()-1; i++){
            ch =str.charAt(i);
            rstr = ch + rstr;
        }
        System.out.println("Reverse of your name is :"+ " "+ rstr);
        sc.close();
    }
}
