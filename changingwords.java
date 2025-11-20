import java.util.Scanner;
//there is a test case you have to take input 3 word from user one by one and give them output in single line with in 1st word all vowels are change into * and in 2nd word all consonant(not include numbers) change into @ and in 3rd word all letters change into uppercase. ex- how are you = h*wa@eYOU//
public class changingwords {
     public static void main(String s[]){
        String s1,s2,s3;
        Scanner sin=new Scanner(System.in); 
        s1=sin.nextLine();
        s2=sin.nextLine();
        s3=sin.nextLine(); 
        System.out.println(s1.replaceAll("[AaEeIiOoUu]", "*")+s2.replaceAll("[^AaEeIiOoUu0123456789]", "@")+s3.toUpperCase());
        sin.close();
     }
}
