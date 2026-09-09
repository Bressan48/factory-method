package factorymethod;

public class ServicoPasseioCarroca implements IServico{

    public String executar() {
        return "Inscrição para Passeio de Carroça bem-sucedida!";
    }

    public String cancelar() {
        return "Inscrição cancelada.";
    }

}
