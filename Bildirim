import java.util.Scanner;
public class Bildirim {
    Scanner sc = new Scanner(System.in);
    int kodUzunlugu;
    protected void smsGonder(){
        System.out.print("Lütfen Telefon Numarası Giriniz (5xxxxxxxxx) : ");
        String tel = sc.nextLine();
        System.out.println("Girmiş Olduğunuz 0"+tel+" nolu numaraya doğrulama sms'i gönderilmiştir.");
        System.out.print("Müşteri Telefonuna Gitmiş Olan 6 Haneli Kodu Giriniz: ");
        do {
            String kod = sc.nextLine();
            kodUzunlugu = kod.length();
            if (kodUzunlugu<6 | kodUzunlugu>6){
                System.out.println("Girdiğiniz Kod 6 Haneli Olmalıdır.");
                System.out.print("Müşteri Telefonuna İletilmiş Olan 6 Haneli Kodu Giriniz: ");
            }
            else{
                System.out.println("Kod Girişi Başarılı...");
            }
        }while (kodUzunlugu!=6);
    }
    protected void mobilBildirim(){
        System.out.println("Mobil Bildirim Gönderilmiştir.");
    }
}
