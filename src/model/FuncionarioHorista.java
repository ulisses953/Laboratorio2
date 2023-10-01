package model;

import enums.Sexo;

public class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadasNaSemana;
    private double salarioPorHora;

    @Override
    public double getRendimento() {
        if (horasTrabalhadasNaSemana > 40) {
            return 40 * salarioPorHora + (horasTrabalhadasNaSemana - 40) * salarioPorHora * 1.5;
        } else {
            return salarioPorHora * horasTrabalhadasNaSemana;
        }
    }

    public int getHorasTrabalhadasNaSemana() {
        return horasTrabalhadasNaSemana;
    }

    public void setHorasTrabalhadasNaSemana(int horasTrabalhadasNaSemana) {
        this.horasTrabalhadasNaSemana = horasTrabalhadasNaSemana;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public FuncionarioHorista(int id, String nome, String cpf, Sexo sexo, int horasTrabalhadasNaSemana,
            double salarioPorHora) {
        super(id, nome, cpf, sexo);
        this.horasTrabalhadasNaSemana = horasTrabalhadasNaSemana;
        this.salarioPorHora = salarioPorHora;
    }

    public FuncionarioHorista(int horasTrabalhadasNaSemana, double salarioPorHora) {
        this.horasTrabalhadasNaSemana = horasTrabalhadasNaSemana;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", sexo=" + getSexo() +
                ", horasTrabalhadasNaSemana=" + horasTrabalhadasNaSemana +
                ", salarioPorHora=" + salarioPorHora +
                '}';
    }

}
