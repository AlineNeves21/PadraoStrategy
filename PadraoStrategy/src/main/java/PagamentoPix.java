public class PagamentoPix implements Pagamento {

    public String tipoPagamento(String formaDePagamento) {
        if (formaDePagamento == null) {
            throw new IllegalArgumentException("Pagamento inválido");
        }
        else {
            return "Pix";
        }
    }
}
