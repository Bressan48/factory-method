package factorymethod;

public class ServicoReservaQuarto implements IServico{

    public String executar() {
        return "Reserva bem-sucedida!";
    }

    public String cancelar() {
        return "Reserva cancelada.";
    }

}
