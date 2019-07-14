package modelogeral;

import java.util.ArrayList;

public class Mercadinho implements Cadastros {

    private final String nome_mercadinho;
    private final Proprietario proprietario;
    private final ArrayList<Produtos> estoque;
    private static int quantidade;

    public Mercadinho(String nome_mercadinho, Proprietario proprietario) {
        this.nome_mercadinho = nome_mercadinho;
        this.proprietario = proprietario;
        estoque = new ArrayList<>(1000);
        quantidade = estoque.size();
        
    }

    public String getNome_mercadinho() {
        return this.nome_mercadinho;
    }

    public Proprietario getproprietario() {
        return proprietario;
    }

    public ArrayList<Produtos> getEstoque() {
        return this.estoque;
    }
    public boolean isLimpo(){
        if(estoque.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean adicionar(Produtos produtos) {
        if (quantidade < 1000) {
            estoque.add(produtos);
            ++quantidade;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Produtos consultar(int codigo_produto) {
        if (quantidade > 0) {
            for (int x = 0; x < quantidade; ++x) {
                if (estoque.get(x).getcodigo_produto() == codigo_produto) {
                    return estoque.get(x);
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @Override
    public boolean alterar(Produtos produtos) {
        for (int x = 0; x < quantidade; ++x) {
            if (estoque.get(x).getcodigo_produto() == produtos.getcodigo_produto()) {
                estoque.add(x, produtos);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remover(int codigo_produto) {
        for (int x = 0; x < quantidade; x++) {
            
            if (estoque.get(x).getcodigo_produto() == codigo_produto) {
                estoque.remove(x);
                quantidade--;
                return true;
            }
            
        }
        return false;
    }

    @Override
    public int quantidade() {
        return quantidade;
    }

    @Override
    public double placmercadoria() {
        double preco = 0.0D;

        for (int indice = 0; indice < estoque.size(); ++indice) {
            Produtos produto = estoque.get(indice);
            preco += produto.getPrecoproduto();
        }
        return preco;
    }

    @Override
    public Produtos produtoold() {
        return null;
    }

    @Override
    public Produtos[] vencido() {
        return new Produtos[0];
    }
    
    @Override
    public String toString() {
        return "mercado{\n    "
                + "nome= '" + nome_mercadinho + '\'' + ",\n    "
                + "proprietario= '" + proprietario + '\'' + ",\n    "
                + "estoque= " + estoque.toString() + "\n"
                + "}";
    }

    @Override
    public boolean incluirProduto(Produtos produtos) {
        return estoque.add(produtos);
    }
    
    public int getQuantidade() {
        return estoque.size();
    }

    public boolean removerEstoque(int codigo_produto) {
        Produtos produto = new Produtos(codigo_produto);
        return estoque.remove(produto);
    }

    public Produtos consultarProduto(int codigo_produto) {
        return estoque.get(codigo_produto - 1);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
}
