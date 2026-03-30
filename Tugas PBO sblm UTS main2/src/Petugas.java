public abstract class Petugas {
    private String idPetugas;
    private String nama;

    public Petugas(String idPetugas, String nama) {
        // Assertion: idPetugas dan nama tidak boleh null atau kosong
        assert idPetugas != null && !idPetugas.isEmpty() : "ID Petugas tidak boleh kosong";
        assert nama != null && !nama.isEmpty() : "Nama petugas tidak boleh kosong";
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    // Abstract method yang wajib di-override oleh subclass
    public abstract void kerja();

    public String getIdPetugas() {
        return idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setIdPetugas(String idPetugas) {
        if (idPetugas == null || idPetugas.isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        this.idPetugas = idPetugas;
    }
    
    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
}
