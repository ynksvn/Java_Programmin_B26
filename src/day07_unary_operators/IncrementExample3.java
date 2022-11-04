package day07_unary_operators;

public class IncrementExample3 {
    public static void main(String[] args) {

        int i = 5;
        int z = i++;

        System.out.println(i);
        System.out.println(z);

       int numberOfTvs = 100;
        System.out.println("Person comes into the store and they bought a tv \nNumber of tvs now: " + --numberOfTvs);
        System.out.println("Person comes into the store and they put tv into their cart \nNumber of tvs now: " + numberOfTvs--);
        System.out.println("Person bought it, now I have: " + numberOfTvs);

    }
}
