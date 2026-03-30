public class Tiket {
    private String idTiket;
    private double harga;
    private Jadwal jadwal;
    private Pembayaran pembayaran;

    public Tiket(String idTiket, double harga, Jadwal jadwal, Pembayaran pembayaran) {
        // Assertion: harga tidak boleh negatif
        assert harga >= 0 : "Harga tiket tidak boleh negatif";
        // Exception: idTiket tidak boleh null atau kosong
        if (idTiket == null || idTiket.isEmpty()) {
            throw new IllegalArgumentException("ID Tiket tidak boleh kosong");
        }
        this.idTiket = idTiket;
        this.harga = harga;
        this.jadwal = jadwal;
        this.pembayaran = pembayaran;
    }

    // Overloading method hitungHarga
    public double hitungHarga() {
        return harga;
    }

    public double hitungHarga(double diskon) {
        // Exception: diskon harus antara 0 dan 1
        if (diskon < 0 || diskon > 1) {
            throw new IllegalArgumentException("Diskon harus bernilai antara 0.0 dan 1.0");
        }
        return harga - (harga * diskon);
    }

    public void bayarTiket() {
        pembayaran.bayar(harga);
    }

    public String getIdTiket() {
        return idTiket;
    }

    public double getHarga() {
        return harga;
    }

    public Jadwal getJadwal() {
        return jadwal;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setIdTiket(String idTiket) {
        if (idTiket == null || idTiket.isEmpty()) {
            throw new IllegalArgumentException("ID Tiket tidak boleh kosong");
        }
        this.idTiket = idTiket;
    }
    
    public void setHarga(double harga) {
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.harga = harga;
    }
    
    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    
    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }
}