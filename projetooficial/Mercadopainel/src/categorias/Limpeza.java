
package categorias;

import java.time.LocalDate;
import modelogeral.Produtos;

/**
 *
 * @author pcvictor
 */
public class Limpeza extends Produtos {

    private boolean nocivo;

    public Limpeza(int codigo, String descricao, LocalDate dataFabricacao,
            LocalDate dataValidade, double preco, boolean nocivo) {
        super(codigo, descricao, dataFabricacao, dataValidade, preco);
        this.nocivo = nocivo;
    }

    public boolean isToxico() {
        return this.nocivo;
    }

    public void setToxico(boolean Toxico) {
        this.nocivo = nocivo;
    }
}
