public class Main{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 5;
        String operator = "+";
        if(operator == "+"){
            System.out.println(num1+num2);
        }
        else if(operator == "-"){
            System.out.println(num1-num2);
        }
        else if(operator == "*"){
            System.out.println(num1*num2);
        }
        else{
            System.out.println(num1/num2);
        }
    }
}