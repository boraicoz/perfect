import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int number,perfectnumber=0;
        String control;
        Scanner in=new Scanner(System.in);
        System.out.print("Sayiyi Girin:");
        number=in.nextInt();

           for(int i=1;i<=number;i++)
           {
               if(i==number){
                   System.out.println((number==perfectnumber)?"Mukemmel Sayi":"Degil");
                   break;
               }

               else if(number%i==0)
               {
                   perfectnumber+=i;
               }
           }


    }
}
