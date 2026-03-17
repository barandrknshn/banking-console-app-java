import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int islem;
        Scanner sc = new Scanner(System.in);
        Hesap hesapislemleri = new Hesap();
        Dolar dovizcevirici =new Dolar();
        GarantiText garantiText = new GarantiText();

        hesapislemleri.TarihSaat();
        garantiText.Text();

        UygulamaGiris uygulamaGiris = new UygulamaGiris();//("GARANTİ BBVA","444 0 333");
        uygulamaGiris.bilgiGoster();

        hesapislemleri.Giris();


        do {
            hesapislemleri.Menu();
            islem = sc.nextInt();

            switch (islem) {

                case 1:
                    hesapislemleri.MusteriEkleme();
                    break;
                case 2:
                    hesapislemleri.MusteriListeleme();
                    break;
                case 3:
                    hesapislemleri.HesapEkleme();
                    break;
                case 4:
                    hesapislemleri.HesapListeleme();
                    break;
                case 5:
                    hesapislemleri.ParaYatirma();
                    break;
                case 6:
                    hesapislemleri.ParaCekme();
                    break;
                case 7:
                    hesapislemleri.OdemeIste();

                    break;
                case 8:
                    hesapislemleri.vadeHesaplama();
                    break;
                case 9:
                    dovizcevirici.kur();
                    dovizcevirici.dolar();
                    break;
                case 10:
                    System.out.println("Başarı İle Çıkış Yaptınız.");
                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız!\nAna Menüye Yönlendiriliyorsunuz");
                    break;
            }
        }while (islem != 10);

    }

}
