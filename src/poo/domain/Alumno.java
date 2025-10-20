package poo.domain;

public class Alumno {
    private String nombre;
    private int[] notas;

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.notas= new int[5];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }
    public void calcularNotasRestantes(){
        if (notas[1]<60){
            notas[4]=100;
        }else{
            notas[3]=100;
        }
        if (notas[0]+notas[2]>150){
            notas[4]=95;
        }else{
            notas[4]=70;
        }

    }

    public String getNombre(){
        return nombre;
    }

    public int[] getNotas(){
        return notas;
    }

    public double getPromedio(){
        int suma=0;
        for (int nota: notas){
            suma+=nota;
        }
        return suma/5.0;
    }
}

