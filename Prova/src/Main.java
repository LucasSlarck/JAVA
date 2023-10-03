import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println("Hello and welcome!");
        int[] ListaP = new int[100000];
        int[] ListaA = new int[100000];
        int[] ListaB = new int[100000];
        int[] ListaC = new int[100000];

        long CronometroA1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            ListaP[i] = random.nextInt(100000);
            System.out.println("Elemento lista Primaria " + i + ": " + ListaP[i]);
            ListaA[i] = ListaP[i];
            ListaB[i] = ListaP[i];
            ListaC[i] = ListaP[i];
            System.out.println("Elemento Lista A" + i + ": " + ListaA[i]);
            System.out.println("Elemento Lista B" + i + ": " + ListaB[i]);
            System.out.println("Elemento Lista C" + i + ": " + ListaC[i]);
        }
        long CronometroA2 = System.currentTimeMillis();
        long CronometroB1 = System.currentTimeMillis();
        int n = ListaA.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (ListaA[j] > ListaA[j + 1]) {
                    int temp = ListaA[j];
                    ListaA[j] = ListaA[j + 1];
                    ListaA[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            }
        long CronometroB2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("Elemento Lista A" + i + ": " + ListaA[i]);

        }
        long CronometroC1 = System.currentTimeMillis();
        int x = ListaB.length;

        for (int i = 0; i < x - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < x; j++) {
                if (ListaB[j] < ListaB[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = ListaB[i];
            ListaB[i] = ListaB[minIndex];
            ListaB[minIndex] = temp;
        }
        for (int i = 0; i < 100000; i++) {
            System.out.println("Elemento Lista B" + i + ": " + ListaB[i]);

        }
        long CronometroC2 = System.currentTimeMillis();

        long CronometroA = CronometroA2 - CronometroA1;

        System.out.println("Tempo decorrido: " + CronometroA + " milissegundos");
        long CronometroB = CronometroB2 - CronometroB1;

        System.out.println("Tempo decorrido: " + CronometroB + " milissegundos");
        long CronometroC = CronometroC2 - CronometroC1;

        System.out.println("Tempo decorrido: " + CronometroC + " milissegundos");

















    }

}
