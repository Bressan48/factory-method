package factorymethod;

public class ServicoReservaRestaurante implements IServico{

    public String executar() {
        return "Reserva bem-sucedida!";
    }

    public String cancelar() {
        return "Reserva cancelada.";
    }

}
