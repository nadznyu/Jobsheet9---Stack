import java.util.Scanner;

public class SuratMain16 {
    static Scanner sc = new Scanner(System.in);
    static StackSurat16 StackSurat;

    public static void main(String[] args) {
        int pilihan;

        System.out.println("========================");
        System.out.println(" SISTEM MANAJEMEN SURAT ");
        System.out.println("========================");

        System.out.print("Masukkan jumlah surat diterima: ");
        int kapasitas = sc.nextInt();
        sc.nextLine();
        StackSurat = new StackSurat16(kapasitas);

        do {
            tampiMenu();
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    TerimaSuratIzin();
                    break;
                case 2:
                    prosesSuratIzin();
                    break;
                case 3:
                    lihatSuratIzinTerakhir();
                    break;
                case 4:
                    cariSurat();
                    break;
                case 0:
                    System.out.println("\nProgram selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi");
            }
        } while (pilihan != 0);

        sc.close();

    }

    static void tampiMenu() {
        System.out.println("\n=====================");
        System.out.println("      MENU UTAMA     ");
        System.out.println("=====================");
        System.out.println("1. Terima Surat Izin");
        System.out.println("2. Proses Surat Izin");
        System.out.println("3. Lihat Surat Izin Terakhir");
        System.out.println("4. Cari Surat");
        System.out.println("0. Keluar");
        System.out.println("---------------------");
        System.out.println("Jumlah surat dalam antrian: " + (StackSurat.top + 1));
        System.out.println("---------------------");
    }

    static void TerimaSuratIzin() {
        System.out.println("\n=== TERIMA SURAT IZIN ===");

        Surat16 surat = new Surat16();

        System.out.print("ID Surat        : ");
        surat.idSurat = sc.nextLine();

        System.out.print("Nama Mahasiswa  : ");
        surat.namaMhs = sc.nextLine();

        System.out.print("Kelas           : ");
        surat.kelas = sc.nextLine();

        char jenisIzin = ' ';
        while (jenisIzin != 'S' && jenisIzin != 's' && jenisIzin != 'I' && jenisIzin != 'i') {
            System.out.print("Jenis Izin (S=Sakit / I=Izin Keperluan Lain):   ");
            jenisIzin = sc.nextLine().charAt(0);
            if (jenisIzin != 'S' && jenisIzin != 's' && jenisIzin != 'I' && jenisIzin != 'i') {
                System.out.println("Input tidak valid. Masukkan S atau I.");
            }
        }
        surat.jenisIzin = Character.toUpperCase(jenisIzin);

        System.out.print("Durasi (hari)   : ");
        surat.durasi = sc.nextInt();
        sc.nextLine();

        StackSurat.push(surat);
    }

    static void prosesSuratIzin() {
        System.out.println("\n=== PROSES SURAT IZIN ===");
        Surat16 surat = StackSurat.pop();
        if (surat != null) {
            System.out.print("Surat sedang diproses/divalidasi oleh Admin");
            System.out.println("\n-----------------------------");
            System.out.println(surat.toString());
            System.out.println("-----------------------------");
            System.out.println("Status: DIPROSES");
        }
    }

    static void lihatSuratIzinTerakhir() {
        System.out.println("\n=== SURAT IZIN TERAKHIR ===");
        Surat16 surat = StackSurat.peek();
        if (surat != null) {
            System.out.print("Surat paling atas (terakhir masuk): ");
            System.out.println("\n-----------------------------");
            System.out.println(surat.toString());
            System.out.println("-----------------------------");
        }
    }

    static void cariSurat() {
        System.out.println("\n=== CARI SURAT ===");
        System.out.print("Masukkan nama mahasiswa yang dicari: ");
        String nama = sc.nextLine();
        StackSurat.cariSurat(nama);
    }
}
