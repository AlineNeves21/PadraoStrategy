public class Banco {

    private String formaDePagamento;

    public Banco(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String tipoPagamento(Pagamento pagamento) {
        return pagamento.tipoPagamento(formaDePagamento);
    }
}
