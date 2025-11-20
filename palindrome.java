import java.util.*;

public class palindrome{
    public static void main(String[] args) {

        System.out.println("Please Enter a number : ");
    Scanner sc = new Scanner(System.in);
    int palindrome = sc.nextInt();

    if(palin(palindrome)) {
    System.out.println("Number : " + palindrome + " is a palindrome");
    } else {
    System.out.println("Number : " + palindrome + " is not a palindrome");
}
sc.close();
    }
    public static boolean palin(int num){
    int palindrome  = num;
    int rev = 0;
    while(palindrome!=0){
    int remainder = palindrome%10;
    rev =  rev*10 + remainder;
    palindrome = palindrome/10;
}
if(num == rev){
   return true;
}else
 return false;
  }
  
}
