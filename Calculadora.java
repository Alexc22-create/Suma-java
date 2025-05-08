import java.util.Scanner;
public class Calculadora{

    public static void main(String[] args){

        Scanner almacenar = new Scanner(System.in);

        System.out.println("Escribe el primer numero:");
        int numero1 = almacenar.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int numero2 = almacenar.nextInt();
        System.out.println("Escribe el tercer numero: ");
        int numero3 = almacenar.nextInt();

        System.out.println("El resultado es: "+ (numero1+numero2+numero3));


    }
}