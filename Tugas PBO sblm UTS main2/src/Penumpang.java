public class Penumpang {
    private String idPenumpang;
    private String nama;
    private String noTelphone;
    private String email;

    public Penumpang(String idPenumpang, String nama) {
        // Exception: parameter tidak boleh null atau kosong
        if (idPenumpang == null || idPenumpang.isEmpty()) {
            throw new IllegalArgumentException("ID Penumpang tidak boleh kosong");
        }
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama penumpang tidak boleh kosong");
        }
        this.idPenumpang = idPenumpang;
        this.nama = nama;
    }

    public void pesanTiket(Tiket tiket) {
        System.out.println(nama + " memesan tiket dengan ID: " + tiket.getIdTiket());
    }

    public String getIdPenumpang() {
        return idPenumpang;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelphone() {
        return noTelphone;
    }

    public String getEmail() {
        return email;
    }

    public void setIdPenumpang(String idPenumpang) {
        if (idPenumpang == null || idPenumpang.isEmpty()) {
            throw new IllegalArgumentException("ID tidak boleh kosong");
        }
        this.idPenumpang = idPenumpang;
    }
    
    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }
    
    public void setNoTelphone(String noTelphone) {
        this.noTelphone = noTelphone;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
}