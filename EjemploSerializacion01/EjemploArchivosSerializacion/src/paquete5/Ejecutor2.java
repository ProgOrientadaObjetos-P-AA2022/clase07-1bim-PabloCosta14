/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
         String nombreArchivo = "data/profesores.data";
        String cedula_buscar = "11112";
        Hospital hospital_buscar;
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(cedula_buscar);
        lectura.establecerProfesorBuscado();
        profesor_buscar = lectura.obtenerProfesorBuscado();
        if(profesor_buscar!=null){
            System.out.println(profesor_buscar);
        }else{
            System.out.println("Profesor no encontrado");
    }
}
