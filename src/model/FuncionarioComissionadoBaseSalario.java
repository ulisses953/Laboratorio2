package model;

import enums.Sexo;

public class FuncionarioComissionadoBaseSalario extends FuncionarioComissionado {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimento() {
        return super.getTaxaComissao() * super.getVendaBrutas() + salario;
    }

    public FuncionarioComissionadoBaseSalario(int id, String nome, String cpf, Sexo sexo, Double taxaComissao,
            Double vendaBrutas, double salario) {
        super(id, nome, cpf, sexo, taxaComissao, vendaBrutas);
        this.salario = salario;
    }

    public FuncionarioComissionadoBaseSalario(Double taxaComissao, Double vendaBrutas, double salario) {
        super(taxaComissao, vendaBrutas);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FuncionarioComissionadoBaseSalario{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", sexo=" + getSexo() +
                ", taxaComissao=" + getTaxaComissao() +
                ", vendaBrutas=" + getVendaBrutas() +
                ", salario=" + salario +
                '}';
    }
}
