package Funcionalidades;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;
/**
 *
 * @author Gabi
 */
public class Nfes {
    
private int numero;
private String codVerificacao;
private int dataEmissao;
private String competencia;

private float baseCalculo;
private float issRetido;
private float valorLiquido;
private float valorServico;

private String codigoTributacao;
private String servico;

//Pegar do cliente 
private String cpfCnpjCliente;
private String razaoReduzidaCliente;
private String bairroCliente;
private String ufCliente;

private int dataVencimento;
private int dataPagamento;

private float jurosPagamento;
private float descontoPagamento;
private float impostoRetido;
private float valorPago;

//Tentei por cancelamento como opcional pois nem sempre irá tê-lo
private CancelamentoNfes cancelamentoNfe;


private int importadaEm;
private double jurosMultaAbonada;
private float anoMes;

private int diasAtraso;
private int nfeAtraso;
private double acumuloAtraso;



public Nfes(int numero, String codVerificacao, int dataEmissao, String competencia, float baseCalculo,
            float issRetido, float valorLiquido, float valorServico, String codigoTributacao, String servico,
            String cpfCnpjCliente, String razaoReduzidaCliente, String bairroCliente, String ufCliente,
            int dataVencimento, int dataPagamento, float jurosPagamento, float descontoPagamento,
            float impostoRetido, float valorPago, int importadaEm, double jurosMultaAbonada, float anoMes,
            int diasAtraso, int nfeAtraso, double acumuloAtraso) 





{
    this.numero = numero;
    this.codVerificacao = codVerificacao;
    this.dataEmissao = dataEmissao;
    this.competencia = competencia;
    this.baseCalculo = baseCalculo;
    this.issRetido = issRetido;
    this.valorLiquido = valorLiquido;
    this.valorServico = valorServico;
    this.codigoTributacao = codigoTributacao;
    this.servico = servico;
    this.cpfCnpjCliente = cpfCnpjCliente;
    this.razaoReduzidaCliente = razaoReduzidaCliente;
    this.bairroCliente = bairroCliente;
    this.ufCliente = ufCliente;
    this.dataVencimento = dataVencimento;
    this.dataPagamento = dataPagamento;
    this.jurosPagamento = jurosPagamento;
    this.descontoPagamento = descontoPagamento;
    this.impostoRetido = impostoRetido;
    this.valorPago = valorPago;
    this.importadaEm = importadaEm;
    this.jurosMultaAbonada = jurosMultaAbonada;
    this.anoMes = anoMes;
    this.diasAtraso = diasAtraso;
    this.nfeAtraso = nfeAtraso;
    this.acumuloAtraso = acumuloAtraso;

   

}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodVerificacao() {
        return codVerificacao;
    }

    public void setCodVerificacao(String codVerificacao) {
        this.codVerificacao = codVerificacao;
    }

    public int getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(int dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public float getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(float baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public float getIssRetido() {
        return issRetido;
    }

    public void setIssRetido(float issRetido) {
        this.issRetido = issRetido;
    }

    public float getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(float valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public float getValorServico() {
        return valorServico;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }

    public String getCodigoTributacao() {
        return codigoTributacao;
    }

    public void setCodigoTributacao(String codigoTributacao) {
        this.codigoTributacao = codigoTributacao;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getCpfCnpjCliente() {
        return cpfCnpjCliente;
    }

    public void setCpfCnpjCliente(String cpfCnpjCliente) {
        this.cpfCnpjCliente = cpfCnpjCliente;
    }

    public String getRazaoReduzidaCliente() {
        return razaoReduzidaCliente;
    }

    public void setRazaoReduzidaCliente(String razaoReduzidaCliente) {
        this.razaoReduzidaCliente = razaoReduzidaCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(int dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(int dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getJurosPagamento() {
        return jurosPagamento;
    }

    public void setJurosPagamento(float jurosPagamento) {
        this.jurosPagamento = jurosPagamento;
    }

    public float getDescontoPagamento() {
        return descontoPagamento;
    }

    public void setDescontoPagamento(float descontoPagamento) {
        this.descontoPagamento = descontoPagamento;
    }

    public float getImpostoRetido() {
        return impostoRetido;
    }

    public void setImpostoRetido(float impostoRetido) {
        this.impostoRetido = impostoRetido;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public int getImportadaEm() {
        return importadaEm;
    }

    public void setImportadaEm(int importadaEm) {
        this.importadaEm = importadaEm;
    }

    public double getJurosMultaAbonada() {
        return jurosMultaAbonada;
    }

    public void setJurosMultaAbonada(double jurosMultaAbonada) {
        this.jurosMultaAbonada = jurosMultaAbonada;
    }

    public float getAnoMes() {
        return anoMes;
    }

    public void setAnoMes(float anoMes) {
        this.anoMes = anoMes;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public int getNfeAtraso() {
        return nfeAtraso;
    }

    public void setNfeAtraso(int nfeAtraso) {
        this.nfeAtraso = nfeAtraso;
    }

    public double getAcumuloAtraso() {
        return acumuloAtraso;
    }

    public void setAcumuloAtraso(double acumuloAtraso) {
        this.acumuloAtraso = acumuloAtraso;
    }

    public CancelamentoNfes getCancelamentoNfe() {
        return cancelamentoNfe;
    }

    public void setCancelamentoNfe(CancelamentoNfes cancelamentoNfe) {
        this.cancelamentoNfe = cancelamentoNfe;
    }
    
    public void cancelarNfe(String codigo, int data, String confirmacao) {
       CancelamentoNfes cancelamento = new CancelamentoNfes();
      cancelamento.setCodCancelamento(codigo);
      cancelamento.setDataCancelamento(data);
      cancelamento.setConfirmacaoCancelamento(confirmacao);
     this.setCancelamentoNfe(cancelamento);
}
}
