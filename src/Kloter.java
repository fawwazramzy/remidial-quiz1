

public class Kloter {
    private String kode;
    private Nomorbis[] arrayNomorbis;
    
    public Kloter(String kode, int total){
        this.kode = kode;
        this.arrayNomorbis = new Nomorbis[total];
        this.initNomorbis();
    
    }
    private void initNomorbis(){
        for (int i = 0; i < arrayNomorbis.length; i++) {
            this.arrayNomorbis[i] = new Nomorbis (String.valueOf(i + 1));
        }
    }  
        
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public Nomorbis[] getArrayNomorbis() {
        return arrayNomorbis;
    }

    public void setArrayNomorbis(Nomorbis[] arrayNomorbis) {
        this.arrayNomorbis = arrayNomorbis;
    }
    
    public void setJamaah(Jamaah jamaah, Jadwal jadwal ,int nomer) {
        this.arrayNomorbis[nomer - 1].setJamaah(jamaah);
        this.arrayNomorbis[nomer - 1].setJadwal(jadwal);
    }
    
    public String info() {
        String info = "";
        info += "Nomer Kloter: " + kode + "\n";
            for (Nomorbis nomor  : arrayNomorbis) {
             info += nomor.info();
            }
        return info; 
    }
    
    
}
