package clases;

public class Vehicle {

    private String marca;
    private String model;
    private int anycompra;
    private float consum;


    /*
     *
     * Constructor de la clase vehicle
     */
    public Vehicle(String fabricant, String mod, int any, String prov_matr,
                   int num_matr, String lletres_matr, float consum) {

        this.marca = fabricant;
        this.model = mod;
        this.anycompra = any;
        this.consum = consum;

    }

    public Vehicle(String fabricant,String mod, int any){
        this.marca=fabricant;
        this.model = mod;
        this.anycompra = any;
    }

    public static float autonomia(float carburant) { // metode calcul autonomia
        // del vehicle

        float consumoKilometro = 7.0f/100;			//consumo 100 kilometro
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

}
