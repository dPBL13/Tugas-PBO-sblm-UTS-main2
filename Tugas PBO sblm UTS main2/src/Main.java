// File : Main.java
// Deskripsi : Main class untuk simulasi sistem pemesanan tiket kereta api

public class Main {
    public static void main(String[] args) {
        try {
            // =========================
            // INISIALISASI OBJEK
            // =========================
            Kota kota1 = new Kota("K001", "Jakarta");
            Stasiun stasiun1 = new Stasiun("ST001", "Gambir", kota1);
            Kereta kereta1 = new Kereta("KA001", "Argo Bromo", "Eksekutif");
            Jadwal jadwal1 = new Jadwal("08:00", "08:30", kereta1, stasiun1);
            Penumpang penumpang1 = new Penumpang("P001", "Yogi Saputra");
            EWallet ewallet1 = new EWallet("Yogi", 150000);
            Tiket tiket1 = new Tiket("T001", 100000, jadwal1, ewallet1);
            Masinis masinis1 = new Masinis("PT001", "Budi");

            // =========================
            // DATA PERHITUNGAN
            // =========================
            double diskon = 0.10;
            double hargaAwal = tiket1.getHarga();
            double hargaAkhir = tiket1.hitungHarga(diskon);
            double saldoAwal = ewallet1.getSaldo();

            // pembayaran
            System.out.println("---------------------------------------------------\n");
            System.out.println("Welcome " + ewallet1.getNamaPemilik() + ", Saldo E-Wallet Anda Sebesar Rp" + ewallet1.getSaldo() + "\n .  .  ."); 
            tiket1.bayarTiket();
            double sisaSaldo = ewallet1.getSaldo();

            // =========================
            // OUTPUT
            // =========================
            System.out.println("\n==================================================");
            System.out.println("         DETAIL PEMESANAN TIKET KERETA");
            System.out.println("==================================================");
            System.out.println();

            // DATA PENUMPANG
            System.out.println("[DATA PENUMPANG]");
            System.out.println("ID Penumpang        : " + penumpang1.getIdPenumpang());
            System.out.println("Nama Penumpang      : " + penumpang1.getNama());
            System.out.println();

            // DATA TIKET
            System.out.println("[DATA TIKET]");
            System.out.println("ID Tiket            : " + tiket1.getIdTiket());
            System.out.println("Harga Tiket         : Rp " + String.format("%,.2f", hargaAwal));
            System.out.println("Diskon              : 10%");
            System.out.println("Perhitungan Harga   : Rp " + String.format("%,.2f", hargaAwal)
                    + " - (10% x Rp " + String.format("%,.2f", hargaAwal) + ")");
            System.out.println("Harga Akhir         : Rp " + String.format("%,.2f", hargaAkhir));
            System.out.println();

            // DATA KERETA
            System.out.println("[DATA KERETA]");
            System.out.println("No Kereta           : " + kereta1.getNoKA());
            System.out.println("Nama Kereta         : " + kereta1.getNamaKA());
            System.out.println("Kelas Kereta        : " + kereta1.getKelasKA());
            System.out.println();

            // DATA JADWAL
            System.out.println("[DATA JADWAL]");
            System.out.println("Jam Datang          : " + jadwal1.getJamDatang());
            System.out.println("Jam Berangkat       : " + jadwal1.getJamBerangkat());
            System.out.println();

            // DATA STASIUN
            System.out.println("[DATA STASIUN]");
            System.out.println("Kode Stasiun        : " + stasiun1.getKodeStasiun());
            System.out.println("Nama Stasiun        : " + stasiun1.getNamaStasiun());
            System.out.println();

            // DATA KOTA
            System.out.println("[DATA KOTA]");
            System.out.println("ID Kota             : " + kota1.getIdKota());
            System.out.println("Nama Kota           : " + kota1.getNamaKota());
            System.out.println();

            // DATA PEMBAYARAN
            System.out.println("[DATA PEMBAYARAN]");
            System.out.println("Metode Pembayaran   : E-Wallet");
            System.out.println("Nama Pemilik        : " + ewallet1.getNamaPemilik());
            System.out.println("Saldo Awal          : Rp " + String.format("%,.2f", saldoAwal));
            System.out.println("Jumlah Bayar        : Rp " + String.format("%,.2f", hargaAwal));
            System.out.println("Perhitungan Bayar   : Rp " + String.format("%,.2f", saldoAwal)
                    + " - Rp " + String.format("%,.2f", hargaAwal));
            System.out.println("Sisa Saldo          : Rp " + String.format("%,.2f", sisaSaldo));
            System.out.println("Status Pembayaran   : Berhasil");
            System.out.println();

            // DATA PETUGAS
            System.out.println("[DATA PETUGAS]");
            System.out.println("Jabatan             : Masinis");
            System.out.println("ID Petugas          : " + masinis1.getIdPetugas());
            System.out.println("Nama Petugas        : " + masinis1.getNama());
            System.out.println("Tugas               : Mengemudikan kereta");

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}