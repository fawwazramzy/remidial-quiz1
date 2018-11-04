
public class Nomorbis {
    private String nomorbis;
    private Jamaah jamaah;
    private Jadwal jadwal;

    public Jadwal getJadwal() {
        return jadwal;
    }

    public void setJadwal(Jadwal jadwal) {
        this.jadwal = jadwal;
    }
    
    public Nomorbis(String nomorbis){
        this.nomorbis = nomorbis;
    }

    public String getNomorbis() {
        return nomorbis;
    }

    public void setNomorbis(String nomorbis) {
        this.nomorbis = nomorbis;
    }

    public Jamaah getJamaah() {
        return jamaah;
    }

    public void setJamaah(Jamaah jamaah) {
        this.jamaah = jamaah;
    }
    public String info() {
    String info = "";
    info += "Nomor Bis: " + nomorbis + "\n";   
    if (this.jamaah != null) {
    info += "Penumpang: " + jamaah.info() + "\n";
    }
    if (this.jadwal != null) {
    info += jadwal.info() + "\n";
    }
    return info; }
    
}

