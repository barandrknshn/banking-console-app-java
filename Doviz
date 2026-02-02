import java.util.Scanner;

abstract class Doviz {
    //public abstract void dolar1();
    public void kur() {
        System.out.println("dolar kuru 28.3950 tl dir\nEuro kuru 30.7690 tl dir");

    }
}
class Dolar extends Doviz {
    float miktar;
    Scanner sc = new Scanner(System.in);
    public void dolar() {
        System.out.println("Tl Karşılığını Öğrenmek İstediğiniz Doları Giriniz : ");
        int tutar = sc.nextInt();
        miktar = (float) (tutar*(28.3950));
        System.out.println("Girdiğiniz "+tutar+" Karşılığı "+miktar+" TL'dir.");
    }
}
