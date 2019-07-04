//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.04 às 05:17:54 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de operacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="operacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idOperacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="contrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lote" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="qtdeNegociacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="produto" type="{http://service.commons.rico.ativos.com.br/}produto" minOccurs="0"/&gt;
 *         &lt;element name="modalidade" type="{http://service.commons.rico.ativos.com.br/}modalidade" minOccurs="0"/&gt;
 *         &lt;element name="statusAcordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusOperacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorPresente" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorPresenteFinanceiro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorAtualizado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ultimoValorNegociado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="valorLiquidacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorSaldoAquisicao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorSaldoPerdas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorSaldoResidual" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campanha" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataStatusOperacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="esquemaNegociacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="statusSPC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusHabilitado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdCedulas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="procuradoriaResponsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iofResponsavel" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="qtdNegociacoes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valorNegociado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorSaldoOperacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxaProduto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="origem" type="{http://service.commons.rico.ativos.com.br/}origem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operacao", propOrder = {
    "idOperacao",
    "contrato",
    "lote",
    "qtdeNegociacao",
    "produto",
    "modalidade",
    "statusAcordo",
    "statusOperacao",
    "valorPresente",
    "valorPresenteFinanceiro",
    "valorAtualizado",
    "ultimoValorNegociado",
    "dataVencimento",
    "valorLiquidacao",
    "valorSaldoAquisicao",
    "valorSaldoPerdas",
    "valorSaldoResidual",
    "dataInclusao",
    "statusContabil",
    "campanha",
    "dataStatusOperacao",
    "classe",
    "segmento",
    "tipo",
    "esquemaNegociacao",
    "statusSPC",
    "statusHabilitado",
    "qtdCedulas",
    "procuradoriaResponsavel",
    "iofResponsavel",
    "qtdNegociacoes",
    "valorNegociado",
    "valorSaldoOperacao",
    "taxaProduto",
    "agencia",
    "origem"
})
public class Operacao {

    protected Integer idOperacao;
    protected String contrato;
    protected Integer lote;
    protected Integer qtdeNegociacao;
    protected Produto produto;
    protected Modalidade modalidade;
    protected String statusAcordo;
    protected String statusOperacao;
    protected Double valorPresente;
    protected Double valorPresenteFinanceiro;
    protected Double valorAtualizado;
    protected Double ultimoValorNegociado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    protected Double valorLiquidacao;
    protected Double valorSaldoAquisicao;
    protected Double valorSaldoPerdas;
    protected Double valorSaldoResidual;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    protected String statusContabil;
    protected Integer campanha;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataStatusOperacao;
    protected Integer classe;
    protected Integer segmento;
    protected Integer tipo;
    protected Integer esquemaNegociacao;
    protected String statusSPC;
    protected String statusHabilitado;
    protected Integer qtdCedulas;
    protected String procuradoriaResponsavel;
    protected Double iofResponsavel;
    protected Integer qtdNegociacoes;
    protected Double valorNegociado;
    protected Double valorSaldoOperacao;
    protected Double taxaProduto;
    protected String agencia;
    protected Origem origem;

    /**
     * Obtém o valor da propriedade idOperacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperacao() {
        return idOperacao;
    }

    /**
     * Define o valor da propriedade idOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperacao(Integer value) {
        this.idOperacao = value;
    }

    /**
     * Obtém o valor da propriedade contrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrato() {
        return contrato;
    }

    /**
     * Define o valor da propriedade contrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrato(String value) {
        this.contrato = value;
    }

    /**
     * Obtém o valor da propriedade lote.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLote() {
        return lote;
    }

    /**
     * Define o valor da propriedade lote.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLote(Integer value) {
        this.lote = value;
    }

    /**
     * Obtém o valor da propriedade qtdeNegociacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdeNegociacao() {
        return qtdeNegociacao;
    }

    /**
     * Define o valor da propriedade qtdeNegociacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdeNegociacao(Integer value) {
        this.qtdeNegociacao = value;
    }

    /**
     * Obtém o valor da propriedade produto.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Define o valor da propriedade produto.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

    /**
     * Obtém o valor da propriedade modalidade.
     * 
     * @return
     *     possible object is
     *     {@link Modalidade }
     *     
     */
    public Modalidade getModalidade() {
        return modalidade;
    }

    /**
     * Define o valor da propriedade modalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Modalidade }
     *     
     */
    public void setModalidade(Modalidade value) {
        this.modalidade = value;
    }

    /**
     * Obtém o valor da propriedade statusAcordo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAcordo() {
        return statusAcordo;
    }

    /**
     * Define o valor da propriedade statusAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAcordo(String value) {
        this.statusAcordo = value;
    }

    /**
     * Obtém o valor da propriedade statusOperacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOperacao() {
        return statusOperacao;
    }

    /**
     * Define o valor da propriedade statusOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOperacao(String value) {
        this.statusOperacao = value;
    }

    /**
     * Obtém o valor da propriedade valorPresente.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPresente() {
        return valorPresente;
    }

    /**
     * Define o valor da propriedade valorPresente.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPresente(Double value) {
        this.valorPresente = value;
    }

    /**
     * Obtém o valor da propriedade valorPresenteFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPresenteFinanceiro() {
        return valorPresenteFinanceiro;
    }

    /**
     * Define o valor da propriedade valorPresenteFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPresenteFinanceiro(Double value) {
        this.valorPresenteFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade valorAtualizado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAtualizado() {
        return valorAtualizado;
    }

    /**
     * Define o valor da propriedade valorAtualizado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAtualizado(Double value) {
        this.valorAtualizado = value;
    }

    /**
     * Obtém o valor da propriedade ultimoValorNegociado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUltimoValorNegociado() {
        return ultimoValorNegociado;
    }

    /**
     * Define o valor da propriedade ultimoValorNegociado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUltimoValorNegociado(Double value) {
        this.ultimoValorNegociado = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade valorLiquidacao.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorLiquidacao() {
        return valorLiquidacao;
    }

    /**
     * Define o valor da propriedade valorLiquidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorLiquidacao(Double value) {
        this.valorLiquidacao = value;
    }

    /**
     * Obtém o valor da propriedade valorSaldoAquisicao.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSaldoAquisicao() {
        return valorSaldoAquisicao;
    }

    /**
     * Define o valor da propriedade valorSaldoAquisicao.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSaldoAquisicao(Double value) {
        this.valorSaldoAquisicao = value;
    }

    /**
     * Obtém o valor da propriedade valorSaldoPerdas.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSaldoPerdas() {
        return valorSaldoPerdas;
    }

    /**
     * Define o valor da propriedade valorSaldoPerdas.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSaldoPerdas(Double value) {
        this.valorSaldoPerdas = value;
    }

    /**
     * Obtém o valor da propriedade valorSaldoResidual.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSaldoResidual() {
        return valorSaldoResidual;
    }

    /**
     * Define o valor da propriedade valorSaldoResidual.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSaldoResidual(Double value) {
        this.valorSaldoResidual = value;
    }

    /**
     * Obtém o valor da propriedade dataInclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInclusao() {
        return dataInclusao;
    }

    /**
     * Define o valor da propriedade dataInclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInclusao(XMLGregorianCalendar value) {
        this.dataInclusao = value;
    }

    /**
     * Obtém o valor da propriedade statusContabil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusContabil() {
        return statusContabil;
    }

    /**
     * Define o valor da propriedade statusContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusContabil(String value) {
        this.statusContabil = value;
    }

    /**
     * Obtém o valor da propriedade campanha.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCampanha() {
        return campanha;
    }

    /**
     * Define o valor da propriedade campanha.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCampanha(Integer value) {
        this.campanha = value;
    }

    /**
     * Obtém o valor da propriedade dataStatusOperacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataStatusOperacao() {
        return dataStatusOperacao;
    }

    /**
     * Define o valor da propriedade dataStatusOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataStatusOperacao(XMLGregorianCalendar value) {
        this.dataStatusOperacao = value;
    }

    /**
     * Obtém o valor da propriedade classe.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClasse() {
        return classe;
    }

    /**
     * Define o valor da propriedade classe.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClasse(Integer value) {
        this.classe = value;
    }

    /**
     * Obtém o valor da propriedade segmento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmento() {
        return segmento;
    }

    /**
     * Define o valor da propriedade segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmento(Integer value) {
        this.segmento = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipo(Integer value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade esquemaNegociacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEsquemaNegociacao() {
        return esquemaNegociacao;
    }

    /**
     * Define o valor da propriedade esquemaNegociacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEsquemaNegociacao(Integer value) {
        this.esquemaNegociacao = value;
    }

    /**
     * Obtém o valor da propriedade statusSPC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSPC() {
        return statusSPC;
    }

    /**
     * Define o valor da propriedade statusSPC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSPC(String value) {
        this.statusSPC = value;
    }

    /**
     * Obtém o valor da propriedade statusHabilitado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusHabilitado() {
        return statusHabilitado;
    }

    /**
     * Define o valor da propriedade statusHabilitado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusHabilitado(String value) {
        this.statusHabilitado = value;
    }

    /**
     * Obtém o valor da propriedade qtdCedulas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdCedulas() {
        return qtdCedulas;
    }

    /**
     * Define o valor da propriedade qtdCedulas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdCedulas(Integer value) {
        this.qtdCedulas = value;
    }

    /**
     * Obtém o valor da propriedade procuradoriaResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcuradoriaResponsavel() {
        return procuradoriaResponsavel;
    }

    /**
     * Define o valor da propriedade procuradoriaResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcuradoriaResponsavel(String value) {
        this.procuradoriaResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade iofResponsavel.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getIofResponsavel() {
        return iofResponsavel;
    }

    /**
     * Define o valor da propriedade iofResponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setIofResponsavel(Double value) {
        this.iofResponsavel = value;
    }

    /**
     * Obtém o valor da propriedade qtdNegociacoes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdNegociacoes() {
        return qtdNegociacoes;
    }

    /**
     * Define o valor da propriedade qtdNegociacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdNegociacoes(Integer value) {
        this.qtdNegociacoes = value;
    }

    /**
     * Obtém o valor da propriedade valorNegociado.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorNegociado() {
        return valorNegociado;
    }

    /**
     * Define o valor da propriedade valorNegociado.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorNegociado(Double value) {
        this.valorNegociado = value;
    }

    /**
     * Obtém o valor da propriedade valorSaldoOperacao.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSaldoOperacao() {
        return valorSaldoOperacao;
    }

    /**
     * Define o valor da propriedade valorSaldoOperacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSaldoOperacao(Double value) {
        this.valorSaldoOperacao = value;
    }

    /**
     * Obtém o valor da propriedade taxaProduto.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaProduto() {
        return taxaProduto;
    }

    /**
     * Define o valor da propriedade taxaProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaProduto(Double value) {
        this.taxaProduto = value;
    }

    /**
     * Obtém o valor da propriedade agencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define o valor da propriedade agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencia(String value) {
        this.agencia = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link Origem }
     *     
     */
    public Origem getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link Origem }
     *     
     */
    public void setOrigem(Origem value) {
        this.origem = value;
    }

}
