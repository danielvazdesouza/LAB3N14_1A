package consultorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelaConsulta {
    
    ArrayList<Consulta> listaConsulta = null;
        CadastraConsultas cadastra;// = new CadastraConsultas();
        int nroConsulta = 0;
        TelaPaciente objPac;

        public TelaConsulta(TelaPaciente pac, ArrayList<Consulta> con) {
            cadastra = new CadastraConsultas(pac);
            cadastra.setPacientes(cadastra);
            if (this.listaConsulta == null) {
                this.listaConsulta= new ArrayList<Consulta>();
            }
           
            this.objPac = pac;
            
            this.listaConsulta = con;
                
            cadastra = new CadastraConsultas(pac);
        }

        public void getPacientes(){
            
        }
        public TelaConsulta menuPrincipalConsulta() {
            /*
             * Executa um laco ate que o usuario digite 0
             */
            Scanner leitor = new Scanner(System.in);

            int opcao = 1;

            do {
                System.out.print("\nMenu Principal/Consultas/ \n"
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

                    System.out.println("\nMenu Principal/Consultas/Cadastrar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Cadastro de Consultas."
                            + "\n0 - Sair.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {  
                        case 1:
                            this.listaConsulta.add(cadastra.consulta(objPac));
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

                    System.out.println("\nMenu Principal/Consultas/Listar/"
                            + "\nSelecione uma opção:"
                            + "\n1 - Lista Consultas."
                            + "\n0 - Voltar.");

                    int opcao = leitor.nextInt();

                    switch (opcao) {

                        case 1:
                            System.out.println("\nMenu Principal/Consultas/Listar/Lista Consultas/");
                            for (int i = 0; i < this.listaConsulta.size(); i++) {
                                Consulta mostraTela;

                                mostraTela = this.listaConsulta.get(i);

                                this.nroConsulta = i + 1;
                                System.out.println("Consulta n° "
                                        + nroConsulta + ".");
                                System.out.println("Nome do Paciente: " + mostraTela.getNome());
                                System.out.println("Doutor: " + mostraTela.getNomedoutor());
                                System.out.println("Data: " + mostraTela.getData());
                                System.out.println("Horario: " + mostraTela.getHora());
                                System.out.println("Prontuario: " + mostraTela.getProntuario());
                                System.out.println();
                            }
                            System.out.println("\nFim da Lista de Consultas.");
                            break;
                        case 0:
                            fim = true;
                            break;
                    }
                }
            }
        }
        
        
    } 