import unitTesting.Testing;
import java.util.Scanner;

public class Testar {
    public static void  main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------- CALCULADORA -------");
        System.out.println("Entre com o primeiro valor:");
        double x = sc.nextDouble();
        System.out.println("Entre com o segundo valor:");
        double y = sc.nextDouble();
        System.out.println("Entre com o operação ( + | - | * | / ):");
        String operacao = sc.next();

        Testing Testing = new Testing();

        switch (operacao) {

            case "-":
                double resultado = Testing.subtrair(x, y);
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case "+":
                resultado = Testing.somar(x, y);
                System.out.println("O resultado da soma é: " + resultado);
                break;
            case "*":
                resultado = Testing.multiplicar(x, y);
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case "/":
                resultado = Testing.dividir(x, y);
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }
    }
}
