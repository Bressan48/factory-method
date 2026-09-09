package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoPasseioCarrocaTest {

    @Test
    void deveExecutarPasseioCarroca() {
        IServico servico = ServicoFactory.obterServico("PasseioCarroca");
        assertEquals("Inscrição para Passeio de Carroça bem-sucedida!", servico.executar());
    }

    @Test
    void deveCancelarPasseioCarroca() {
        IServico servico = ServicoFactory.obterServico("PasseioCarroca");
        assertEquals("Inscrição cancelada.", servico.cancelar());
    }

}
