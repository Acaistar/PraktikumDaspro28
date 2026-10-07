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
        int uangBayar = sc.nextInt(); sc.nextLine();

        sc.close();
    }
}