package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoReservaQuartoTest {

    @Test
    void deveExecutarReservaQuarto() {
        IServico servico = ServicoFactory.obterServico("ReservaQuarto");
        assertEquals("Reserva bem-sucedida!", servico.executar());
    }

    @Test
    void deveCancelarReservaQuarto() {
        IServico servico = ServicoFactory.obterServico("ReservaQuarto");
        assertEquals("Reserva cancelada.", servico.cancelar());
    }


}
