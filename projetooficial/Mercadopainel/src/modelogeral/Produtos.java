
package modelogeral;

import java.time.LocalDate;

public class Produtos {

    private int codigo_produto;
    private String descricao_produto;
    private LocalDate dataDeFabricacaoproduto;
    private LocalDate dataDeValidadeproduto;
    private double precoproduto;

    public Produtos(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public Produtos(int codigo_produto, String descricao_produto, LocalDate dataDeFabricacaoproduto, LocalDate dataDeValidadeproduto, double precoproduto) {
        this.codigo_produto = codigo_produto;
        this.descricao_produto = descricao_produto;
        this.dataDeFabricacaoproduto = dataDeFabricacaoproduto;
        this.dataDeValidadeproduto = dataDeValidadeproduto;
        this.precoproduto = precoproduto;
    }

    public int getcodigo_produto() {
        return this.codigo_produto;
    }

    public void setcodigo_produto(int codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getDescricao_produto() {
        return this.descricao_produto;
    }

    public void setDescricao_produto(String descricao) {
        this.descricao_produto = descricao_produto;
    }

    public LocalDate getDataDeFabricacaoproduto() {
        return dataDeFabricacaoproduto;
    }

    public void setDataDeFabricacaoproduto(LocalDate dataDeFabricacaoproduto) {
        this.dataDeFabricacaoproduto = dataDeFabricacaoproduto;
    }

    public LocalDate getDataDeValidadeproduto() {
        return this.dataDeValidadeproduto;
    }

    public void setDataDeValidadeproduto(LocalDate dataDeValidadeproduto) {
        dataDeValidadeproduto = dataDeValidadeproduto;
    }

    public double getPrecoproduto() {
        return precoproduto;
    }

    public void setPrecoproduto(double precoproduto) {
        this.precoproduto = precoproduto;
    }

    @Override
    public String toString() {
        return "Produtos{\n    "
                + "Codigo_produto= " + codigo_produto + ",\n    "
                + "Descricao do produto= '" + descricao_produto + '\'' + ",\n    "
                + "Data De Fabricacao do produto= " + dataDeFabricacaoproduto + ",\n    "
                + "Data De Validade Do Produto= " + dataDeValidadeproduto + ",\n    "
                + "preÇo Do Produto= " + precoproduto + "\n}";
    }

}
