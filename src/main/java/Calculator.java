public class Calculator {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 5;
    
    int sum = add(num1, num2);
    int difference = subtract(num1, num2);
    int product = multiply(num1, num2);
    
    System.out.println(sum+difference +product);
  }
  
  public static int add(int a, int b) {
    return a + b;
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }
  
  public static int multiply(int a, int b) {
    return a * b;
  }
}
