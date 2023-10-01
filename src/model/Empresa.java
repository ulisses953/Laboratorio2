package model;

import java.util.ArrayList;

public class Empresa {
    private String name;
    private String description;
    private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
}
