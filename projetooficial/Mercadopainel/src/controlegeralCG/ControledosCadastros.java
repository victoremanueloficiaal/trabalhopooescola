package controlegeralCG;

import modelogeral.Proprietario;
import modelogeral.Produtos;
import categorias.Bebida;
import categorias.Alimentos;
import categorias.Limpeza;
import modelogeral.Mercadinho;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControledosCadastros {

    private final Scanner entrada;
    private final DateTimeFormatter formatoData;

    
   
    String descricao_produto;
    String data_de_fabricacao;
    String dataValidadeproduto;
    double precoproduto;
    int codigo_produto;
    
    
    String nome_mercadinho;
    String nome_proprietario;
    String dataNascimentoproprietario;
    String sexoproprietario;
    
   
    Produtos produto;
    
    
    Mercadinho mercadinho;
    
    public ControledosCadastros() {
        entrada = new Scanner(System.in);
        formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }

    
    public Produtos cadastraDadosProduto(Mercadinho mercadinho) {
        this.mercadinho = mercadinho;
        perguntarDadosProduto();
        Produtos produto = new Produtos(codigo_produto, descricao_produto, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidadeproduto, formatoData), precoproduto);
        while (true) {
            System.out.println("\n\nEscolha a categoria dos produtos:\n"
                    + "[1] para Alimentos\n"
                    + "[2] para Limpeza\n"
                    + "[3] para Bebidas");
            int escolha = entrada.nextInt();
            switch (escolha) {
                case 1: {
                    System.out.println("Escolha Uma classificação [1]NATURAL [2]ARTIFICIAL");
                    int opcao = entrada.nextInt();
                    String classificacaoprodutos = (opcao == 1) ? "Natural" : "Artificial";
                    produto = new Alimentos(codigo_produto, descricao_produto, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidadeproduto, formatoData), precoproduto, classificacaoprodutos);
                    break;
                }
                case 2: {
                    System.out.println("O produto é toxico [1]SIM [2]NÃO");
                    int opcao = entrada.nextInt();
                    boolean toxico = (opcao == 1) ? true : false;
                    produto = new Limpeza(codigo_produto, descricao_produto, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidadeproduto, formatoData), precoproduto, toxico);
                    break;
                }
                case 3: {
                    System.out.println("Informe O Nivel de alcool da bebida:");
                    int porcentagemAlcolica = entrada.nextInt();
                    produto = new Bebida(codigo_produto, descricao_produto, 
                            LocalDate.parse(data_de_fabricacao, formatoData),
                            LocalDate.parse(dataValidadeproduto, formatoData), precoproduto, porcentagemAlcolica);
                    break;
                }
                default:
                    System.out.println("VALOR INVÁLIDO");
            }
            System.out.println("O código do produto é " + codigo_produto);
            return produto;
        }
    }
    
    
    private void perguntarDadosProduto(){
        System.out.println("\n\n|---DADOS Dos PRODUTO---|");
        System.out.println("Informe a descrição:");
        descricao_produto = entrada.nextLine();
        System.out.println("Informe a Data de fabricação:");
        data_de_fabricacao = entrada.nextLine();
        System.out.println("Informe a Data de validade:");
        dataValidadeproduto = entrada.nextLine();
        System.out.println("Informe o preco do produto:");
        precoproduto = Double.valueOf(entrada.nextLine());
        codigo_produto = geraCodigoProduto();
    }

    
    private void perguntarDadosPropietario(){
        System.out.println("**********Mercadinho*************");
        System.out.println("Informe o nome do Mercadinho:");
        nome_mercadinho = entrada.nextLine();
        System.out.println("\n\n|---DADOS PROPRIETÁRIO---|");
        System.out.println("Informe o nome Do Proprietario:");
        nome_proprietario = entrada.nextLine();
        System.out.println("Informe sua Data de nascimento (dd/MM/yyyy):");
        dataNascimentoproprietario = entrada.nextLine();
        System.out.println("Informe o seu sexo:");
        String entradaSexo = entrada.nextLine();
        if(entradaSexo.charAt(0) == 'm' || entradaSexo.charAt(0) == 'M'){
            sexoproprietario = "Masculino";
        }else{
            sexoproprietario = "Feminino";
        }
    }
    
    public Mercadinho cadastraMercadinhoProprietario() {
        perguntarDadosPropietario();
        return new Mercadinho(nome_mercadinho, new Proprietario(nome_proprietario,
                LocalDate.parse(dataNascimentoproprietario, formatoData), sexoproprietario));
    }

    private int geraCodigoProduto() {
        int quantidadeDeProdutos = mercadinho.getQuantidade();
        codigo_produto = quantidadeDeProdutos + 1;
        return codigo_produto;
    }

}
