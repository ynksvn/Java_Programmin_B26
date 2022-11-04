package my_utilities;
public class StringUtil {
    /*
        reverse
        create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str) {

            String reversed = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }
                return reversed;
            }


        /*
    Fix Format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase
        create a method will accept a String and return a String in proper format. Proper format is:
        First character starting as uppercase and the rest as lowercase
     */

        public static String fixFormat (String str){
            str = str.trim();
            return str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
        }

       /*
        Frequency of Character
        create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word
        */

                public static int frequencyOfCharacter (String str,char letter){

                    int count = 0;

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == letter) {
                            count++;
                        }
                    }
                    return count; // stops the method but lets to be used again


                }

    public static String uniqueCharacters(String str){

        String unique = "";
        String checked = "";

        for(int i = 0; i < str.length(); i++){
            if (checked.contains("" + str.charAt(i)))
                continue;

            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));
            checked += str.charAt(i);

            if(count == 1){ // count 1e edit degilse unique degildir
                unique += str.charAt(i);
            }
        }

        return unique;
    }

            }

