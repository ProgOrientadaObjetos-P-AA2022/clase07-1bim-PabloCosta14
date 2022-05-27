/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa e1 = new Empresa("Nestle", "Guayaquil");
        Empresa e2 = new Empresa("Toni", "Quito");
        Empresa e3 = new Empresa("Ecolac", "Loja");
        ArrayList<Empresa> ep = new ArrayList<>();
        ep.add(e1);
        ep.add(e2);
        ep.add(e3);
        System.out.println("-------------------------------------");
        for (int i = 0; i < ep.size(); i++) {
            System.out.printf("%s - %s\n",
                    ep.get(i).obtenerNombre(), ep.get(i).obtenerCiudad());

        }

    }
}
