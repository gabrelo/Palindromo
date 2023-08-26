package application;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        sc.close();
        
        if (isPalindrome(palavra)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
    
    public static boolean isPalindrome(String palavra) {
        palavra = palavra.toLowerCase(); // Converter para minúsculas para comparação sem diferenciação de maiúsculas/minúsculas
        int esquerda = 0;
        int direita = palavra.length() - 1;
        
        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }
}

