package day36_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1,5,6,2};
        System.out.println(sum(arr));
        System.out.println(sum(4,6,2,3,12,4));

    }
    public static int sum(int ... nums){ // it is still array, intead of [], we put ... It is more flexible. We can add our own array
        //  System.out.println(sum(4,6,2,3,12,4)); = let you do this parameter. it is for any array type. it is not overloading, this is extra topic
       int sum = 0 ;
       for (int each:nums){
           sum += each;
       }
       return sum;
    }
}
