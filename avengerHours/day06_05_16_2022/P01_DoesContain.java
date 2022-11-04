package day06_05_16_2022;

public class P01_DoesContain {
    /*
    Task 01 ;      Write a program that determines if the given sentence contains the given word (Do not use contains() method)

                   Ex;
                   Input: String sentence = "Java is the best programming language"
                          String word = "Java";
                   Output: true
     */

    public static void main(String[] args) {
        String sentence = "Java is the best programming language";
        String word = "Java";
        String word2 = "Ruby";

        System.out.println(sentence.contains(word)); // this returns as boolean result
        System.out.println(sentence.contains(word2));


        System.out.println(sentence.indexOf(word));
        System.out.println(sentence.indexOf(word2)); //if it can't find the word, it returns -1
        System.out.println();
        System.out.println(doesContain(sentence, word)); // calling does contain method
        System.out.println(doesContain(sentence, word2));

    }
    public static boolean doesContain(String sentence, String word){
        if (sentence.indexOf(word) == -1){
            return false;
        }
        return true; // we don't need else
    }


    public static class P02_SumOfDigits {
        /*
        Task 02 ;    Write a program that can return the sum of digits of an integer. Do not use any string manipulations.

                     Ex;
                     Input: 123
                     Output: 6

         */
        public static void main(String[] args) {

            int number = 12345;
            System.out.println(number%10); // it always gives as the last digit
            System.out.println(number/10); // basically removes the last digit since we are using integer
            System.out.println(1/10); //gives zero
            System.out.println();

            System.out.println(sumOfdigits(number));

        }

        public static int sumOfdigits(int number){
            int sum =0;
            number = Math.abs(number); //makes the number positive, get the absolute value

          while (number>0){ //it is not included the - numbers
              sum +=number%10; // add the last digit
              number = number/10; // removed the las digit
          }
          return sum;

        }


    }
}
