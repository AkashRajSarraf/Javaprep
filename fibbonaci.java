public class fibbonaci {
    public static void main(String[] args) {
            int n=0, m=1 ,k,i;
            System.out.print(n+" "+m);
            for(i=2;i<=10;i++){
            k=n+m;
            System.out.print(" "+k+" ");
            n=m;
            m=k;
          }
    }
}
