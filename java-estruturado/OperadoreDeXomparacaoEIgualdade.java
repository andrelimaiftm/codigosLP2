public class OperadoreDeXomparacaoEIgualdade {

    public static void main(String[] args) {
        
        /*
        Comparacao: > (maior), >= (maior ou igual), < (menor),
         <= (menor igual)
         Igualdade: == (igual) e != diferente
        */ 

        int a = 10;
        int b = 5;
        int c = 2;

        boolean maior = b > a;
        boolean maiorOUigual = b >= a;
        boolean menor = a < b;
        boolean menorOuIgual = a <= 10;
        boolean igual = a == b-c;
        boolean diferente = a != c;

        System.out.println(maior); //false
        System.out.println(maiorOUigual); //false
        System.out.println(menor); //false
        System.out.println(menorOuIgual);//true
        System.out.println(igual);//false
        System.out.println(diferente); //true


    }
    
}
