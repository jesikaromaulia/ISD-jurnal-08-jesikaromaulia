import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MahasiswaHashMap mahasiswaMap = new MahasiswaHashMap();
        Scanner jes = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Simpan Nilai Mahasiswa");
            System.out.println("4. Tampilkan Nilai Mahasiswa dan Rata-rata");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilihan = jes.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = jes.next();
                    System.out.print("Kelas: ");
                    String kelas = jes.next();
                    jes.nextLine();
                    System.out.print("Nama: ");
                    String nama = jes.nextLine();
                    mahasiswaMap.addMahasiwa(new Mahasiswa(nim, kelas, nama, 0));
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = jes.next();
                    System.out.print("Kelas: ");
                    kelas = jes.next();
                    mahasiswaMap.removeMahasiswa(nim, kelas);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    nim = jes.next();
                    System.out.print("Kelas: ");
                    kelas = jes.next();
                    System.out.print("Nilai: ");
                    double nilai = jes.nextDouble();
                    mahasiswaMap.simpanNilaiMahasiswa(nim, kelas, nilai);
                    break;
                case 4:
                    mahasiswaMap.tampilkanNilai();
                case 5:
                    System.out.println("Terimakasih!");
                    break;
                case 6:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan != 5);
    }
}
