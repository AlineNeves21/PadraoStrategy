public class PagamentoTransferencia implements Pagamento {

    public String tipoPagamento(String formaDePagamento) {
        if (formaDePagamento == null) {
            throw new IllegalArgumentException("Pagamento inválido");
        }
        else {
            return "Transferência";
        }
    }
}
