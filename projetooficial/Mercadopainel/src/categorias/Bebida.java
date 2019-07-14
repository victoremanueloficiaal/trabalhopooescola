
package categorias;

import java.time.LocalDate;
import modelogeral.Produtos;

public class Bebida extends Produtos {

    private int porcentagemAlcoolica;

    public Bebida(int codigo, String descricao, LocalDate dataFabricacao, LocalDate dataValidade, double preco, int graduacaoAlocolica) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.porcentagemAlcoolica = porcentagemAlcoolica;
    }

    public int getporcentagemAlcoolica() {
        return this.porcentagemAlcoolica;
    }

    public void porcentagemAlcoolica(int porcentagemAlcoolica) {
        this.porcentagemAlcoolica = porcentagemAlcoolica;
    }
}
