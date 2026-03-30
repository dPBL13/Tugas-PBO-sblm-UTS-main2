public class Masinis extends Petugas {

    public Masinis(String idPetugas, String nama) {
        super(idPetugas, nama);
    }

    // Override method kerja() dari abstract class Petugas
    @Override
    public void kerja() {
        System.out.println("Masinis " + getNama() + " sedang mengemudikan kereta.");
    }
}
