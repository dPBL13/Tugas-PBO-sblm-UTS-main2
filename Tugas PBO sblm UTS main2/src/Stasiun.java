public class Stasiun {
    private String kodeStasiun;
    private String namaStasiun;
    private Kota kota;

    public Stasiun(String kodeStasiun, String namaStasiun, Kota kota) {
        this.kodeStasiun = kodeStasiun;
        this.namaStasiun = namaStasiun;
        this.kota = kota;
    }

    public void cekJadwal() {
        System.out.println("Cek jadwal di stasiun " + namaStasiun);
    }

    public String getKodeStasiun() {
        return kodeStasiun;
    }

    public String getNamaStasiun() {
        return namaStasiun;
    }

    public Kota getKota(){
        return kota;
    }

    public void setKodeStasiun(String kodeStasiun) {
        this.kodeStasiun = kodeStasiun;
    }
    
    public void setNamaStasiun(String namaStasiun) {
        this.namaStasiun = namaStasiun;
    }
    
    public void setKota(Kota kota) {
        this.kota = kota;
    }
}