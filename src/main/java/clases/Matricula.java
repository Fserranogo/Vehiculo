package clases;

public class Matricula {
    private String prov_matr;
    private int num_matr;
    private String lletres_matr;

    /*
     *
     * Constructor de la clase Matricula
     */

    public Matricula(String prov_matr, int num_matr, String lletres_matr) {

        this.prov_matr = prov_matr;
        this.num_matr = num_matr;
        this.lletres_matr = lletres_matr;
    }

    @Override
    public String toString() {
        return "Matricula [prov_matr=" + prov_matr + ", num_matr=" + num_matr
                + ", lletres_matr=" + lletres_matr + "]";
    }

    public String getProv_matr() {
        return prov_matr;
    }

    public void setProv_matr(String prov_matr) {
        this.prov_matr = prov_matr;
    }

    public int getNum_matr() {
        return num_matr;
    }

    public void setNum_matr(int num_matr) {
        this.num_matr = num_matr;
    }

    public String getLletres_matr() {
        return lletres_matr;
    }

    public void setLletres_matr(String lletres_matr) {
        this.lletres_matr = lletres_matr;
    }
}
