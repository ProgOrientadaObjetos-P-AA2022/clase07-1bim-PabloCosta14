/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        String a = "San Jose";
        int c = 140;
        double b = 500.00;
        String nombreArchivo = "Hospital.data";
                
      Hospital h1 = new Hospital(a,c,b);
      Hospital h2 = new Hospital("San Isidro",100,25014);
      Hospital h3 = new Hospital("UTPL",500,259874);
      
        EscrituraArchivoSecuencial archivo = new
         EscrituraArchivoSecuencial(nombreArchivo);
         archivo.establecerRegistro(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospitales();
        System.out.println(lectura);
        
    }
}
