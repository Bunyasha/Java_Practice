import java.util.Scanner;
public class HanoiTower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Какое количество дисков содержит ваша пирамида? ");
        int n = in.nextInt();
          
        in.close();
        
        diskMove(n, 'A', 'B', 'C');
        
    }
    public static void diskMove(int n, char A, char B, char C) {
        if (n==1) {
            System.out.println("Диск 1 перемещен c позиции " +A+ " на позицию " +C);
        }
        else {
            diskMove(n-1, A, C, B);
            System.out.println("Диск " +n+ " перемещен c позиции " +A+ " на позицию " +C);
            diskMove(n-1, B, A, C);
        }
        
    }
    
}
