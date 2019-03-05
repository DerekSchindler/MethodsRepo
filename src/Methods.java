public class Methods {

    public static void main(String[] args){
        //write code here
        printGreeting();

        greetings("Derek");

        System.out.println(multiply(5,2));

        


    }
    public static void printGreeting(){
        System.out.println("Hello World");
    }
    public static void greetings(String name){
        System.out.println("Hello "+ name);
    }
    public static int multiply(int num1, int num2){
        int product = num1*num2;
        return product;
    }
}
