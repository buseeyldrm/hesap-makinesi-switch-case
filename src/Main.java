import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("birinci sayıyı girin: ");
        int a= klavye.nextInt();
        System.out.print("ikinci sayıyı girin: ");
        int b= klavye.nextInt();

        String islemler="1.Toplama \n"
                        +"2.Çıkarma \n"
                        +"3.Çarpma \n"
                        +"4.Bölme \n";
        System.out.println("...İŞLEMLER...");
        System.out.println(islemler);
        System.out.println();
        System.out.print("hangi işlemi yapmak istiyorsunuz? :");
        int secim= klavye.nextInt();

        switch (secim){
            case 1:
                System.out.println("sayıların toplamı: " +(a+b));
                break;
            case 2:
                System.out.println("sayıların farkı: " +(a-b));
                break;
            case 3:
                System.out.println("sayıların çarpımı: " +(a*b));
                break;
            case 4:
                if (b==0){
                    System.out.println("sayı 0' bölünmez");
                    break;
                }
                System.out.println("sayıların bölümü: " +(a/b));
                break;

            default:
                System.out.println("gecerli bir secim yapın.");
        }
    }
}