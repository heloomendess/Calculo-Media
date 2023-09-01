import java.util.Scanner;

public class mediaNota {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float p1 = 0.4f, p2 = 0.5f, p3 = 0.1f;
    //se colocar como "double" não precisa do f no final dos números
    // double é o dobro de um float (armazena mais números)

    System.out.print("Prova 1: ");
    float prova1 = entrada.nextFloat();

    System.out.print("Prova 2: ");
    float prova2 = entrada.nextFloat();

    System.out.print("Prova 3: ");
    float prova3 = entrada.nextFloat();

    float mediaNota = (prova1 * p1) + (prova2 * p2) + (prova3 * p3);
    System.out.println("Média final: " + mediaNota);

    entrada.close();
    }
}
