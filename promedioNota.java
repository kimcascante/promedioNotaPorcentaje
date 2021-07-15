package Semana3;

/**
 * Nombre del programa: 
 * Descripcion: Calcule la nota final de un estudiante para un curso de fundamentos de programación.
La rúbrica de evaluación del curso determina que hay solamente tres exámenes y que
la nota del curso se calcula por medio de un promedio ponderado el(el primer examen
vale un 30 %, el segundo un 20% y el último un 50%). El estudiante aprueba si el
promedio es igual o mayor a 70.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class ej9w3 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{

        double notaFinal;
        double examenUno;
        double examenDos;
        double examenTres;
        String resultado;
        double ponderadoUno;
        double ponderadoDos;
        double ponderadoTres;

        escribir.println("Digite la nota del primer examen:");
        examenUno = Double.parseDouble(leer.readLine());
        
        escribir.println("Digite la nota del segundo examen:");
        examenDos = Double.parseDouble(leer.readLine());

        escribir.println("Digite la nota del tercer examen");
        examenTres = Double.parseDouble(leer.readLine());

        ponderadoUno = examenUno * 0.3;
        ponderadoDos = examenDos * 0.2;
        ponderadoTres = examenTres * 0.5;

        notaFinal = ponderadoUno + ponderadoDos + ponderadoTres;
        
        if (notaFinal>=70){
            resultado = "el estudiante ha aprobado";
        } else {
            resultado = "el estudiante no ha aprobado";
        }
        
        escribir.println("El promedio es de: " + notaFinal + ", por lo tanto, " + resultado);
     }
}