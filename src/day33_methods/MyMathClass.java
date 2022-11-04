package day33_methods;

public class MyMathClass {
    public static void add(double nums, double nums2) {

        System.out.println("Sum: " + nums + " + " + nums2 + " = " + (nums + nums2));
    }

    public static void multp(double nums, double nums2) {
        System.out.println("Multiplication:" + nums + " x " + nums2 + " = " + (nums * nums2));
    }

    public static void subs(double nums, double nums2) {
        System.out.println("Subtract:" + nums + " - " + nums2 + " = " + (nums - nums2));
    }

    public static void division(double nums, double nums2) {
        if(nums2 !=0) {

            System.out.println("Divide:" + nums + " / " + nums2 + " = " + (nums / nums2));
        }else {
            System.out.println("Cannot divide by 0");
        }}

            public static void main (String[]args){
                add(4.5, 6.1);
                add(4, 6);
                // int a = add(3.4, 12.2);  we cannot assign anything, because our methods are void, there is no return value

                division(4, 0);

        }
        }



