public class IncrementoDecremento {

    public static void main(String[] args) {
        
        int idade = 10;

        //int novaIdade = idade++;
        //int novaIdade = ++idade; // idade = idade +1

        //int novaIdade = idade--;
        int novaIdade = --idade; // idade = idade -1

        System.out.println("Idade: " + idade);
        System.out.println("Nova idade: " + novaIdade);
    }
    
}
