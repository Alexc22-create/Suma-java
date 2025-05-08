import java.util.Scanner;
public class Calculadora{

    public static void main(String[] args){

        Scanner almacenar = new Scanner(System.in);

        System.out.println("Escribe el primer numero:");
        int numero = almacenar.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numero = numero + almacenar.nextInt();
        System.out.println("Escribe el tercer numero: ");
        numero = numero + almacenar.nextInt();

        System.out.println("El resultado es: "+ numero);


    }
}