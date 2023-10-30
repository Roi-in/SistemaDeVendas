package sistemavendas;

import java.util.List;
import java.util.Scanner;

public class Venda  {
	Scanner entrada = new Scanner (System.in);
	private Carrinho carrinho;	
	private double saldoDoCliente;
	
    public Venda(Carrinho carrinho) {
        this.carrinho = carrinho;
        this.saldoDoCliente =0;
    }
    	
	public double getSaldoDoCliente() {
		return saldoDoCliente;
	}

	public void setSaldoDoCliente(double saldoDoCliente) {
		this.saldoDoCliente = saldoDoCliente;
	}

	public double processarCompra() {
		double totalinicial = carrinho.calcularTotal();
	    double total = carrinho.calcularTotal();
		double limiteDePagamento = total*0.7;
        System.out.println("Selecione a forma de pagamento: ");
        System.out.println("[1] para cartão de crédito");
        System.out.println("[2] para cartão de débito");
        System.out.println("[3] para dinheiro");
        int formaDePagamento = entrada.nextInt();
		switch (formaDePagamento) {	
		case 1:
			System.out.println("Credito selecionado");
			System.out.println("_________________________________________________");
			System.out.println("Você pode adicionar um outro produto");
			System.out.println("_________________________________________________");
			System.out.println("Digite o nome do produto que deseja adicionar: ");
			System.out.println("_________________________________________________");
			String nomeprod = entrada.next();
			System.out.println("Digite o valor do produto: ");
			System.out.println("_________________________________________________");
			double precoprod = entrada.nextDouble();
			
			if (precoprod > 0.1* total) {
				Produto produto = new Produto(nomeprod, precoprod);
				carrinho.adicionarProduto(produto);
				System.out.println("Produto adicionado com sucesso");
			} else {
				System.out.println("adicione um produto mais caro");
			}
			break;
			
		case 2:
			System.out.println("debito selecionado, uma taxa de 20% será aplicada");
			System.out.println("_________________________________________________");

			 if (total > limiteDePagamento) {
				 double diferenca = total - limiteDePagamento;
				Produto produtoRemover = encontrarItem(carrinho, diferenca);
				 if (produtoRemover != null) {
	                 carrinho.removerProduto(produtoRemover);
	                 System.out.println("um item foi removido para que caiba no seu orcamento seu pobre: " + produtoRemover.getNome());
	                 total = carrinho.calcularTotal(); //
	 

				 }
			 }
			 	total = total * 1.2;
			break;
		case 3:
			System.out.println("Dinheiro selecionado, um desconto de 10% será aplicado");
			System.out.println("_________________________________________________");
			if (total > limiteDePagamento) {
				 double diferenca = total - limiteDePagamento;
				Produto produtoRemover = encontrarItem(carrinho, diferenca);
				 if (produtoRemover != null) {
	                 carrinho.removerProduto(produtoRemover);
	                 System.out.println("Item removido do carrinho: " + produtoRemover.getNome());
	                 total = carrinho.calcularTotal(); //
				 }
			 }
				total = total*0.9;
			break;
			
		 default:
	            System.out.println("Opção inválida, tente novamente");
			
		}
		 	saldoDoCliente = limiteDePagamento;
		 	System.out.println("Total da compra antes dos descontos/taxas: " + totalinicial);
	        return total;
	}
	
	
	private Produto encontrarItem(Carrinho carrinho, double diferenca ) {
		List<Produto> produtos = carrinho.getProdutos();
		Produto produtoMais = null;
		double diferencaMaisProx = Double.MAX_VALUE;
		
		for(Produto produto : produtos) {
			double diferencaAtual = Math.abs(produto.getPreco()-diferenca);
			if (diferencaAtual<diferencaMaisProx) {
				diferencaMaisProx=diferencaAtual;
				produtoMais = produto;
			}
		}
		return produtoMais;
	}
	
	public void mensagem() {
		System.out.println("Por favor, escolha uma das seguintes opções:");
		System.out.println("[1] Adicionar item ao carrinho");
		System.out.println("[2] Remover item do carrinho");
		System.out.println("[3] Concluir a compra");
		System.out.println("[4] Cancelar a compra");


	}
	


}
