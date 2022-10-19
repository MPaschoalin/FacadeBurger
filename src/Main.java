import java.util.Scanner;

    public class Main {
            public static void main(String[] args) {
                    System.out.println("Selecione seu combo");
                    System.out.println("1. Combo de Cria");
                    System.out.println("2. GigaChad Super");
                    System.out.print("Sua escolha: ");

                    Scanner input = new Scanner(System.in);

                    int tipo = input.nextInt();
                    Combo combo = new Combo();
                    combo.Combos(tipo);
                    System.out.println(combo);
            }
    }
