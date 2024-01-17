import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroUsuario=0;
        int numeroAdivina = (int) Math.floor(Math.random()*100);
        int vidas=10;



        while(vidas>0){
            System.out.print("Adivina el numero del 0 al 100: ");
            numeroUsuario = teclado.nextInt();
            if(numeroUsuario==numeroAdivina){
                System.out.println("adivinaste el numero era: "+ numeroAdivina);
                break;
            }else if(numeroUsuario>numeroAdivina){
                System.out.println("te pasaste ");
                vidas--;
                System.out.println("te quedan "+vidas+" vidas");

            } else if (numeroUsuario<numeroAdivina) {
                System.out.println("te falta ");
                vidas--;
                System.out.println("te quedan "+vidas+" vidas");

            }
        }
    }
}