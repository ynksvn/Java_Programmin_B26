package day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5+2*3);
        System.out.println(5*2+4/2);
        System.out.println(5+2 > 4-3);
        // 7>1 = true

        int a = 20; //20 changed to 19 to 20 to 19 to 18
        int b = -a-- + a++ + --a * a--;
              //-20 + 19 + 19 * 19
        System.out.println(a);
        System.out.println(b);

        System.out.println(-20 + 19 + 19 * 19);

    }
}
