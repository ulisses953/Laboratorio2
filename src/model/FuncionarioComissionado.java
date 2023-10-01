package model;

import enums.Sexo;

public class FuncionarioComissionado extends Funcionario {
    private Double taxaComissao;
    private Double vendaBrutas;

    public Double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(Double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public Double getVendaBrutas() {
        return vendaBrutas;
    }

    public void setVendaBrutas(Double vendaBrutas) {
        this.vendaBrutas = vendaBrutas;
    }

    @Override
    public double getRendimento() {
        return taxaComissao * vendaBrutas;
    }

    public FuncionarioComissionado(int id, String nome, String cpf, Sexo sexo, Double taxaComissao,
            Double vendaBrutas) {
        super(id, nome, cpf, sexo);
        this.taxaComissao = taxaComissao;
        this.vendaBrutas = vendaBrutas;
    }

    public FuncionarioComissionado(Double taxaComissao, Double vendaBrutas) {
        this.taxaComissao = taxaComissao;
        this.vendaBrutas = vendaBrutas;
    }

    public String toString() {
        return "FuncionarioComissionado{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", sexo=" + getSexo() +
                ", taxaComissao=" + taxaComissao +
                ", vendaBrutas=" + vendaBrutas +
                '}';
    }

}
