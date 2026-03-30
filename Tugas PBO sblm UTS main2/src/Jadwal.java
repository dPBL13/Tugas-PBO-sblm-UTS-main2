public class Jadwal {
    private String jamDatang;
    private String jamBerangkat;
    private Kereta kereta;
    private Stasiun stasiun;

    public Jadwal(String jamDatang, String jamBerangkat, Kereta kereta, Stasiun stasiun) {
        this.jamDatang = jamDatang;
        this.jamBerangkat = jamBerangkat;
        this.kereta = kereta;
        this.stasiun = stasiun;
    }

    public void tampilJadwal() {
        System.out.println("Jam Datang: " + jamDatang);
        System.out.println("Jam Berangkat: " + jamBerangkat);
    }

    public String getJamDatang() {
        return jamDatang;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public Kereta getKereta() {
        return kereta;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setJamDatang(String jamDatang) {
        this.jamDatang = jamDatang;
    }
    
    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }
    
    public void setKereta(Kereta kereta) {
        this.kereta = kereta;
    }
    
    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

}