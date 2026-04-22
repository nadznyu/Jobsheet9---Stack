# Jobsheet9---Stack

***Pertanyaan 2.1.3***
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
   hasil percobaan! Bagian mana yang perlu diperbaiki?
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode 
   programnya!
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut 
   dihapus, apa dampaknya?
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga 
   dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, 
   serta tambahkan operasi menunya!
6. Commit dan push kode program ke Github.

***Jawaban Pertanyaan 2.1.3***
1. Terdapat perbaikan di class StackTugasMahasiswa16:
   - Bug push() = kondisi isFull() kebalik
   - Method print() = harus cetak dari top ke bawah (bukan dari bawah ke atas)
   sudah di commit.
2. Stack dapat menampung 5 data tugas Mahasiswa. Hal ini ditentukan saat instansiasi object
   **StackTugasMahasiswa16 stack = new StackTugasMahasiswa16(5);**
   kemudian nilai 5 ini diteruskan ke konstruktor StackTugasMahasiswa, lalu digunakan untuk membuat array:
   public StackTugasMahasiswa16(int size) {
        this.size = size;
        stack = new Mahasiswa16[size];
        top = -1;
   }
3. - Pengecekan !isFull diperlukan untuk mencegah ArrayIndexOutOfBoundsException, yaitu error yang 
     terjadi jika data melebihi kapasitas array.
   - Dampak jika if-else dihapus:
     - Ketika Stack sudah penuh (top == -1), program akan tetap melakukan top++ sehingga top menjadi 
       sama dengan size
     - Akses stack[top] akan melampaui batas array -> program pun akan langsung crash dengan error 
       ArrayIndexOutOfBoundsException.

