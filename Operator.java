import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Bilangan 1");
        int bil1 = input.nextInt();
        System.out.println("Masukkan Bilangan 2");
        int bil2 = input.nextInt();

        int jumlah = bil1+bil2;
        int kurang = bil1-bil2;
        int kali = bil1*bil2;
        int bagi = bil1/bil2;
        int sisa = bil1%bil2;

        System.out.println("Bilangan 1 " + bil1);
        System.out.println("Bilangan 2 " + bil2);
        System.out.println("Hasil Penjumlahan Kedua Bilangan " + jumlah);
        System.out.println("Hasil Pengurangan Kedua Bilangan " + kurang);
        System.out.println("Hasil Perkalian Kedua Bilangan " + kali);
        System.out.println("Hasil Pembagian Kedua Bilangan " + bagi);
        System.out.println("Hasil Modulu Kedua Bilangan " + sisa);
    }
    
}
