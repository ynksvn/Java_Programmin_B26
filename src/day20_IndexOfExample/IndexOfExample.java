package day20_IndexOfExample;

public class IndexOfExample {
    public static void main(String[] args) {

        String word = "banana";
                   //  012345

        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex);
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);

        int secondIndex = word.indexOf('a', firstIndex +1); // starting point will be 2
        System.out.println(secondIndex);                            //  banana
                                                                    //  012
        int thirdIndex = word.indexOf('a', secondIndex + 1);
        System.out.println(thirdIndex);




    }

}
