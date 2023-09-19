package br.com.poo.lista2;

import java.util.Scanner; 

public class Exercicio3L2  { 
	
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        String[] produtos = {"chapeus", "oculos", "relógios ","pulseiras","brincos","cordões"}; 
        
        int opc;
        int v;

        do {
            System.out.print("Escolha uma opção:\n" + "1 - Produtos com estoque\n"
                    + "2 - Produtos sem estoque\n"
                    + "3 - Sair\n"
                    + "Opção: ");
            opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("\nAqui estão nossos produtos com estoque:\n"
                            + produtos[0] + "\n"
                            + produtos[1] + "\n"
                            + produtos[2] + "\n");
                    System.out.print("\nDigite (1) para voltar ao menu ou (2) para sair: ");
                    v = scanner.nextInt();
                    if (v == 1) {
                        break;
                    } else if (v == 2) {
                        System.out.println("Obrigado e volte sempre!");
                        return;
                    }
                    break;

                case 2:
                    System.out.println("\nAqui estão nossos produtos sem estoque:\n"
                            + produtos[3] + "\n"
                            + produtos[4] + "\n"
                            + produtos[5] + "\n");
                    System.out.print("\nDigite (1) para voltar ao menu ou (2) para sair: ");
                    v = scanner.nextInt();
                    if (v == 1) {
                        break;
                    } else if (v == 2) {
                        System.out.println("Obrigado e volte sempre!");
                        return;
                    }
                    break;

                case 3:
                    System.out.print("Deseja realmente sair? Digite (1) para sim, ou 2 para não: ");
                    v = scanner.nextInt();
                    if (v == 1) {
                        System.out.println("\nObrigado e volte sempre!");
                        return;
                    } else if (v == 2) {
                        break;
                    }
                    break;

                default:
                    System.out.println("Opção inválida! Encerrando o programa...");
                    break;
                    
            }
        } while (true);
    }
}
