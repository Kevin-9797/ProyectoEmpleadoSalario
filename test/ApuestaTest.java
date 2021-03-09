/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Apuesta.Apuesta;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author kevin
 */
public class ApuestaTest extends TestCase {
    
    public ApuestaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    @Override
    public void setUp() {
    }
    
    @After
    @Override
    public void tearDown() {
    }

    
   
    @Test
    public void testApuestaValido  () throws Exception{
        int local = 4, visitante=3 ;
        double midinero=1500;
         double cantidad = 100;
         double dineroactual= 0;
        System.out.println("Test de prueba para comprobar valores validos");
       
        Apuesta ap = new Apuesta(midinero,local,visitante);
        
        dineroactual=ap.apostar(cantidad);
        
     assertEquals(1400.0,dineroactual);
        
       
    }

    
    
     @Test
       public void testApuestaNoValido  () throws Exception{
     int local = 4, visitante=3 ;
     double midinero=700;
     double cantidad = -300;
     double dineroactual=0;
         System.out.println("Test de prueba para comprobar si ha ingresado un monto negativo");
     
     Apuesta ap = new Apuesta(midinero,local,visitante);
     try {
     
         ap.apostar(cantidad);
     fail("Ha ingresado un monto negativo");
     
     }catch(Exception e){
        System.out.println(e);
       dineroactual = ap.apostar(cantidad);//si hubiese ingresado 300 la operacion se hubiera ejecutado con exito
        assertEquals(400,dineroactual);
     }
     
     }
     
      @Test
       public void testApuestaLimiteInferiorSuperior  () throws Exception{
     int local = 4, visitante=3 ;
     double midinero=700;
     double cantidad =0.50;
     double dineroactual=0;
         System.out.println("Test de prueba para comprobar si ha ingresado menos de 1€");
     
     Apuesta ap = new Apuesta(midinero,local,visitante);
     try {
     
         ap.apostar(cantidad);
     fail("No puede ingresar menos de 1€");
     
     }catch(Exception e){
        System.out.println(e);
       dineroactual = ap.apostar(cantidad);
        assertEquals(400,dineroactual);
     }
     
     }
     
     
    @Test
      public void testCobrarApuestaValida  () throws Exception{
        int local = 4, visitante=3 ;
        double midinero=1500;
         double cantidad = 100;
         double dineroactual= 0;
        System.out.println("Test de prueba para comprobar valores validos");
       
        Apuesta ap = new Apuesta(midinero,local,visitante);
       
        assertTrue(ap.comprobar_resultado(4, 3)); //El resultado a sido el esperado
       ap.cobrar_apuesta(local, visitante);
       
    }

     @Test
       public void testApuestaNoValida () throws Exception{
     int local = -4, visitante=-3 ;
     double midinero=700;
     double cantidad =0.50;
     double dineroactual=0;
         System.out.println("Test de prueba para comprobar si ha ingresado una cantidad de goles negativa");
     
     Apuesta ap = new Apuesta(midinero,local,visitante);
     try {
     
         ap.comprobar_resultado(local,visitante);
     fail("No puede ingresar una cantidad de goles negativa");
     
     }catch(Exception e){
        System.out.println(e);
      assertTrue(ap.comprobar_resultado(local, visitante));
       ap.cobrar_apuesta(local, visitante);
       
       
     }
     
     }
     
       
       @Test
       public void testCobrarApuestaNoValida () throws Exception{
     int local = 4, visitante=3 ;
     double midinero=700;
     double cantidad =0.50;
     double dineroactual=0;
         System.out.println("Test de prueba para comprobar si ha acertado el participante");
     
     Apuesta ap = new Apuesta(midinero,local,visitante);
     try {
     
      ap.comprobar_resultado(3,5);
     fail("No puedes cobrar una apuesta si no has acertado");
     
     }catch(Exception e){
        System.out.println(e);
       ap.cobrar_apuesta(local, visitante);
       
       
     }
     
     }
       
    
    private void assertTrue(int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
