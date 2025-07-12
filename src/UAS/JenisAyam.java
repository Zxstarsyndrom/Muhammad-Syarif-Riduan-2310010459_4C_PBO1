package UAS;
// inheritance
public class JenisAyam extends PeternakanAyam {
    
    public JenisAyam(String Ras, String JenisKelamin, int umur) {
        super(Ras, JenisKelamin, umur);
    }
    
    public void seleksiJenisAyam() {
        // Seleksi berdasarkan Ras
        switch (getRas()) {
            case "Petelur" -> {
                System.out.println("Jenis Ayam: Petelur");
                System.out.println("Ayam ini cocok untuk produksi telur.");
            }
            case "Pedaging" -> {
                System.out.println("Jenis Ayam: Pedaging");
                System.out.println("Ayam ini cocok untuk produksi daging.");
            }
            default -> System.out.println("Jenis Ayam: Tidak dikenal");
        }
    }
}

