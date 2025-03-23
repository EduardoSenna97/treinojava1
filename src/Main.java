//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        soma();
        subtracao();
        multiplicacao();
        divisao();

    }

    private static float N1 = 0;
    private static float N2 = 3;

    public static void soma() {
        float S = N1 + N2;
        System.out.println("A soma de N1+N2 é de: " + S);
    }

    public static void subtracao() {
        float D = N1 - N2;
        System.out.println("A diferença entre N1 e N2 é de: " + D);
    }

    public static void multiplicacao() {
        float M = N1 * N2;
        System.out.println("A multiplicação de N1+N2 é de: " + M);
    }

    public static void divisao() {
        if (N1 <= 0 || N2 <= 0) {
            System.out.println("A divisão não pode ocorrer quando o dividendo ou divisor forem 0.");
        } else {
            float div = N1 / N2;
            System.out.println("O resultado da divisão de N1 e N2 é de: " + div);

        }
    }
}


