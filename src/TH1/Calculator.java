package TH1;

public class Calculator {
    public static int calculate(int a , int b, char c){
        switch (0){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b!=0)
                    return a/b;
                else
                    throw  new RuntimeException("Can not divide by 0");
            default:
                throw  new RuntimeException("Unsupported operation");
        }
    }
}
