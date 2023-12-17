// Vücut Kitle İndeksi Hesaplama :

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.print("Vücut Kitle İndeksiniz : " + indeks);

    }
}
