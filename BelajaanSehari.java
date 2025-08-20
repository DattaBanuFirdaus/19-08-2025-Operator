import java.util.Scanner;

public class BelajaanSehari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Barang 1 :");
        String barang = input.nextLine();

        System.out.println("Masukkan Harga " + barang + ":");
        int hargaBarang1 = input.nextInt();

        System.out.println("Masukkan Jumlah " + barang + ":");
        int jumlahBarang1 = input.nextInt();

        int totalHargaBarang1 = hargaBarang1 * jumlahBarang1;
        System.out.println("total : " + totalHargaBarang1);

        System.out.println("pembayaran");
        int pembayaran = input.nextInt();

        int kembalian = pembayaran - totalHargaBarang1;
        System.out.println("kembalian : " + kembalian);
    }
}
