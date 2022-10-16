import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite sua altura: ");
            double h = entrada.nextDouble();
            double w = ((72.7 * h) - 58);
            System.out.println("Seu peso ideal é : " + w + "Kg");
        } 
    }
}
