import java.util.Scanner;

public class KasaProgram {
    public static void main(String[] args) {
        double Armut=2.14,armutkg,Elma=3.67,elmakg,Domates=1.11,domateskg,Muz=0.95,muzkg,Patlican=5.00,patlicankg;



        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo ?:" );
        armutkg = input.nextDouble();

        System.out.print("Elma kaç kilo ?:" );
        elmakg = input.nextDouble();

        System.out.print("Domates kaç kilo ?:" );
        domateskg = input.nextDouble();

        System.out.print("Muz kaç kilo ?:" );
        muzkg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ?:" );
        patlicankg = input.nextDouble();

        double armutToplam = Armut * armutkg;
        double elmaToplam = Elma * elmakg;
        double domatesToplam = Domates * domateskg;
        double muzToplam = Muz * muzkg;
        double patlicanToplam = Patlican * patlicankg;


        double toplam = (armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam);


        System.out.println("Toplam Tutar : " + toplam + "TL");

    }
}
