package consultorio;

import java.util.Scanner;

public class CadastraPacientes {

public Pacientes pacientes() {

        Scanner leitor = new Scanner(System.in);

        Pacientes paciente = new Pacientes();

        try {
            System.out.println("\nMenu Principal/Pacientes/Cadastrar/Cadastro de Paciente"
                    + "\nDigite o Nome do Paciente:");
            String nome = leitor.nextLine();
            paciente.setNome(nome);

            Scanner leitorEndereco = new Scanner(System.in);

            System.out.println("Digite o Endereço do Paciente:");
            String endereco = leitorEndereco.next();
            paciente.setEndereco(endereco);

            System.out.println("Digite o Telefone do Paciente (somente números):");
            String telefone = leitorEndereco.next();
            paciente.setTelefone(telefone);

        } catch (Exception ex) {
            System.out.println("Erro!");
        }
        return paciente;
    }
}