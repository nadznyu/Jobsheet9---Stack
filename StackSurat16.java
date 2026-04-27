public class StackSurat16 {
    public Surat16[] stack;
    public int top;
    public int kapasitas;

    public StackSurat16(int kapasitas) {
        this.kapasitas = kapasitas;
        this.stack = new Surat16[kapasitas];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == kapasitas - 1;
    }

    public boolean push(Surat16 surat) {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak dapat menambah surat.");
            return false;
        }
        stack[++top] = surat;
        System.out.println("Surat berhasil ditambahkan ke stack.");
        return true;
    }

    public Surat16 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat yang diproses.");
            return null;
        }
        Surat16 surat = stack[top];
        stack[top--] = null;
        return surat;
    }

    public Surat16 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
            return null;
        }
        return stack[top];
    }

    public boolean cariSurat(String nama) {
        boolean ditemukan = false;
        System.out.println("\n=== Hasil Pencarian Surat untuk: " + nama + " ===");
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                System.out.println("\nSurat ditemukan di posisi ke-" + (i + 1) + ": ");
                System.out.println(stack[i].toString());
                System.out.println("-----------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
        return ditemukan;
    }
}
