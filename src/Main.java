import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n;
int r;
        System.out.println("once n, sonra r degerini giriniz.");
n = s.nextInt();
r = s.nextInt();

        //kombinasyon formulunu giriyorum.
        System.out.println(

                fakt(n)/(fakt(r)*fakt(n-r))


        );


    }
    public static int fakt(int sayi){
       int deger = 1;
        for(int i = 1;i<=sayi;i++){
            deger *=i;
        }
        return deger;
    }

}