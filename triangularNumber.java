import java.util.Scanner;

public class triangularNumber{
    public static void main(String[] args) {
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите n для треугольного числа : ");
            int numberN = in.nextInt();
              
            in.close();
        
       

        for (int i = 1; i <= numberN; i++) {
            int triangular = 0;

            for (int j = 1; j <= i; j++) {
                triangular = triangular + j;
            }
            System.out.println(i + " = " + triangular);
          
        }
    }
}
}