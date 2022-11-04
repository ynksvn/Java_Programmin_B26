package day24_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "abcabc";
        String unique = "";


/* iteration 1: i=0 which means start counting from beginning
charAt(i) --> charAt(0) --> a
uniques = ""; = is empty
if(!unique.contains("a")) = uniques contains ("a") does unique not contain a, yes
then unique gets a, same for b and c until it repeats. When there is a duplicate, it doesn't add it because the way we created the code
i++ =
 */for (int i = 0; i < str.length(); i++) {
            if (!unique.contains("" + str.charAt(i))) {
                unique += str.charAt(i);
            }

        }
        System.out.println(unique);
    }
 }