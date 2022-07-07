public class Cliente {

    private String pagamento;

    public String getPagamento() {
        return pagamento;
    }

    public void pagarCartaoCredito(String pagamento) {
        Banco banco = new Banco(pagamento);
        this.pagamento = banco.tipoPagamento(new PagamentoCartaoCredito());
    }

    public void pagarCartaoDebito(String pagamento) {
        Banco banco = new Banco(pagamento);
        this.pagamento = banco.tipoPagamento(new PagamentoCartaoDebito());
    }

    public void pagarPix(String pagamento) {
        Banco banco = new Banco(pagamento);
        this.pagamento = banco.tipoPagamento(new PagamentoPix());
    }

    public void pagarDinheiro(String pagamento) {
        Banco banco = new Banco(pagamento);
        this.pagamento = banco.tipoPagamento(new PagamentoDinheiro());
    }

    public void pagarTransferencia(String pagamento) {
        Banco banco = new Banco(pagamento);
        this.pagamento = banco.tipoPagamento(new PagamentoTransferencia());
    }
}
