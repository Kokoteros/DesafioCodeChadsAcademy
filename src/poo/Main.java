package poo;

import poo.domain.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Academia academia = new Academia();

        Alumno e1 = new Alumno("Esteban",80,70,90);
        Alumno e2 = new Alumno("María",50,65,85);
        Alumno e3 = new Alumno("Carlos", 90, 85, 95);
        Alumno e4 = new Alumno("Lucía", 40, 55, 60);

        e1.calcularNotasRestantes();
        e2.calcularNotasRestantes();
        e3.calcularNotasRestantes();
        e4.calcularNotasRestantes();

        academia.agregarAlumno(e1);
        academia.agregarAlumno(e2);
        academia.agregarAlumno(e3);
        academia.agregarAlumno(e4);

        evaluarAlumno(e1);
        evaluarAlumno(e2);
        evaluarAlumno(e3);
        evaluarAlumno(e4);

    }

    private static void evaluarAlumno(Alumno alumno){
        System.out.println("Alumno: " +alumno.getNombre());
        System.out.println("Notas: "+ Arrays.toString(alumno.getNotas()));
        System.out.println(Evaluador.evaluarAprobacion(alumno));
        System.out.println(Evaluador.calcularVariacion(alumno));
        System.out.println(Evaluador.verificarProgreso(alumno));
        System.out.println("Notas Ordenadas: "+Evaluador.ordenarNotas(alumno));
        System.out.println("Evaluación Final: "+ Evaluador.evaluarNivel(alumno));
        System.out.println("=====================================================================");
    }
}
