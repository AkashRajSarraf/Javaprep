import java.util.Scanner;
public class check {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    if(age>=18){
        System.out.println("you are adult");
    }
    else if(age>=13 && age<18){
        System.out.println("ypu are teenager");
    }
    else{
        System.out.println("you are child");
    }
    sc.close();
}
}