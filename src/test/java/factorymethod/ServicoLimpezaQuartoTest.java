package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoLimpezaQuartoTest {

    @Test
    void deveExecutarLimpezaQuarto() {
        IServico servico = ServicoFactory.obterServico("LimpezaQuarto");
        assertEquals("Limpeza do quarto solicitada!", servico.executar());
    }

    @Test
    void deveCancelarLimpezaQuarto() {
        IServico servico = ServicoFactory.obterServico("LimpezaQuarto");
        assertEquals("Limpeza do quarto cancelada.", servico.cancelar());
    }

}
