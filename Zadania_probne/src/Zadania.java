
import java.util.Scanner;


public class Zadania {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nr zadania: ");
        int n = input.nextInt();
        
        MojeZadania z1 = new MojeZadania(n);
        
        
    }
    
}
