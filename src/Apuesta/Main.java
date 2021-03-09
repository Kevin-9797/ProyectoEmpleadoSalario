package Apuesta;

public class Main {

    public static void main(String[] args) {
        Apuesta miApuesta;
       double mi_dinero;

        miApuesta = new Apuesta(1000, 4, 2);
        try {
            System.out.println("Apostando...");
            miApuesta.apostar(50);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            miApuesta.cobrar_apuesta(3,4);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = miApuesta.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }
}
