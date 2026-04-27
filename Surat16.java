public class Surat16 {
    public String idSurat;
    public String namaMhs;
    public String kelas;
    public char jenisIzin;
    public int durasi;

    public Surat16() {
        this.idSurat = " ";
        this.namaMhs = " ";
        this.kelas = " ";
        this.jenisIzin = 'S';
        this.durasi = 0;
    }

    public Surat16(String idSurat, String namaMhs, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public String getJenisIzinTeks() {
        return (jenisIzin == 'S' || jenisIzin == 's') ? "Sakit" : "Izin Keperluan Lain";
    }

    public String toString() {
        return "ID Surat    : " + idSurat +
                "\nNama        : " + namaMhs +
                "\nKelas       : " + kelas +
                "\nJenis Izin  : " + jenisIzin + " (" + getJenisIzinTeks() + ") " +
                "\nDurasi      : " + durasi + " hari";
    }
}
