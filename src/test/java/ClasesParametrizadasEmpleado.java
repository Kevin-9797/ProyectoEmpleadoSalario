/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.empleadosalario.Empleado;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value=Parameterized.class)

public class ClasesParametrizadasEmpleado {
    
    private String empleado;
    private String departamento;
    private String oficio;
    private double salario;
    private double exp;
    
    public ClasesParametrizadasEmpleado(String empleado, String departamento,String oficio,double salario, double exp) {
        
        this.empleado=empleado;
        this.departamento=departamento;
        this.oficio = oficio;
        this.salario=salario;
        this.exp=exp;
        
    }

    
    @Parameterized.Parameters
    public static ArrayList<Object[]> testSalarioParametrizadas () {
        ArrayList<Object[]> obj = new ArrayList();
        //PRUEBAS PARA OPCIONES VALIDAS
        obj.add(new Object[] {"034","20","ANALISTA",2500,2500});
        obj.add(new Object[] {"085","12","PROGRAMADOR",2000,2000});
        obj.add(new Object[] {"079","13","DISEÑADOR",1500,1500});
        obj.add(new Object[] {"072","","ANALISTA",2500,2500});
          //PRUEBAS PARA OPCIONES NO VALIDAS
        obj.add(new Object[] {"123","21","ANALISTA",-2,-2}); //AQUI MUESTRA ERROR POR NO INGRESAR UN NUMERO DE EMPLEADO QUE NO EMPIEZE POR 0
        obj.add(new Object[] {"02","32","DISEÑADOR",-1,-1}); //AQUI MUESTRA ERROR POR QUE EL NUMERO DE EMPLEADO ES DE 3 DIGITOS
        obj.add(new Object[] {"023","435","ANALISTA",-3,-3}); //AQUI MUESTRA ERROR POR QUE EL NUMERO DE DEPARTAMENTO ES DE 2 DIGITOS
        obj.add(new Object[] {"045","21","MECANICO",-4,-4}); //AQUI MUESTRA ERROR POR QUE EL OFICIO ES INCORRECTO
     
        return obj;
    }
    @Test
    public void testCalculaSalarioNeto() {
        System.out.println("calculaSalarioNeto");
         try {
             
            ArrayList<Object[]> obj = new ArrayList();
            obj=testSalarioParametrizadas ();
            double result = Empleado.ValidaEmpleado(empleado, departamento,oficio);
            assertEquals(exp, result, 0.0);
            
            // TODO review the generated test code and remove the default call to fail.
        } catch (Exception e) {
            fail("The test case is a prototype.");
        }
       
    }

    
}
    

