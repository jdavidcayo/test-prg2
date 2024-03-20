public class Camioneta extends Coche{
    private float carga;

    public Camioneta(){};

    public Camioneta(float carga) {
        this.carga = carga;
    }

    public Camioneta(int velocidad, int cilindrada, String color, int ruedas, float carga) {
        super(velocidad, cilindrada, color, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }
}
