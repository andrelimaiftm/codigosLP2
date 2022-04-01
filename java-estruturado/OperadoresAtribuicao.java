public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int total = 10;
        total += 3;
        System.out.println(total); //imprime 13
        total -= 2;
        System.out.println(total); // imprime 11
        total *= 3;
        System.out.println(total); // imprime 33
        total /= 3;
        System.out.println(total); // imprime 11
        total %= 2;
        System.out.println(total); // imprime 1

        total =  (3 * (2 + 4)) / 2;
        System.out.println(total);
    }
}
