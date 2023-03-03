import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ustSinir,i,sayac=0,toplam=0;
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayi giriniz :");
        ustSinir= oku.nextInt();

        for(i=1;i<=ustSinir;i++){
            if(i%3==0 && i%4==0){
                sayac++;
                toplam+=i;
                System.out.println("sayi = "+i);
            }
        }

        System.out.print("\n3e ve 4e tam bolunebilen sayilarin toplami = "+toplam);
        System.out.println("\n3e ve 4e tam bolunebilen sayilarin ortalamasi = "+(toplam/sayac));

    }
}