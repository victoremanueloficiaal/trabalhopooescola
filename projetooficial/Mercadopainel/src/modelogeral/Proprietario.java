package modelogeral;

import java.time.LocalDate;

public class Proprietario {

    private String nome_proprietario;
    private LocalDate dataNascimentoproprietario;
    private String sexoproprietario;

    public Proprietario(String nome, LocalDate dataNascimento, String sexo) {
        this.nome_proprietario = nome;
        this.dataNascimentoproprietario = dataNascimento;
        this.sexoproprietario = sexo;
    }

    public String getNome() {
        return this.nome_proprietario;
    }

    public void setNome(String nome) {
        this.nome_proprietario = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimentoproprietario;
    }

    public void setDataNascimento(LocalDate dataNascimentoproprietario) {
        this.dataNascimentoproprietario = dataNascimentoproprietario;
    }

    public String getSexo() {
        return this.sexoproprietario;
    }

    public void setSexo(String sexo) {
        this.sexoproprietario = sexo;
    }
}
