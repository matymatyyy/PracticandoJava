import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ingresoDato= new Scanner(System.in);
        int contador = 0;
        int[] lista = new int[5];

        do {
            System.out.print(" Ingrese un numero: ");
            Integer numero = ingresoDato.nextInt();
            lista[contador] = numero;
            contador++;
        } while (contador != lista.length);
        System.out.println(Arrays.toString(lista));

        }
    }
