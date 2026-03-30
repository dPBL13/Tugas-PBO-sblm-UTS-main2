public class Kota {
    private String idKota;
    private String namaKota;

    public Kota(String idKota, String namaKota) {
        this.idKota = idKota;
        this.namaKota = namaKota;
    }

    public String getIdKota() {
        return idKota;
    }

    public String getNamaKota() {
        return namaKota;
    }

    public void setIdKota(String idKota) {
        if (idKota == null || idKota.isEmpty()) {
            throw new IllegalArgumentException("ID Kota tidak boleh kosong");
        }
        this.idKota = idKota;
    }
    
    public void setNamaKota(String namaKota) {
        if (namaKota == null || namaKota.isEmpty()) {
            throw new IllegalArgumentException("Nama kota tidak boleh kosong");
        }
        this.namaKota = namaKota;
    }
}