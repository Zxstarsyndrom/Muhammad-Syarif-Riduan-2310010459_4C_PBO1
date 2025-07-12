package UAS;
// class 
public class PeternakanAyam {
    // encapsulation dan atribut
    private String Ras, JenisKelamin;
    // encapsulation dan atribut
    private int umur;

    // constructor
    public PeternakanAyam(String Ras, String JenisKelamin, int umur) {
        this.Ras = Ras;
        this.JenisKelamin = JenisKelamin;
        this.umur = umur;
    }
    
    // Mutator (Setter)
    public void setRas(String Ras) {
        this.Ras = Ras;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    //Accessor (Getter)

    public String getRas() {
        return Ras;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public int getUmur() {
        return umur;
    }   
    //Polymorphism 
    public void infoAyam() {
        System.out.println("Informasi Ayam:");
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("Umur: " + umur + " minggu");
    }

}
