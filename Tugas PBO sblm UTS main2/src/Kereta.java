public class Kereta {
    private String noKA;
    private String namaKA;
    private String kelasKA;

    public Kereta(String noKA, String namaKA, String kelasKA) {
        this.noKA = noKA;
        this.namaKA = namaKA;
        this.kelasKA = kelasKA;
    }

    public void ruteTujuan(Stasiun asal, Stasiun tujuan) {
        System.out.println("Kereta " + namaKA + " berangkat dari " + asal.getNamaStasiun() + " ke " + tujuan.getNamaStasiun());
    }

    public String getNoKA() {
        return noKA;
    }

    public String getNamaKA() {
        return namaKA;
    }

    public String getKelasKA() {
        return kelasKA;
    }
    
    public void setNoKA(String noKA) {
        this.noKA = noKA;
    }

    public void setNamaKA(String namaKA) {
        this.namaKA = namaKA;
    }

    public void setKelasKA(String kelasKA) {
        this.kelasKA = kelasKA;
    }
}