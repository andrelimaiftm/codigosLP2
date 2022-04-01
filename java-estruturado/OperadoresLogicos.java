import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome:");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        double peso = entrada.nextDouble();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Sexo ('M' para Masculino ou 'F' para Feminimo ): ");
        char sexo = entrada.next().charAt(0);

        double imc = peso / (altura * altura);
       //______________A______________  || _____________B_____________
       //______A______ && ____B_______     _____A_____ && ____B_______
       if((sexo == 'F' && imc < 19.1 ) || (sexo == 'M' && imc < 20.7)){
            System.out.println("Abaixo do peso");
        }else if((sexo == 'F' && imc <= 25.8) || (sexo == 'M' && imc <= 26.4)){
            System.out.println("Peso ideal");
        }else if((sexo == 'F' && imc <= 27.3) || (sexo == 'M' && imc <= 27.8)){
            System.out.println("Um pouco acima do peso");
        }else if((sexo == 'F' && imc <= 32.3) ||  (sexo == 'M' && imc <= 31.1)){
            System.out.println("Acima do peso ideal");
        }else if ((sexo == 'F' && imc > 32.3) || (sexo == 'M' && imc > 31.1)){
            System.out.println("Obeso");
        }
    }

}
