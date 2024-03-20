import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        Coche auto = new Coche(120, 1000, "rojo", 4);
        listaVehiculos.add(auto);

        Coche camioneta = new Camioneta(120, 1000, "rojo", 4, 2000);
        listaVehiculos.add(camioneta);

        Bicicleta bici = new Bicicleta("azul", 2, "Mountain Bike");
        listaVehiculos.add(bici);

        Bicicleta moto = new Motocicleta("gris", 2, "Enduro", 100, 250);
        listaVehiculos.add(moto);

        catalogar(listaVehiculos);

        catalogar(listaVehiculos, 0);
        catalogar(listaVehiculos, 2);
        catalogar(listaVehiculos, 4);

    }

    //Realiza una función llamada catalogar() que reciba la lista de vehiculos y los
    //recorra mostrando el nombre de su clase y sus atributos.

    public static void catalogar(ArrayList<Vehiculo> lista){
        for ( Vehiculo item : lista){
            if(item instanceof Coche){
                System.out.println("Class:\t\t"+ item.getClass().getName() +
                        "\nColor:\t\t"+ item.getColor()+
                        "\nRuedas:\t\t"+ item.getRuedas() +
                        "\nCilindrada:\t\t" + ((Coche) item).getCilindrada() +
                        "\nVelocidad:\t\t" + ((Coche) item).getVelocidad()
                        );
                System.out.println("\n");
            }
            if(item instanceof Camioneta){
                System.out.println("Class:\t\t"+ item.getClass().getName() +
                        "\nColor:\t\t"+ item.getColor()+
                        "\nRuedas:\t\t"+ item.getRuedas() +
                        "\nCilindrada:\t\t" + ((Camioneta) item).getCilindrada() +
                        "\nVelocidad:\t\t" + ((Camioneta) item).getVelocidad() +
                        "\nCarga:\t\t" + ((Camioneta) item).getCarga()
                );
                System.out.println("\n");
            }
            if(item instanceof Bicicleta){

                System.out.println("Class:\t\t"+ item.getClass().getName() +
                        "\nColor:\t\t"+ item.getColor()+
                        "\nRuedas:\t\t"+ item.getRuedas() +
                        "\nTipo:\t\t" + ((Bicicleta) item).getTipo()
                );
                System.out.println("\n");
            }
            if(item instanceof Motocicleta){
                System.out.println("Class:\t\t"+ item.getClass().getName() +
                        "\nColor:\t\t"+ item.getColor()+
                        "\nRuedas:\t\t"+ item.getRuedas() +
                        "\nTipo:\t\t" + ((Motocicleta) item).getTipo() +
                        "\nCilindrada:\t\t" + ((Motocicleta) item).getCilindrada() +
                        "\nVelocidad:\t\t" + ((Motocicleta) item).getVelocidad()
                );

            }
        }
    }

    public static void catalogar(ArrayList<Vehiculo> lista, int cantidadDeRuedas) {
        int contador = 0;
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getRuedas() == cantidadDeRuedas) {
                contador++;
            }
        }
        if (contador == 0) System.out.println("No se han encontrado vehiculos con " + cantidadDeRuedas + " ruedas.");
        else System.out.println("\nSe han encontrado " + contador + " vehículos con " + cantidadDeRuedas + " ruedas:" );
    }
}