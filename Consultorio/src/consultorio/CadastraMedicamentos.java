package consultorio;

import consultorio.Medicamentos;
import java.util.Scanner;

public class CadastraMedicamentos {

    public Medicamentos medicamentos() {

        Scanner leitor = new Scanner(System.in);

        Medicamentos medicamento = new Medicamentos();

        try {
            System.out.println("\nMenu Principal/Clientes/Cadastrar/Cadastro de Medicamentos"
                    + "\nDigite o Nome do Medicamento:");
            String nome = leitor.nextLine();
            medicamento.setNome(nome);

        } catch (Exception ex) {
            System.out.println("Erro!");
        }
        return medicamento;
    }
}