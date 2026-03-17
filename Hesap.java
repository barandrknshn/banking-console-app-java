import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hesap {
    Scanner sc = new Scanner(System.in);
    Bakiye toplammiktar = new Bakiye();
    int islem2,h,iban,bildirimsecimi,TCuzunluk;
    float faizOrani;
    //String TC;
    ArrayList<String> list=new ArrayList<String>();
    List<Hesap1> Musteriler=new ArrayList<>();
    List<Hesap1> hesaplar =new ArrayList<>();
    Hesap1 hesap1 = new Hesap1();

    //Hesap1 musteri= new Hesap1();
    Bildirim bildirim = new Bildirim();

    public void TarihSaat(){

        LocalDateTime gunSaat = LocalDateTime.now();
        DateTimeFormatter gun_Saat= DateTimeFormatter.ofPattern("dd.MM.yyyy & HH:mm");
        String duzenliTarihGun = gunSaat.format(gun_Saat);
        System.out.println("\nSistem Tarihi Ve Saati\t"+duzenliTarihGun);
        System.out.println();
    }

    public void Giris(){
        //System.out.println("GARANTİ BBVA BANKACILIK İŞLEMLERİNE HOSGELDİNİZ\n");
        //System.out.println("İşlem Yapmak İstediğiniz Müşterinin TC'sini Giriniz");
        //TC = sc.nextLine();

        System.out.println("Müşteri Onayı İçin Hangi Doğrulama Yöntemini Seçmek İstersiniz?\n1.SMS Gönder\n2.Mobil Bildirim Gönder");

        bildirimsecimi= sc.nextInt();
        switch (bildirimsecimi){
            case 1:
                bildirim.smsGonder();
                break;
            case 2:
                bildirim.mobilBildirim();
                break;
        }
    }
    public void Menu(){
        System.out.println("LUTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİN NUMARASINI GİRİNİZ");
        System.out.println("\n1.Müşteri Ekleme\n2.Müşteri Listeleme\n3.Hesap Oluşturma\n4.Hesap Listeleme\n5.Para Yatırma\n6.Para Çekme\n7.Ödeme İste\n8.Faiz Getirisi Hesaplama\n9.Döviz Hesaplama\n10.Çıkış");
    }
    public void MusteriEkleme(){
        System.out.println("Müşteri Adı Soyadı: ");
        String adsoyad = sc.next();
        hesap1.setAdsoyad(adsoyad);
        do {
            System.out.println("Müşteri TC'si: ");
            String TC =sc.next();
            TCuzunluk = TC.length();
            if(TCuzunluk<11 | TCuzunluk>11){
                System.out.println("Girmiş Olduğunuz TC Kimlik No Hatalıdır.\n");
            }
            else {
                hesap1.setTC(TC);
            }
        }while (TCuzunluk!=11);

        System.out.println("Müşteri Doğum Yeri: ");
        String dogumYeri = sc.next();
        hesap1.setDogumYeri(dogumYeri);

        System.out.println("Müşteri Doğum Tarihi (gg.aa.yy): ");
        String dogumTarihi = sc.next();
        hesap1.setDogumTarihi(dogumTarihi);

        Musteriler.add(hesap1);

        System.out.println("Müşteriniz Başarı İle Eklenmiştir.");
    }
    public void MusteriListeleme(){
        System.out.println("Eklediğiniz Müşteri Sayısı: "+Musteriler.size());
        System.out.println("Müşteri Listesi\nTC   |   DOĞUM YERİ   |   DOĞUM TARİHİ   |   AD SOYAD");
        System.out.println(hesap1.getTC()+"   |   "+hesap1.getDogumYeri()+"   |   "+hesap1.getDogumTarihi()+"   |   "+hesap1.getAdsoyad());
    }
    public void HesapEkleme(){

        System.out.println("Hesap Numarası: ");
        String hesapNumarasi = sc.nextLine();
        hesap1.setHesapNumarasi(hesapNumarasi);

        System.out.print("Şube Kodu: ");
        int subeKodu = sc.nextInt();
        hesap1.setSubeKodu(subeKodu);

        System.out.println("Hesap Sahibinin Adı Soyadı: ");
        String hesapSahibi = sc.next();
        hesap1.setHesapSahibi(hesapSahibi);

        do {
            System.out.println("Hesap Sahibinin TC'si: ");
            String TC =sc.next();
            TCuzunluk = TC.length();
            if(TCuzunluk<11 | TCuzunluk>11){
                System.out.println("Girmiş Olduğunuz TC Kimlik No Hatalıdır.\n");
            }
            else {
                hesap1.setTC(TC);
            }
        }while (TCuzunluk!=11);

        hesaplar.add(hesap1);

        System.out.println("Lütfen Açmak İstediğiniz Hesap Türünün Numarasını Seçiniz");
        System.out.println("1.Türk Lirası\n2.Dolar\n3.Euro\n4.Sterlin\n5.Altın");
        islem2 = sc.nextInt();

        if (islem2 == 1) {
            System.out.println("Müşteriye Ait Türk Lirası Hesabı Açılmıştır.");
            list.add("Türk Lirası hesabınız bulunmaktadır");

        } else if (islem2 == 2) {
            System.out.println("Müşteriye Ait Dolar Hesabı Açılmıştır.");
            list.add("Dolar hesabınız bulunmaktadır");

        } else if (islem2 == 3) {
            System.out.println("Müşteriye Ait Euro Hesabı Açılmıştır.");
            list.add("Euro hesabınız bulunmaktadır");

        } else if (islem2 == 4) {
            System.out.println("Müşteriye Ait Sterlin Hesabı Açılmıştır.");
            list.add("Sterlin hesabınız bulunmaktadır");

        } else if (islem2 == 5) {
            System.out.println("Müşteriye Ait Altın Hesabı Açılmıştır.");
            list.add("Altın hesabınız bulunmaktadır");
        }
        else {
            System.out.println("Hatalı Tuşlama Yaptınız!");
        }
    }
    public void HesapListeleme(){
        System.out.println("Hesap Numarası: "+hesap1.getHesapNumarasi());
        System.out.println("Hesap Sahibi: "+hesap1.getHesapSahibi());
        System.out.println("Şube Kodu: "+hesap1.getSubeKodu());

        for(h=0;h<list.size();h++) {
        System.out.println(list.get(h));
        }
    }
    public void ParaYatirma(){
        System.out.println("Hesaba Yatırmak İstenen Miktar (Lütfen Sadece 10'un Katlarını Giriniz):  ");
        toplammiktar.BulunanPara = sc.nextInt();
        System.out.println("İşleminiz Başarı İle Gerçekleşmiştir. Bakiyeniz : "+ toplammiktar.bak1ye());
    }
    public void ParaCekme(){
        System.out.println("Hesaptan Çekmek İstenen Miktar (Lütfen Sadece 10'un Katlarını Giriniz):  ");
        toplammiktar.BulunanPara = sc.nextInt();
        System.out.println("İşleminiz Başarı İle Gerçekleşmiştir.");
    }
    public void OdemeIste(){
        System.out.println("Ödeme İsteyeceğiniz Müşterinin İbanı: ");
        System.out.print("TR");
        iban = sc.nextInt();
        System.out.println("Girmiş Olduğunuz İbana Ödeme İsteği Gönderilmiştir.");
    }
    public void vadeHesaplama (){
        System.out.println("Faiz Hesaplamak İstediğiniz Tutarı Giriniz : ");
        int paraMiktari = sc.nextInt();
        hesap1.setParaMiktari(paraMiktari);
        System.out.println("Vade (Gün) Giriniz : ");
        int vade = sc.nextInt();
        hesap1.setVade(vade);
        if (vade < 32){
            faizOrani = (float)(paraMiktari*(1.27));
            System.out.println(vade+" günlük %27 faiz oranıyla "+vade+" gün sonunda bakiyeniz : "+faizOrani+" TL'dir.");
        }
        if (vade >= 32){
            faizOrani = (float)(paraMiktari*(1.32));
            System.out.println(vade+" günlük %32 faiz oranıyla "+vade+" gün sonunda bakiyeniz : "+faizOrani+" TL'dir.");
        }
        else if (vade <= 0) {
            System.out.println("Lütfen Geçerli Bir Vade (Gün) Giriniz");
        }
    }
    public void dovizHesaplama(){

    }
}
