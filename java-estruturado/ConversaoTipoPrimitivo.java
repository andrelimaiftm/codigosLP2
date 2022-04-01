public class ConversaoTipoPrimitivo{

    public static void main(String[] args) {
        /*casting automatico
        long x = 0;
        int y = 3;
        x = y;
        System.out.println(x);

        //casting não automatico
        long x = 931234567687989835L;
        int y = (int) x;
        System.out.println(y);*/

        double a  = 20.5;
        float b = (float) a;
        System.out.println(b);

        b = 3.15f;
        a = b;
        System.out.println(a);

        int c = (int) b;
        System.out.println(c);

        c = 35;
        b = c;
        System.out.println(b);



    }
}