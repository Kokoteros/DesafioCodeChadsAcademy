package poo.domain;

import java.util.*;

public class Academia {
    private List<Alumno> alumnos;

    public Academia() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

    public Alumno obtenerMejorPromedio(){
        Alumno mejor = null;
        double maxPromedio = -1;
        for (Alumno est: alumnos){
            double promedio = est.getPromedio();
            if(promedio> maxPromedio){
                maxPromedio=promedio;
                mejor=est;
            }
        }
        return mejor;
    }
    public Alumno obtenerMasRegular(){
        Alumno masRegular = null;
        int menorRango = Integer.MAX_VALUE;

        for (Alumno est: alumnos){
            int [] notas = est.getNotas();
            int max = notas[0];
            int min = notas[0];
            for (int i = 1; i < notas.length ; i++) {
                if(notas[i]>max){
                    max= notas[i];
                }
                if(notas[i]<min){
                    min= notas[i];
                }
            }
            int rango = max-min;
            if(rango<menorRango){
                menorRango= rango;
                masRegular= est;
            }
        }
        return masRegular;

    }
    public Alumno obtenerPeorTercero(){
        Alumno peor = null;
        int menorNota = Integer.MAX_VALUE;

        for (Alumno est: alumnos){
            int notaTercera = est.getNotas()[2];
            if(notaTercera<menorNota){
                menorNota= notaTercera;
                peor= est;
            }
        }
        return peor;
    }

    public void mostrarRanking(){
        System.out.println("===RANKING DE LA ACADEMIA===");
        System.out.println("Alumno con mayor promedio: "+obtenerMejorPromedio().getNombre());
        System.out.println("Alumno mas regular: "+ obtenerMasRegular().getNombre());
        System.out.println("Alumno con peor rendimiento en la tercer prueba: "+ obtenerPeorTercero().getNombre());
    }



}