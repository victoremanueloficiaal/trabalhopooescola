package modelogeral;

interface Cadastros {

    boolean incluirProduto(Produtos var1);

    Produtos consultar(int var1);

    boolean alterar(Produtos var1);

    boolean remover(int var1);

    int quantidade();

    double placmercadoria();

    Produtos produtoold();

    Produtos[] vencido();
}
