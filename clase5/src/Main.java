import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ingresoDato= new Scanner(System.in);
        int menor = 0;
        int mayor = 0;
        float suma= 0;
        int[] lista = new int[5];

        for(int i=0; i < lista.length; i++){
            System.out.print("Ingrese el numero: ");
            int dato = ingresoDato.nextInt();
            lista[i] = dato;
            if(mayor< dato || i==0){
                    mayor=dato;
            }
            if(menor>dato || i==0){
                    menor=dato;
            }
            suma += dato;
        }
        System.out.println(Arrays.toString(lista));
        System.out.println("El numero mas grande es: "+ mayor+ " El numero mas chiquito es :"+ menor);
        System.out.println("El promedio es :"+ (suma/ lista.length));

        }
    }
