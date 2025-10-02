import java.util.Arrays;

public class CodeChadsAcademy {
    public static void main(String[] args) {
        //primera parte
        int[] notas = new int[5];
        notas[0] = 80; //nota 1
        notas[1] = 55; //nota 2
        notas[2] = 90; //nota 3
        //nota 4
        if (notas[1] < 60) {
            notas[3] = 100;
        } else {
            notas[3]= notas[1];
        }
        //nota 5
        if (notas[0] + notas[2] > 150) {
            notas[4] = 95;
        } else {
            notas[4] = 70;
        }
        System.out.println("========RESULTADO DE LOS EXAMENES========");
        System.out.println("Notas del estudiante:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("  Nota " + (i+1) + ": " + notas[i]);
        }
        //segunda parte
        //1
        int aprobadas = 0;
        for (int n : notas) {
            if (n >= 60) aprobadas++;
        }
        if (aprobadas == 5) {
            System.out.println("Resultado: Aprobaste todas. ¡Backend Sensei!");
        } else if (aprobadas == 0) {
            System.out.println("Resultado: No aprobaste ninguna. ¡Sos un clon de frontend!");
        } else {
            System.out.println("Resultado: Algunas aprobadas. Sos un refactor en progreso.");
        }
        //2
        int mayorSalto = 0;
        int posicion = 0;
        for (int i = 0; i < notas.length - 1; i++) {
            int diff = Math.abs(notas[i] - notas[i+1]);
            if (diff > mayorSalto) {
                mayorSalto = diff;
                posicion = i;
            }
        }
        System.out.println("Mayor salto fue de " + mayorSalto + " puntos entre la prueba " + (posicion+1) + " y la prueba " + (posicion+2) + ".");

        //3
        boolean bonus = true;
        for (int i = 0; i < notas.length - 1; i++) {
            if (notas[i] >= notas[i+1]) {
                bonus = false;
                break;
            }
        }
        if (bonus) {
            System.out.println("¡Nivel PROGRESIVO! Sos un Stone Chad en crecimiento 📈");
        }


        //4
        int[] notasOrdenadas = Arrays.copyOf(notas, notas.length);
        for (int i = 0; i < notasOrdenadas.length-1; i++) {
            for (int j = i+1; j < notasOrdenadas.length; j++) {
                if (notasOrdenadas[i] < notasOrdenadas[j]) {
                    int temp = notasOrdenadas[i];
                    notasOrdenadas[i] = notasOrdenadas[j];
                    notasOrdenadas[j] = temp;
                }
            }
        }
        System.out.println("Notas ordenadas de mayor a menor: " + Arrays.toString(notasOrdenadas));
        System.out.println("--------------------------------------------------------------");

        //5
        int total = 0;
        for (int n : notas) total += n;
        System.out.println("Total acumulado: " + total);
        if (total < 250) {
            System.out.println("Normie total 😢");
        } else if (total <= 349) {
            System.out.println("Soft Chad");
        } else if (total <= 449) {
            System.out.println("Chad");
        } else {
            System.out.println("Stone Chad definitivo 💪");
        }
        System.out.println("=============================================================");

        //6
        int[][] clase = {
                {80, 55, 90, 100, 95},  // Alumno 1
                {60, 70, 65, 70, 95},   // Alumno 2
                {100, 90, 85, 90, 95},  // Alumno 3
                {40, 50, 30, 100, 70}   // Alumno 4
        };
        int mejorAlumno = -1;
        double mejorPromedio = -1;
        int alumnoPeorTercera = -1;
        int peorNotaTercera = 101; // mayor a cualquier nota posible
        int masRegular = -1;
        int menorDiferencia = 999; // número grande para comparar
        for (int i = 0; i < clase.length; i++) {
            int suma = 0;
            int mayor = clase[i][0];
            int menor = clase[i][0];
            // recorrer las 5 notas
            for (int j = 0; j < clase[i].length; j++) {
                int nota = clase[i][j];
                suma += nota;
                if (nota > mayor) mayor = nota;
                if (nota < menor) menor = nota;
            }
            //promedio
            double promedio = suma / 5.0;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorAlumno = i+1;
            }
            //alumno más regular
            int diferencia = mayor - menor;
            if (diferencia < menorDiferencia) {
                menorDiferencia = diferencia;
                masRegular = i+1;
            }
            //peor en tercera prueba
            if (clase[i][2] < peorNotaTercera) {
                peorNotaTercera = clase[i][2];
                alumnoPeorTercera = i+1;
            }
        }
        System.out.println("\n--- Notas simulación de clase ---");
        for (int i = 0; i < clase.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < clase[i].length; j++) {
                System.out.print("Nota " + (j + 1) + ": " + clase[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n--- RANKING ---");
        System.out.println("Mejor promedio: Alumno " + mejorAlumno + " (" + mejorPromedio + ")");
        System.out.println("El más regular: Alumno " + masRegular);
        System.out.println("Peor en la tercera prueba: Alumno " + alumnoPeorTercera);;
    }
}