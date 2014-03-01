package consultorio;
import java.util.ArrayList;
import java.util.Scanner;

    public class TelaPaciente {

        ArrayList<Pacientes> listaPacientes = null;
        CadastraPacientes cadastra = new CadastraPacientes();
        int nroPaciente = 0;

        public TelaPaciente(ArrayList<Pacientes> pac) {
            if (this.listaPacientes == null) {
                this.listaPacientes = new ArrayList<Pacientes>();
            }
            
            this.listaPacientes = pac;
        }

        public TelaPaciente menuPrincipalPaciente() {
            /*
             * Executa um laco ate que o usuario digite 0
             */

            Scanner leitor = new Scanner(System.in);

            int opcao = 1;

            do {
                System.out.print("\nMenu Principal/Pacientes/ \n"
                        + "Selecione uma opção:\n"
                        + "1 - Cadastrar \n"
                        + "2 - Listar \n"
                        + "0 - Voltar \n");
                try {
                    opcao = leitor.nextInt();

                } catch (Exception e) {
                    System.out.print("Opcao invalida! " + e.getMessage() + "\n");
                }

                switch (opcao) {
                    case 1:
                        telaCadastro();
                        break;
                    case 2:
                        telaLista();
                        break;
                }

            } while (opcao != 0);
            
            return this;

        }

        public void telaCadastro() {

            boolean fim = false;
            {
                Scanner leitor = new Scanner(System.in);

                while (fim == false) {

                    System.out.println("\nMenu Principal/Pacientes/Cadastrar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Cadastro de Pacientes."
                            + "\n0 - Sair.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {

                        case 1:
                            this.listaPacientes.add(cadastra.pacientes());
                            break;
                        case 0:
                            fim = true;
                    }
                }
            }
        }

        public void telaLista() {

            boolean fim = false;
            {
                Scanner leitor = new Scanner(System.in);

                while (fim == false) {

                    System.out.println("\nMenu Principal/Pacientes/Listar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Lista Pacientes."
                            + "\n0 - Voltar.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {

                        case 1:
                            System.out.println("\nMenu Principal/Pacientes/Listar/Lista Pacientes/");
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
                            System.out.println("\nFim da Lista de Pacientes.");
                            break;
                        case 0:
                            fim = true;
                            break;
                    }
                }
            }
        }
    }