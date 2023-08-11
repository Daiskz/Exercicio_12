import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite sua altura: ");
            double altura = entrada.nextDouble();
            double peso = ((72.7 * altura) - 58);
            System.out.println("Seu peso ideal é : " + peso + "Kg");
        } 
    }
}
