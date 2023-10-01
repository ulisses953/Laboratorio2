package UI;

import java.util.Scanner;

import enums.Sexo;
import model.Empresa;
import model.Funcionario;
import model.FuncionarioAssalariado;
import model.FuncionarioComissionado;
import model.FuncionarioComissionadoBaseSalario;
import model.FuncionarioHorista;
import service.ServiceFuncionario;

public class Tela {
    public static void show() {
        Empresa ep = new Empresa();
        ServiceFuncionario sf = new ServiceFuncionario();
        Funcionario fu; 
        Scanner scanner = new Scanner(System.in);
        int opcao,id,horasTrabalhadasNaSemana;
        Sexo sexo;
        String cpf,nome,sexoInput;
        double salario,taxaComissao,vendaBrutas,salarioPorHora;


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("0- Sair");
            System.out.println("1- Adicionar funcionário assalariado");
            System.out.println("2- Adicionar funcionário comissionado");
            System.out.println("3- Adicionar funcionário horista");
            System.out.println("4- Adicionar funcionário comissionado com salário base");
            System.out.println("5- Procurar funcionário");
            System.out.println("6- Ver funcionário");
            System.out.println("7- Excluir funcionário");
            System.out.println("8- salario a pagar");
            

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    System.out.print("Sexo (M ou F): ");
                    sexoInput = scanner.nextLine();
                    sexo = Sexo.Masculino; // Valor padrão

                    if (sexoInput.equalsIgnoreCase("F")) {
                        sexo = Sexo.Feminino;
                    }

                    System.out.print("Salário: ");
                    salario = scanner.nextDouble();

                    sf.adicionarFuncionario(ep,new FuncionarioAssalariado(id, nome, cpf, sexo, salario));
                    break;
                case 2:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    System.out.print("Sexo (M ou F): ");
                    sexoInput = scanner.nextLine();
                    sexo = Sexo.Masculino; 

                    if (sexoInput.equalsIgnoreCase("F")) {
                        sexo = Sexo.Feminino;
                    }
                    System.out.print("Taxa Comissao: ");
                    taxaComissao = scanner.nextDouble();

                    System.out.print("Venda bruta: ");
                    vendaBrutas = scanner.nextDouble();

                    sf.adicionarFuncionario(ep, new FuncionarioComissionado(id, nome, cpf, sexo, taxaComissao, vendaBrutas));
                    
                    break;
                case 3:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    System.out.print("Sexo (M ou F): ");
                    sexoInput = scanner.nextLine();
                    sexo = Sexo.Masculino; 

                    if (sexoInput.equalsIgnoreCase("F")) {
                        sexo = Sexo.Feminino;
                    }
                    System.out.print("horas trabalhada na semana: ");
                    horasTrabalhadasNaSemana = scanner.nextInt();

                    System.out.print("Salario por hora: ");
                    salarioPorHora = scanner.nextDouble();

                    sf.adicionarFuncionario(ep,new FuncionarioHorista( id,nome,cpf,sexo,horasTrabalhadasNaSemana,salarioPorHora));
                    break;
                case 4:
                    System.out.print("ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nome: ");
                    nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    System.out.print("Sexo (M ou F): ");
                    sexoInput = scanner.nextLine();
                    sexo = Sexo.Masculino; // Valor padrão

                    if (sexoInput.equalsIgnoreCase("F")) {
                        sexo = Sexo.Feminino;
                    }

                    System.out.print("Salário: ");
                    salario = scanner.nextDouble();

                    System.out.print("taxa Comissao: ");
                    taxaComissao = scanner.nextDouble();

                    System.out.print("venda Brutas: ");
                    vendaBrutas = scanner.nextDouble();

                    sf.adicionarFuncionario(ep,new FuncionarioComissionadoBaseSalario(id, nome, cpf, sexo,taxaComissao,vendaBrutas, salario));
                    break;
                case 5:
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    fu = sf.encontrarFuncionario(ep, cpf);

                    System.out.println(fu.toString());

                    break;
                case 6:
                    System.out.println(sf.verFuncionarios(ep));
                    break;
                case 7:
                    System.out.print("CPF: ");
                    cpf = scanner.nextLine();

                    sf.RemoverFuncionario(ep, cpf);
                    break;
                case 8 :
                    System.out.println(sf.salarioTotal(ep));
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }

        } while (opcao != 0);

    }
}
