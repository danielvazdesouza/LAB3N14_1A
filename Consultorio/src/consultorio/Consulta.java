package consultorio;


public class Consulta extends Pacientes{

   String hora;
   String data;
   String nomedoutor;
   String prontuario;

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomedoutor() {
        return nomedoutor;
    }

    public void setNomedoutor(String nomedoutor) {
        this.nomedoutor = nomedoutor;
    }    
}