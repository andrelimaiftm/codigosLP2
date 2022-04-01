public class ExComerciante {
    
    public static void main(String[] args) {
        int preco1 = 5, preco2 = 8, preco3 = 12;      
        float media = 0;

        media = (float) (preco1+preco2+preco3)/3;

        //System.out.println(media);
        System.out.printf(" Os preco são: %d, %d, %d.\nA media é = %.2f", preco1,
         preco2, preco3, media);
    }
}
