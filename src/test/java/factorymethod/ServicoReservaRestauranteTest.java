package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoReservaRestauranteTest {

    @Test
    void deveExecutarReservaRestaurante() {
        IServico servico = ServicoFactory.obterServico("ReservaRestaurante");
        assertEquals("Reserva bem-sucedida!", servico.executar());
    }

    @Test
    void deveCancelarReservaRestaurante() {
        IServico servico = ServicoFactory.obterServico("ReservaRestaurante");
        assertEquals("Reserva cancelada.", servico.cancelar());
    }

}
