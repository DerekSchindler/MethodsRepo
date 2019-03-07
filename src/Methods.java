public class Methods {

    public static void main(String[] args){
        //write code here
        printGreeting();

        greetings("Derek");

        System.out.println(multiply(5,2));

        System.out.println(divide(13.6,5.7));

        max(3.5,10.75);

    }
    public static void printGreeting(){
        System.out.println("Hello World");
    }
    public static void greetings(String name){
        System.out.println("Hello "+name);
    }
    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }
    public static double divide(double num1, double num2){
        double answer = num1/num2;
        return answer;
    }
    public static void max(double num1, double num2){
        if(num1>num2){
             System.out.println(num1+" is the larger number.");
        }
        else if(num1<num2){
            System.out.println(num2+" is the larger number.");
        }
        else if(num1==num2){
            System.out.println("The numbers are equal");
        }
    }
    
}
