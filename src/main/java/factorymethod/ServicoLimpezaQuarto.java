package factorymethod;

public class ServicoLimpezaQuarto implements IServico{

    public String executar() {
        return "Limpeza do quarto solicitada!";
    }

    public String cancelar() {
        return "Limpeza do quarto cancelada.";
    }

}
