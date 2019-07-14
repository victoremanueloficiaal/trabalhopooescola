
package categorias;

import java.time.LocalDate;
import modelogeral.Produtos;

public class Alimentos extends Produtos {

    private String tipo;
    private final String classificacao;

    public Alimentos(int codigo, String descricao, LocalDate dataFabricacao,
            LocalDate dataValidade, double preco, String classificacao) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.classificacao = classificacao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
