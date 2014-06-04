package dades;

/**
 *
 * @author Rafel Sastre.
 */
public class Preferencia implements Comparable<Preferencia> {

    private int ordre;
    private String plat;

    public Preferencia(int ordre, String plat) {
        super();
        this.ordre = ordre;
        this.plat = plat;
    }

    public Preferencia(String garrova) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    @Override
    public int compareTo(Preferencia b) {
        if (this.ordre < b.ordre) {
            return 1;
        } else if (this.ordre == b.ordre) {
            return 0;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Preferencia [ordre = " + ordre + ", plat = " + plat + "]";
    }

    public String getXML() {
        return "<Preferencia><ordre>" + ordre + "</ordre><plat>" + plat + "</plat></Preferencia>";
    }
}
