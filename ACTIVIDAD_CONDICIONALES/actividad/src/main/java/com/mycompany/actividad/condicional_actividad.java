/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class condicional_actividad {
    public static void main(String []args){
        Scanner entrada=new Scanner(System.in);
        String nombre,apellido;
        int edad,sexo;
        System.out.println("DIGITE SU NOMBRE: ");
        nombre=entrada.nextLine();
        System.out.println("DIGITE SU APELLIDO: ");
        apellido=entrada.nextLine();
        System.out.println("DIGITE SU EDAD: ");
        edad=entrada.nextInt();
        System.out.println("DIGITE SU SEXO:\n 1.MASCULINO\n 2.FEMENINO");
        sexo=entrada.nextInt();
        
        
        
        System.out.println("NOMBRE: "+nombre);
        System.out.println("APELLIDOS: "+apellido);
        if(edad>18){
            System.out.println("-USTED ES MAYOR DE EDAD");
        }else{
            System.out.println("-USTED ES MENOR DE EDAD");
        }
        if(sexo==1){
            System.out.println("-USTED ES HOMBRE");
        }else{
            System.out.println("-USTED ES MUJER");
        }
        
        
    }
}
