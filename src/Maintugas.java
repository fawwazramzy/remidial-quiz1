
public class Maintugas {
    public static void main(String[] args) {
        Jamaah j = new Jamaah ("12345","Fawwaz Ramzy");
        Jadwal s = new Jadwal("Senin, 17 Agustus 2081");
        Kloter kloter = new Kloter("A",10);
        kloter.setJamaah(j, s, 1);
        System.out.println(kloter.info());
    }
    
}
