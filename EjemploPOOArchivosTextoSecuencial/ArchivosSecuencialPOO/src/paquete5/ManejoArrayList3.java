/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {

        double a = 9.58;
        double b = 8.54;
        Calificacion c1 = new Calificacion(a, "Ciencias naturales");
        Calificacion c2 = new Calificacion(b, "Educacion fisica");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);

        System.out.println("-----------------------------");

        // ArrayList
        //tipo de dato del array
        //   |
        //   v
        ArrayList<Calificacion> calificacion2 = new ArrayList<>();
        calificacion2.add(c1); //add = agregar valores
        calificacion2.add(c2);

        for (int i = 0; i < calificacion2.size(); i++) {
            //nombre del profesor
            //nombre de la materia+
            //la nota
            System.out.printf("%s - %s - %.2f\n", calificacion2.get(i)
                    .obtenerProfesor().obtenerNombre(),
                    calificacion2.get(i).obtenerNombreMateria(),
                    calificacion2.get(i).obtenerNota()); // get = obtener valores
        }

    }
}
