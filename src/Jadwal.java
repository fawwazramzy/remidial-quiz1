/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iloops
 */
public class Jadwal {
    private String keberangkatan;
    
    public Jadwal (String keberangkatan){
        this.keberangkatan = keberangkatan;
    }

    public String getKeberangkatan() {
        return keberangkatan;
    }

    public void setKeberangkatan(String keberangkatan) {
        this.keberangkatan = keberangkatan;
    }
    public String info() {
        String info = "";
        info += "berangkat: " + keberangkatan + "\n";
        return info;
    }
}
