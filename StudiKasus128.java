import java.util.Scanner;
public class StudiKasus128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaPerCup=18000;
        int totalHarga, diskon, totalBayar;
        int kembalian,kurang;

        System.out.println("---Masukkan Total Orderan---");
        System.out.print("Masukkan jumlah cup yang dipesan: ");
        int jumlahCup = sc.nextInt(); sc.nextLine();
        System.out.print("Masukkan uang yang dibayarkan: ");
        int uangBayar = sc.nextInt(); sc.nextLine()
        
        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total Bayar: " + totalBayar);
        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang RP " + kurang);
        }
        sc.close();
    }
}