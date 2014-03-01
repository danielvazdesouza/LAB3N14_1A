package consultorio;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaMedicamento {

        ArrayList<Medicamentos> listaMedicamentos = null;
        CadastraMedicamentos cadastra = new CadastraMedicamentos();
        int nroMedicamento = 0;

        public TelaMedicamento(ArrayList<Medicamentos> med) {
            if (this.listaMedicamentos == null) {
                this.listaMedicamentos = new ArrayList<Medicamentos>();
            }
            
            this.listaMedicamentos = listaMedicamentos;
        }

        public TelaMedicamento menuPrincipalMedicamento() {
            /*
             * Executa um laco ate que o usuario digite 0
             */
            Scanner leitor = new Scanner(System.in);

            int opcao = 1;

            do {
                System.out.print("\nMenu Principal/Medicamentos/ \n"
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

                    System.out.println("\nMenu Principal/Medicamentos/Cadastrar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Cadastro de Medicamentos."
                            + "\n0 - Sair.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {  
                        case 1:
                            this.listaMedicamentos.add(cadastra.medicamentos());
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

                    System.out.println("\nMenu Principal/Medicamentos/Listar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Lista Medicamentos."
                            + "\n0 - Voltar.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {

                        case 1:
                            System.out.println("\nMenu Principal/Medicamentos/Listar/Lista Medicamentos/");
                            for (int i = 0; i < this.listaMedicamentos.size(); i++) {
                                Medicamentos mostraTela;

                                mostraTela = this.listaMedicamentos.get(i);

                                this.nroMedicamento = i + 1;
                                System.out.println("Medicamento n° "
                                        + nroMedicamento + ".");
                                System.out.println("Nome: " + mostraTela.getNome());
                                System.out.println();
                            }
                            System.out.println("\nFim da Lista de Medicamentos.");
                            break;
                        case 0:
                            fim = true;
                            break;
                    }
                }
            }
        }
    } 