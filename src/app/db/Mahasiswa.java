package app.db;

public class Mahasiswa {

    private String NoBP;
    private String Nama;
    private String TmpLahir;
    private String TglLahir;
    private String Alamat;
    private String Phone;
    private String AsalSekolah;

    public Mahasiswa() {

    }

    public String getasalsekolah() {
        return AsalSekolah;
    }

    public void setasalsekolah(String asalsekolah) {
        this.AsalSekolah = asalsekolah;
    }

    public String getphone() {
        return Phone;
    }

    public void setphone(String phone) {
        this.Phone = phone;
    }

    public String getalamat() {
        return Alamat;
    }

    public void setalamat(String alamat) {
        this.Alamat = alamat;
    }

    public String gettgllahir() {
        return TglLahir;
    }

    public void settgllahir(String tgllahir) {
        this.TglLahir = tgllahir;
    }

    public String gettmplahir() {
        return TmpLahir;
    }

    public void settmplahir(String tmplahir) {
        this.TmpLahir = tmplahir;
    }

    public String getnama() {
        return Nama;
    }

    public void setnama(String nama) {
        this.Nama = nama;
    }

    public String getnobp() {
        return NoBP;
    }

    public void setnobp(String nobp) {
        this.NoBP = nobp;
    }

}

