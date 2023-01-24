package clases;

public class Vehicle2 {

    private String marca;
    private String model;
    private int anycompra;
    private float consum;
    private String prov_matr;			//nous parametres de matricula
    private int num_matr;
    private String lletres_matr;


    /*
     *
     * Constructor de la clase vehicle
     */
    public Vehicle2(String fabricant, String mod, int any, String prov_matr,
                    int num_matr, String lletres_matr, float consum) {

        this.marca = fabricant;
        this.model = mod;
        this.anycompra = any;
        this.consum = consum;

    }

    public static float autonomia(float carburant) { // metode calcul autonomia
        // del vehicle

        float consumoKilometro = 5.6f;
        float kilometres = carburant / consumoKilometro;
        return kilometres;
    }

    /*
     * Getters i setters de la clase vehicle
     */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnycompra() {
        return anycompra;
    }

    public void setAnycompra(int anycompra) {
        this.anycompra = anycompra;
    }

    public float getConsum() {
        return consum;
    }

    public void setConsum(float consum) {
        this.consum = consum;
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
