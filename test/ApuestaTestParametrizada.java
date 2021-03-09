/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Apuesta.Apuesta;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author kevin
 */
@RunWith(value=Parameterized.class)

public class ApuestaTestParametrizada {
     private double dinero;
    private int local;
    private int visitante;
    private double exp;
    private double dineroapostado;
    
    public ApuestaTestParametrizada(int local,int visitante, double dineroapostado,double exp) {
        //this.dinero = dinero;
        this.local = local;
          this.dineroapostado = dineroapostado;
        this.visitante = visitante;
        this.exp = exp;
        
    }
    
  @Parameterized.Parameters
    public static ArrayList<Object[]> testApuestaParametrizada () {
        ArrayList<Object[]> obj = new ArrayList();
        obj.add(new Object[] {3,4,700,4300});
        obj.add(new Object[] {5,6,1000,3});
        obj.add(new Object[] {3,4,1000,5500});
        obj.add(new Object[] {5,6,1000,300});
        return obj;
    }
    
    @Test
       public void testApuesta () {
         
        try {
            ArrayList<Object[]> obj = new ArrayList();
             Apuesta ap = new Apuesta(1500,3,4);
            obj=testApuestaParametrizada ();
             
             double resul=0;
            ap.apostar(dineroapostado);
            resul= ap.cobrar_apuesta(local, visitante);
            assertEquals(exp, resul, 0.01);
            
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
        
    }
}
