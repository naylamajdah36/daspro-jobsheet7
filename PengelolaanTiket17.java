import java. util. Scanner;
public class PengelolaanTiket17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //deklarasi variabel
        final int harga = 50000;
        int jumlah, totalTiket = 0;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi!");
                continue;
            }
            if (jumlah == 0) {
                break;
            }

            double total = jumlah * harga;
            if (jumlah > 10) {
                total = total * 0.85;       // diskon 15% (100% - 15% = 85%)
            } else if (jumlah > 4) {
                total = total * 0.90;       // diskon 10% (100% - 10% = 90%)
            }

            totalTiket += jumlah;
            totalPenjualan += total;
            System.out.println("Total bayar: Rp " + total);
        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}