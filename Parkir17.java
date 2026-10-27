import java.util.Scanner;
public class Parkir17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0, tarif1 = 3000, tarif2 = 2000;

        System.out.println("Jenis Kendaraan");
        System.out.println("0. Keluar");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.print("Masukkan jenis kendaraan (0/1/2): ");
        jenis = sc.nextInt(); 

        do {
          if (jenis == 1) {
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();
            total = durasi * tarif1;
            System.out.println("Tarif parkir: Rp " + total);
         } else if (jenis == 2) {
            System.out.print("Masukkan durasi parkir (dalam jam): ");
            durasi = sc.nextInt();
            total = durasi * tarif2;
            System.out.println("Tarif parkir: Rp " + total);
         } else {
            System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
         }

             System.out.print("Masukkan jenis kendaraan (0/1/2): ");
             jenis = sc.nextInt(); 

        } while (jenis != 0);   

     sc.close();
    }
}
