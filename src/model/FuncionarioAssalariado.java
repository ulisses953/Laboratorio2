package model;

import enums.Sexo;

public class FuncionarioAssalariado extends Funcionario {
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getRendimento() {
        return salario;
    }

    public FuncionarioAssalariado(int id, String nome, String cpf, Sexo sexo, double salario) {
        super(id, nome, cpf, sexo);
        this.salario = salario;
    }

    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FuncionarioAssalariado{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", sexo=" + getSexo() +
                ", salario=" + salario +
                '}';
    }

}
