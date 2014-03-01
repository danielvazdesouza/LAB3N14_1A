package consultorio;
import java.util.ArrayList;

import java.util.Scanner;

public class Consultorio {
    
    private TelaPaciente objTelaPaciente;
    private TelaMedicamento objTelaMedicamento;
    private TelaConsulta objTelaConsulta;
    
    
    public Consultorio(){
        this.objTelaPaciente = new TelaPaciente(new ArrayList<Pacientes>());
        this.objTelaMedicamento = new TelaMedicamento(new ArrayList<Medicamentos>());
        this.objTelaConsulta = new TelaConsulta(objTelaPaciente, new ArrayList<Consulta>());
    }
    
    public static Scanner leitor = new Scanner(System.in);
    public void executa() {
        if(objTelaPaciente.listaPacientes.isEmpty()){
            objTelaPaciente = new TelaPaciente(objTelaPaciente.listaPacientes);
        }
        
        if(objTelaMedicamento.listaMedicamentos.isEmpty()){
            objTelaMedicamento = new TelaMedicamento(objTelaMedicamento.listaMedicamentos);            
        }
        
        if(objTelaConsulta.listaConsulta.isEmpty())
        {
            objTelaConsulta = new TelaConsulta(objTelaPaciente, objTelaConsulta.listaConsulta);
        }
        
        TelaPaciente pacientes = new TelaPaciente(objTelaPaciente.listaPacientes);
        TelaMedicamento medicamentos = new TelaMedicamento(objTelaMedicamento.listaMedicamentos);
        TelaConsulta consultas = new TelaConsulta(objTelaPaciente, objTelaConsulta.listaConsulta);

        int op = 0;

        do {
            System.out.printf("\nMenu Principal/\n"
                    + "Selecione uma opção:\n"
                    + "1 - Pacientes \n"
                    + "2 - Medicamentos \n"
                    + "3 - Consultas \n"
                    + "4 - Agenda \n"
                    + "5 - Receita \n"
                    + "0 - Sair \n");
            try {
                op = leitor.nextInt();

            } catch (Exception e) {
                System.out.println("Opcao invalida! " + e.getMessage() + "\n");
            }

            switch (op) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    objTelaPaciente = pacientes.menuPrincipalPaciente();
                    break;
                case 2:
                    objTelaMedicamento = medicamentos.menuPrincipalMedicamento();
                    break;
                case 3:
                     objTelaConsulta = consultas.menuPrincipalConsulta();
                     break;
                case 4:
                     //objTelaAgenda = agenda.menuPrincipalAgenda();
                     break;
            }

        } while (op != 0);
   
    }
}
