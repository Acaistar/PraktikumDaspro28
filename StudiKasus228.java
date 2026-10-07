import java.util.Scanner;
public class StudiKasus228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlDokumenYgDiupload, peringkat, statusPKM, kurang;

        System.out.println("---Validasi Kelengkapan dokumen Prestasi Mahasiswa Tahun Kegiatan 2026 Tahap 1---");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.println("Jenis Kegiatan: ");
        System.out.println("BELMAWA,BAKORMA,MANDIRI,PKM,atau Lainnya");
        String jenisKegiatan = sc.nextLine();
        
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")){
            System.out.print("Masukkan jumlah dokumen yang diupload: ");
            jmlDokumenYgDiupload = sc.nextInt(); sc.nextLine();
            
            System.out.print("Masukkan peringkat yang diperoleh: ");
            peringkat = sc.nextInt(); sc.nextLine();
            if (peringkat >= 1 && peringkat <= 3) {
                if (jmlDokumenYgDiupload >= 4) {
                    System.out.println("Selamat " + nama + ", anda lolos pendanaan, dokumen prestasi Anda lengkap dan memenuhi syarat.");
                } else {
                    System.out.println("Maaf " + nama + ", dokumen prestasi Anda tidak lengkap atau tidak memenuhi syarat.");
                }
            } else {
                System.out.println("Anda hanya peraih juara 1,2,3 yang dapat lolos pendanaan. Silakan periksa kembali peringkat Anda.");
            }
        } 
         else {
            System.out.println("Jenis kegiatan tidak valid. Silakan masukkan salah satu dari BELMAWA, BAKORMA, MANDIRI, PKM.");
        }
        
        sc.close();
    }
}