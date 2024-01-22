import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] lista = new int[5];
        Scanner ingresoDato= new Scanner(System.in);

        ingresarNumeros(lista, ingresoDato);
        mostrarNumeros(lista);
        }

    private static void ingresarNumeros(int[] lista, Scanner ingresoDato) {
        for(int i = 0; i< lista.length; i++){
            lista[i]= pedirNumero(ingresoDato);;
        }
    }

    private static void mostrarNumeros(int[] lista){
        System.out.println(Arrays.toString(lista));
    }
    private static int pedirNumero(Scanner ingresoDato){
        System.out.print("Ingrese un numero:");
        int dato = ingresoDato.nextInt();
        return dato;
    }
    }
