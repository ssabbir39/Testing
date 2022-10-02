import java.util.Scanner;

class SumCal{
    int a, b;
    void takeInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a (1 - 5) = ");
        a = input.nextInt();
        System.out.print("Enter the value of b (1 - 4) = ");
        b = input.nextInt();
        input.close();
    }
    double calculation(int x, int y)
    {
        double sum = ( x + y )/0.2;
        return Math.pow(sum, 0.2);
    }
}
public class App {
    public static void main(String [] args)
    {
        SumCal obj = new SumCal();
        obj.takeInput();
        double sum1 = obj.calculation(obj.a, obj.b);
        System.out.println("The sum = ((a + b)/0.2) ^ 0.2 =  " + sum1);

    }    
}