import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int c ;
        System.out.println("Sayi Giriniz : ");
        c = input.nextInt();

       for (int i = 1 ;i <= c;i*=4){
           System.out.println(i);

           }
       System.out.print("*************");
        for (int x =1 ; x <= c;x*=5){
            System.out.println(x);
       }

    }
}