import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.Scanner;

import src.calcMDC;
import src.seqFibonacci;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.print("1) ");

        Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Bia");
        fila.add("Maria");
        fila.add("Joana");          
        fila.add("Luiza"); 
        fila.add("Rosa");  
        
        Random foraFila = new Random();
        int num = 0;
        while (num == 0){
            num = foraFila.nextInt(6);
        }
        System.out.println("Batata quente, quente, quente, queimou... posição: " + num);
        while (fila.size() > 1){
            for (int i = 0; i < num; i++) {
                fila.add(fila.remove()); 
            }
            System.out.println("Queimou com: " + fila.remove());
        }

        System.out.println(fila + "Venceu!");

        System.out.print("2) ");

        Scanner palindromo = new Scanner(System.in);
        String valorPalindromo = "";

        while (!valorPalindromo.equalsIgnoreCase("esc")) {
            System.out.print("Informe um valor ou 'esc' para sair: ");
            valorPalindromo = palindromo.next();

            String invertida = new StringBuffer(valorPalindromo).reverse().toString();

            if (valorPalindromo.equalsIgnoreCase(invertida)) {
                System.out.printf("Você digitou: %s, isso é uma sequência Palindroma.\n", valorPalindromo);
            } else {
                System.out.printf("O que foi digitado (%s) não é uma sequência de caracteres.\n", valorPalindromo);
            }
        }

        System.out.print("3) ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho da sequência de fibonacci desejado: ");
        int valorFibo = sc.nextInt();

        for (int i = 0; i < valorFibo; i++) {
            System.out.print(seqFibonacci.fibonacci(i) + " \n\n");
        }

        System.out.println("4) MENU");

        Scanner valorEntrada = new Scanner(System.in);
        int sair = 0;

        Stack<Integer> pilha = new Stack<Integer>();
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        while (sair != 5) {

            System.out.println("1. Empilhar elemento. ");
            System.out.println("2. Desempilhar elemento. ");
            System.out.println("3. Mostrar o topo. ");
            System.out.println("4. Imprimir tudo zerando a pilha. ");
            System.out.println("5. Sair! \n");

            System.out.print("Escolha uma opção: ");
            sair = valorEntrada.nextInt();

            if (sair == 1) {
                System.out.print("Informe o valor para empilhar: ");
                int valorpilha = valorEntrada.nextInt();
                pilha.push(valorpilha);
            } else if (sair == 2) {
                if (!pilha.isEmpty()) {
                    System.out.print("Informe o valor para desempilhar: ");
                    pilha.pop();
                    System.out.println("\nItem desempilhado!");
                } else {
                    System.out.println("Não há elementos na pilha!");
                }
            } else if (sair == 3) {
                if (!pilha.isEmpty()) {
                    System.out.println("O topo da pilha é: " + pilha.lastElement());
                } else {
                    System.out.println("Não há elementos na pilha!");
                }
            } else if (sair == 4) {
                System.out.print("Impressão da pilha: ");
                for (int i = pilha.size() - 1; i >= 0; i--) {
                    System.out.print(pilha.get(i) + " ");
                }
                System.out.println("\nPilha zerada!");
                pilha.clear();
            }
            System.out.println("|-----|");
        }

        Scanner valorMDC = new Scanner(System.in);

        System.out.print("5) ");

        calcMDC mdc = new calcMDC();

        while (true) {
            System.out.print("Informe um valor para calcular o MDC: ");
            int valor1 = valorMDC.nextInt();
            System.out.print("Informe outro valor para calcular o MDC: ");
            int valor2 = valorMDC.nextInt();

            if (valor1 == -1 || valor2 == -1)
                break;

            int resultado = mdc.mdc(valor1, valor2);

            System.out.println("MDC: " + resultado);
            break;
        }
    }
}