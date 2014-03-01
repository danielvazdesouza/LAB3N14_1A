/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastraConsultas extends TelaPaciente {

    public CadastraConsultas(TelaPaciente pac) {
        super(pac.listaPacientes);
    }

    public void setPacientes(TelaPaciente t) {
        this.listaPacientes = t.listaPacientes;
    }

    Consulta consulta = new Consulta();

    public Consulta consulta(TelaPaciente t) {

        // Simor
        this.listaPacientes = t.listaPacientes;

        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("\nMenu Principal/Consultas/Cadastrar/Cadastro de Consultas"
                    + "\nLista Pacientes Cadastrados:");

            for (int i = 0; i < this.listaPacientes.size(); i++) {
                Pacientes mostraTela;

                mostraTela = this.listaPacientes.get(i);

                this.nroPaciente = i + 1;
                System.out.println("Paciente n° "
                        + nroPaciente + ".");
                System.out.println("Nome: " + mostraTela.getNome());
                System.out.println("Endereço: "
                        + mostraTela.getEndereco());
                System.out.println("Telefone: "
                        + mostraTela.getTelefone());
                System.out.println();
            }

            System.out.println("\nDigite o Nome do Paciente:");
            String nome = leitor.nextLine();
            consulta.setNome(nome);

            Scanner leitordia = new Scanner(System.in);

            System.out.println("Digite o nome do Doutor:");
            String nomedoutor = leitor.nextLine();
            consulta.setNomedoutor(nomedoutor);

            System.out.println("Digite a Data da Consulta:");
            String data = leitor.nextLine();
            consulta.setData(data);

            System.out.println("Digite a hora da Consulta:");
            String hora = leitor.nextLine();

            System.out.println("Digite oque o paciente esta sentindo:");
            String prontuario = leitor.nextLine();
            consulta.setProntuario(prontuario);

            consulta.setHora(hora);

        } catch (Exception ex) {
            System.out.println("Erro!");
        }
        return consulta;

    }
}
