package sistemavendas;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Produto> produtos;
	
	
	public Carrinho() {
		produtos = new ArrayList<>();
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (Produto produto: produtos) {
			total += produto.getPreco();
		}
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

/*	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}*/
	

}
