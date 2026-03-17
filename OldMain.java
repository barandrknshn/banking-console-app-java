import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String TC;
        System.out.println("GARANTİ BBVA BANKACILIK İŞLEMLERİNE HOSGELDİNİZ\n");
        System.out.println("İşlem Yapmak İstediğiniz Müşterinin TC'sini Giriniz");
        Scanner sc = new Scanner(System.in);
        TC = sc.nextLine();
        int islem, islem2, miktar, iban;

        System.out.println("LUTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİN NUMARASINI GİRİNİZ");
        System.out.println("1.Müşteri Ekleme\n2.Hesap Oluşturma\n3.Hesap Listeleme\n4.Para Yatırma\n5.Para Çekme\n6.Ödeme İste\n7.Çıkış");
        do {
            System.out.println("Ana Menüye Yönlendiriliyorsunuz.\n1.Müşteri Ekleme\n2.Hesap Oluşturma\n3.Hesap Listeleme\n4.Para Yatırma\n5.Para Çekme\n6.Ödeme İste\n7.Çıkış");

            islem = sc.nextInt();


            switch (islem) {
                case 1:
                    System.out.println("Müşteri Adı Soyadı :");
                    String adsoyad = sc.next();
                    System.out.println("Müşteriniz Başarı İle Eklenmiştir.");
                    break;
                case 2:
                    System.out.println("Lütfen Açmak İstediğiniz Hesap Türünün Numarasını Seçiniz");
                    System.out.println("1.Türk Lirası\n2.Dolar\n3.Euro\n4.Sterlin\n5.Altın");
                    islem2 = sc.nextInt();

                    if (islem2 == 1) {
                        System.out.print("" + TC);
                        System.out.println(" TC Kimlik Numaralı Müşteriye Ait Türk Lirası Hesabı Açılmıştır.");

                    } else if (islem2 == 2) {
                        System.out.print("" + TC);
                        System.out.println(" TC Kimlik Numaralı Müşteriye Ait Dolar Hesabı Açılmıştır.");

                    } else if (islem2 == 3) {
                        System.out.print("" + TC);
                        System.out.println(" TC Kimlik Numaralı Müşteriye Ait Euro Hesabı Açılmıştır.");

                    } else if (islem2 == 4) {
                        System.out.print("" + TC);
                        System.out.println(" TC Kimlik Numaralı Müşteriye Ait Sterlin Hesabı Açılmıştır.");

                    } else if (islem2 == 5) {
                        System.out.print("" + TC);
                        System.out.println(" TC Kimlik Numaralı Müşteriye Ait Altın Hesabı Açılmıştır.");
                    }
                    else {
                        System.out.println("Hatalı Tuşlama Yaptınız!");
                    }

                case 3:


                    break;

                case 4:
                    System.out.println("Hesaba Yatırmak İstenen Miktar (Lütfen Sadece 10'un Katlarını Giriniz):  ");
                    miktar = sc.nextInt();
                    System.out.println("İşleminiz Başarı İle Gerçekleşmiştir.");
                    break;
                case 5:
                    System.out.println("Hesaptan Çekmek İstenen Miktar (Lütfen Sadece 10'un Katlarını Giriniz):  ");
                    miktar = sc.nextInt();
                    System.out.println("İşleminiz Başarı İle Gerçekleşmiştir.");
                    break;
                case 6:
                    System.out.println("Ödeme İsteyeceğiniz Müşterinin İbanı: ");
                    iban = sc.nextInt();
                    System.out.println("Girmiş Olduğunuz İbana Ödeme İsteği Gönderilmiştir.");
                    break;
                case 7:
                    System.out.println("Başarı İle Çıkış Yaptınız.");
                    break;
                default:
                    System.out.println("Hatalı Tuşlama Yaptınız!");
                    break;
            }
        }while (islem != 7);

    }
}
