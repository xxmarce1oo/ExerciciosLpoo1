import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Double Num1 = scanner.nextDouble();
        Double Num2 = scanner.nextDouble();

        scanner.nextLine();

        String operador = scanner.nextLine();

        switch(operador){
            case"+":{
                System.out.println(Num1+Num2);
                break;
            }
            case"-":{
                System.out.println(Num1-Num2);
                break;
            }
            case"*":{
                System.out.println(Num1*Num2);
                break;
            }
            case"/":{
                System.out.println(Num1/Num2);
                break;
            }
            default:
                System.out.println("Operação inválida");
        }
    }
}
