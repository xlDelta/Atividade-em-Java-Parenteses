import java.util.Scanner;

public class Verifica {
    public static boolean Verifica(String expressao) {
        CriarPilha pilha = new CriarPilha();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                char topo = pilha.pop();
                if (topo == '\0' || !corresponde(topo, c)) {
                    return false;
                }
            }
        }
        return pilha.isEmpty();
    }

    private static boolean corresponde(char abertura, char fechamento) {
        return (abertura == '(' && fechamento == ')') ||
               (abertura == '[' && fechamento == ']') ||
               (abertura == '{' && fechamento == '}');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a expressao: ");
        String expressao = scanner.nextLine();
        
        if (Verifica(expressao)) {
            System.out.println("Expressao correta");
        } else {
            System.out.println("Expresao incorreta!");
        }
        
        scanner.close();
    }
}
