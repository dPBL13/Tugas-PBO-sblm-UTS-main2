public class EWallet implements Pembayaran {
    private double saldo;
    private String namaPemilik;

    public EWallet(String namaPemilik, double saldo) {
        // Assertion: saldo awal tidak boleh negatif
        assert saldo >= 0 : "Saldo awal tidak boleh negatif";
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    //method bayar() dari interface Pembayaran
    @Override
    public void bayar(double jumlah) {
        // Exception jika jumlah pembayaran tidak valid
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah pembayaran harus lebih dari 0");
        }
        // Exception jika saldo tidak mencukupi
        if (jumlah > saldo) {
            throw new IllegalStateException("Saldo tidak mencukupi. Saldo saat ini: " + saldo);
        }
        saldo -= jumlah;
        System.out.println(namaPemilik + " berhasil membayar Rp" + jumlah + ". Sisa saldo: Rp" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }
    
    public void setSaldo(double saldo) {
    if (saldo < 0) {
        throw new IllegalArgumentException("Saldo tidak boleh negatif");
    }
    this.saldo = saldo;
    }

    public void setNamaPemilik(String namaPemilik) {
        if (namaPemilik == null || namaPemilik.isEmpty()) {
            throw new IllegalArgumentException("Nama pemilik tidak boleh kosong");
        }
        this.namaPemilik = namaPemilik;
    }
}
