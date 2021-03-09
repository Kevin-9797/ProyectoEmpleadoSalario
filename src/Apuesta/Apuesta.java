package Apuesta;

public class Apuesta {

    private double dinero_disp;
    private int goles_local;
    private int goles_visitante;
    private double apostado;
    private Apuesta ap;
    /*Contructor por defecto*/
    public Apuesta() {
    }

    /*Contructor por parámetros*/
    public Apuesta(double dinero_disp, int goles_local, int goles_visitante) {
        ap= new Apuesta();
        this.dinero_disp = dinero_disp;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
        this.apostado = 0;
    }
    /*Método para obtener el valor del atributo dinero_disp*/

    public double getDinero_disp() {
        return dinero_disp;
    }
    /*Método para modificar el valor del atributo dinero_disp*/

    public void setDinero_disp(int dinero_disp) {
        this.dinero_disp = dinero_disp;
    }

    public double getApostado() {
        return apostado;
    }

    public void setApostado(int apostado) {
        this.apostado = apostado;
    }

    /*Método para apostar.
     * Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     * Este método será probado con JUnit
     */
    public double apostar(double dinero) throws Exception {
        if (dinero < 1 && dinero>0) {
            throw new Exception("No se puede apostar menos de 1€");
        }
        if(dinero<0){
            throw new Exception("No se puede apostar un valor negativo");
        }

        if (dinero > dinero_disp) {
            throw new Exception("No se puede apostar mas de lo que tienes");
        }
        {
            dinero_disp = dinero_disp - dinero;
            apostado = dinero;
        }
        return dinero_disp;
    }
    /*Método que comprueba si se ha acertado el resultado del partido
     * En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
     * 
     */

    public boolean comprobar_resultado(int local, int visitante) throws Exception {
        boolean acertado = false;
        if ((local < 0) || (visitante) < 0) {
            throw new Exception("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }

        if (goles_local == local && goles_visitante == visitante) {
            acertado = true;
        }
        return acertado;
    }
    /* Método para cobrar la apuesta.
     * Comprueba que se acertó el resultado y, en ese caso, añade el valor apostado multiplicado por 10
     * al saldo disponible
     * Este método se va a probar con Junit
     */

    public double cobrar_apuesta(int cantidad_goles_local, int cantidad_goles_visit) throws Exception {

        if (comprobar_resultado(cantidad_goles_local, cantidad_goles_visit) == false) {
            throw new Exception("No se puede cobrar una apuesta no acertada");
        }
        dinero_disp = dinero_disp * 5;
        
        return dinero_disp;
    }
   
    
  /*  
    public  double apuestaCompleta (double dinero, int goleslocal, int golesvisitante ) throws Exception{
        double res=0;
        
        apostar(dinero);
       if(comprobar_resultado(goleslocal,golesvisitante)==true){
           
           res = cobrar_apuesta(goleslocal,golesvisitante);
           
           return res;
       } else{
            throw new Exception("No se puede cobrar una apuesta no acertada");
       }
       
       
    */   
        
        
        
    }

