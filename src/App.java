
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a;

        while(sc.hasNext()){
            a = sc.nextInt();
            if(a == 0){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }
        }

        sc.close();
        
        
    }
}
