package sistemavendas;

import java.util.Scanner;

public class SistemaDeVendas {

	public static void main(String[] args) {
		ProcessoPrincipal processoprincipal = new ProcessoPrincipal();
		processoprincipal.principalProcesso();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
/*		Scanner entrada = new Scanner (System.in);
		boolean loop = true;
		double total = 0;
		Carrinho carrinho = new Carrinho();
		Venda venda = new Venda(carrinho);
		System.out.println("Bem vindo a lojinha do Januario");
		System.out.println("Como estamos em uma nova era, tudo é feito automaticamente " + "apenas digite o produto e o valor dele logo em seguida");
		venda.mensagem();
		do {
			
			int escolha = entrada.nextInt();
			switch (escolha) {		
			case 1:
				System.out.println("Digite o nome do produto que deseja adicionar: ");
				String nomeprod = entrada.next();
				System.out.println("Digite o valor do produto: ");
				double precoprod = entrada.nextDouble();
				
				Produto adicionar = new Produto(nomeprod, precoprod);
				carrinho.adicionarProduto(adicionar);
				System.out.println("Item adicionado");
				venda.mensagem();
				
				break;
				
			case 2:
				System.out.println("Digite o nome do produto que deseja remover: ");
				String nomepro = entrada.next();
				System.out.println("Digite o valor do produto: ");
				double precopro = entrada.nextDouble();
				
				Produto remover = new Produto(nomepro, precopro);
				if (carrinho.getProdutos().contains(remover)) {
			        carrinho.removerProduto(remover);
			        System.out.println("Produto removido com sucesso");
			    } else {
			        System.out.println("O produto não está no carrinho.");
			    }
				venda.mensagem();
				break;
				
			case 3:
				
				loop = false;
				System.out.println("Compra concluida, iremos analisar agora");
				total = venda.processarCompra();
				System.out.println("Total da compra: " + total);
                System.out.println("Saldo do cliente: " + venda.getSaldoDoCliente());
				 	
				break;
				
			case 4:
				
				loop = false;
				System.out.println("Compra cancelada");
				break;
				
			default:
				System.out.println("opcao invalidade, tente novamente");
			}
			
		} while (loop);
		
	
	
	*/
	}
	

}
