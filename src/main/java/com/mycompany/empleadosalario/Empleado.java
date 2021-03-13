/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.empleadosalario;

/**
 *
 * @author kevin
 */
public class Empleado {
    
    public static int ValidaEmpleado(String empleado,String departamento, String oficio){
        
        int salario =0;
        if(empleado.length() != 3){
            return -1;  //ERROR -1 por que numero de empleado debe tener 3 digitos
        }
        
        if(empleado.charAt(0)!= '0'){
            
            
            return -2; //ERROR -2 por que el numero de empleado debe empezar por 0
                    
        }
        if(departamento.length()!=2){
            return -3; //Error -3 por que el numero de departamento debe contener 2 digitos
        }
        
        if(!oficio.equals("ANALISTA") && !oficio.equals("DISEÑADOR")&& !oficio.equals("PROGRAMADOR")){
            return -4;      //Error -4 por elegir un puesto de  trabajo no permitido
        }
        if("ANALISTA".equals(oficio)){
            salario = 2500;
            return salario;
        }
        if("DISEÑADOR".equals(oficio)){
            salario = 1500;
            return salario;
        }
        if("PROGRAMADOR".equals(oficio)){
            salario = 2000;
            return salario;
        }
        return salario; 
        
    }
    
    
}
