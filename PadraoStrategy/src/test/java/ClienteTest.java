import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void devePagarComCartaoDeDebito() {
        Cliente cliente = new Cliente();
        cliente.pagarCartaoDebito("Cartão de débito");
        assertEquals("Cartão de débito", cliente.getPagamento());
    }

    @Test
    void devePagarComCartaoDeCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarCartaoCredito("Cartão de crédito");
        assertEquals("Cartão de crédito", cliente.getPagamento());
    }

    @Test
    void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagarPix("Pix");
        assertEquals("Pix", cliente.getPagamento());
    }

    @Test
    void devePagarComTransferencia() {
        Cliente cliente = new Cliente();
        cliente.pagarTransferencia("Transferência");
        assertEquals("Transferência", cliente.getPagamento());
    }

    @Test
    void devePagarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.pagarDinheiro("Dinheiro");
        assertEquals("Dinheiro", cliente.getPagamento());
    }

    @Test
    void formaDePagamentoNula() {
        try {
            Cliente cliente = new Cliente();
            cliente.pagarCartaoCredito(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagamento inválido", e.getMessage());
        }
    }

}
