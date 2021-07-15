package Semana12;

/**
 * Nombre del programa: 
 * Descripcion: Suponga que tiene que guardar en un arreglo de reales las notas del curso de Programación 1,
    pero no se sabe con anterioridad cuántos estudiantes hay en el curso. Usted debe:
    1. Declarar un arreglo de reales llamado notas.
    2. Preguntarle al usuario cuántos alumnos tiene el curso y reservar el espacio en memoria
    para ello.
    3. Leer el arreglo notas.
    4. Imprimir el arreglo notas.
    5. Calcular el promedio de las notas del curso e imprimirlo.
    6. Calcular la mayor nota e imprimir la nota y el estudiante que la obtuvo (el estudiante
    corresponde al índice de la mayor nota).
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por: Kimberly C.
 * fecha de modificacion:
 */

import java.io.*;

public class ej5 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException {

        int alumnos;
        int suma = 0;
        int promedio = 0;
        int notaMayor = 0;
        int estudiante = 0;

        System.out.println("Digite cuántos alumnos tiene el curso ");
        alumnos = Integer.parseInt(in.readLine());
        int notas[] = new int[alumnos];

        for (int count = 0; count < alumnos; count++) {

            System.out.println("Digite la nota del alumno  " + (count + 1));
            notas[count] = Integer.parseInt(in.readLine());
            suma = suma + notas[count];

            if (count == 0) {
                notaMayor = notas[count];
            } else if (notas[count] >= notaMayor) {
                notaMayor = notas[count];
                estudiante = (count+1);

            }
        }

        out.println("Las notas de los estudiantes son");

        for (int counti = 0; counti < alumnos; counti++) {

            out.println(notas[counti]);

        }

        promedio = suma / alumnos;
        out.println("El promedio de las notas es : " + promedio);
        out.println("El estudiante con la nota mayor es:  "  + estudiante + " con la nota de:  " + notaMayor);
 
    }
}
