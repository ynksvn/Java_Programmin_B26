package day26_nested_loops;

public class FrequencyOFCharacters2 {
    public static void main(String[] args) {
        String s = "appleee";
        String checked = "";

        for (int i =0; i< s.length();i++){
            int count =0;

            char letter = s.charAt(i);

            if (!checked.contains("" + letter)){

            }

            for (int j =0; j<s.length(); j++) {

                char eachLetter = s.charAt(j);

                if (letter == eachLetter) {
                    count++;

                }
            }
            System.out.println(letter + " - " + count );
            checked += letter;

        }

    }

}
