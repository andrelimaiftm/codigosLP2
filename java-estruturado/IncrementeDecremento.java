import java.util.Scanner;

public class IncrementeDecremento {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.print("Digite um ano futuro: ");
        int ano = entrada.nextInt();

        //diferença entre o ano atual e o ano futuro
        int aux = ano - 2022;
        int idadeFutura = idade + aux;

        System.out.println("Minha idade em "+ ano 
            + " é " + idadeFutura);
        
        //int idade = 10;
        //int novaIdade = idade++;// idade = idade + 1;
        //int novaIdade = ++idade;
        //int novaIdade = idade--;
        //int novaIdade = --idade;
        
        
        //System.out.println("Idade: " + idade);
        //System.out.println("Nova Idade: " + novaIdade);


    }
    
}
