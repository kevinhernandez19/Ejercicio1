package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {
        Cliente c = new Cliente();
       c.setNombre("kevin");
       c.setEdad(32);
       c.setSalario(2000);

       System.out.println("estimado Cliente " + c.getNombre() + "su salario sera de: "+ c.getSalario() );

       BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
       System.out.println("Su nombre:") ;
       c.setNombre(reader.readLine());
       System.out.println("su edad:");
       c.setEdad( Integer.parseInt(reader.readLine()));
        System.out.println("su salario");
     c.setSalario(Integer.parseInt(reader.readLine()));


       System.out.println("Estimado" + c.getNombre()+", su edad es" +c.getEdad()+
               "y su salario es de " +c.getSalario());





    }
}
