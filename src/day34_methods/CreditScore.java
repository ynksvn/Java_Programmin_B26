package day34_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore(); // this value is not used

        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore());
        System.out.println(getCreditScore()+50);

        System.out.println(isGoodCredit(680));
        System.out.println(isGoodCredit(720));
        System.out.println(isGoodCredit(getCreditScore()));

        System.out.println(isGoodCredit(5000)? "Good Score": "Bad Score");


    }
    public static  int getCreditScore(){
       return 800;
    }
    public static boolean isGoodCredit(int creditScore){
        if (creditScore>=700){
            return true;
        }else{
            return false;
        }

    }
}
