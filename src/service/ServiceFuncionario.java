package service;

import java.util.ArrayList;

import model.Empresa;
import model.Funcionario;

public class ServiceFuncionario {

    public boolean adicionarFuncionario(Empresa empresa,Funcionario funcionario){
        ArrayList<Funcionario> funcionarios = empresa.getFuncionario();
        funcionarios.add(funcionario);
        empresa.setFuncionario(funcionarios);
        return true;
    }

    public double salarioTotal(Empresa empresa){
        double total = 0;
        for (Funcionario funcionario : empresa.getFuncionario()) {
            total +=funcionario.getRendimento();
        }
        return total;
    }

    public Funcionario encontrarFuncionario(Empresa empresa, String cpf){
        for (Funcionario funcionario : empresa.getFuncionario()) {
            if(funcionario.getCpf() == cpf){
                return funcionario;
            }
        }
        return null;
    }

    public boolean RemoverFuncionario(Empresa empresa, String cpf){
        ArrayList<Funcionario> funcionarios = empresa.getFuncionario();
        for (Funcionario funcionario : funcionarios) {
            if(funcionario.getCpf() == cpf){
                funcionarios.remove(funcionario);
                empresa.setFuncionario(funcionarios);
                return true;
            }
        }
        return false;
    }

    public String verFuncionarios(Empresa empresa){
        String resposta = "";
        for (Funcionario funcionario : empresa.getFuncionario()) {
            resposta += funcionario.toString();
        }
        return resposta;
    }
}
