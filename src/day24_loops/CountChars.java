package day24_loops;

public class CountChars {
    public static void main(String[] args) {


        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i); // stores as variable  for to be able to use again

            if (letter >= 'A' && letter <= 'Z') {
                upper++;

            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            }else if (letter>= '0' && letter <= '9'){
                number++;
            }
        }
        System.out.println("Uppercase characters : " + upper);
        System.out.println("Lowercase characters : " + lower);
        System.out.println("Number characters: " + number);
        }
    }
