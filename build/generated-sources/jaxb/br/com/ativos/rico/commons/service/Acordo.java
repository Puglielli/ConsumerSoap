//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.05 às 05:25:01 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de acordo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="acordo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroAcordo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataAcordo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataAprovacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="responsavel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsavelAprovacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situacaoAcordo" type="{http://service.commons.rico.ativos.com.br/}situacaoAcordo" minOccurs="0"/&gt;
 *         &lt;element name="tipoAcordo" type="{http://service.commons.rico.ativos.com.br/}tipoAcordo" minOccurs="0"/&gt;
 *         &lt;element name="statusPagamento" type="{http://service.commons.rico.ativos.com.br/}statusPagamento" minOccurs="0"/&gt;
 *         &lt;element name="statusCumprimento" type="{http://service.commons.rico.ativos.com.br/}statusCumprimento" minOccurs="0"/&gt;
 *         &lt;element name="valorNegociado" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorJuros" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorAjuste" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statusInadimplencia" type="{http://service.commons.rico.ativos.com.br/}statusInadimplencia" minOccurs="0"/&gt;
 *         &lt;element name="dataInadimplencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataUltimaModificacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="responsavelUltimaModificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operacoes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="operacao" type="{http://service.commons.rico.ativos.com.br/}operacao" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="parcelas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parcela" type="{http://service.commons.rico.ativos.com.br/}parcela" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="escritorio" type="{http://service.commons.rico.ativos.com.br/}escritorio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acordo", propOrder = {
    "numeroAcordo",
    "dataAcordo",
    "dataAprovacao",
    "responsavel",
    "responsavelAprovacao",
    "situacaoAcordo",
    "tipoAcordo",
    "statusPagamento",
    "statusCumprimento",
    "valorNegociado",
    "valorJuros",
    "valorAjuste",
    "statusInadimplencia",
    "dataInadimplencia",
    "dataUltimaModificacao",
    "responsavelUltimaModificacao",
    "operacoes",
    "parcelas",
    "escritorio"
})
public class Acordo {

    protected Integer numeroAcordo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAcordo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAprovacao;
    protected String responsavel;
    protected String responsavelAprovacao;
    @XmlSchemaType(name = "string")
    protected SituacaoAcordo situacaoAcordo;
    @XmlSchemaType(name = "string")
    protected TipoAcordo tipoAcordo;
    @XmlSchemaType(name = "string")
    protected StatusPagamento statusPagamento;
    @XmlSchemaType(name = "string")
    protected StatusCumprimento statusCumprimento;
    protected Double valorNegociado;
    protected Double valorJuros;
    protected Double valorAjuste;
    @XmlSchemaType(name = "string")
    protected StatusInadimplencia statusInadimplencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInadimplencia;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaModificacao;
    protected String responsavelUltimaModificacao;
    protected Acordo.Operacoes operacoes;
    protected Acordo.Parcelas parcelas;
    protected Escritorio escritorio;

    /**
     * Obtém o valor da propriedade numeroAcordo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAcordo() {
        return numeroAcordo;
    }

    /**
     * Define o valor da propriedade numeroAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAcordo(Integer value) {
        this.numeroAcordo = value;
    }

    /**
     * Obtém o valor da propriedade dataAcordo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAcordo() {
        return dataAcordo;
    }

    /**
     * Define o valor da propriedade dataAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAcordo(XMLGregorianCalendar value) {
        this.dataAcordo = value;
    }

    /**
     * Obtém o valor da propriedade dataAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * Define o valor da propriedade dataAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAprovacao(XMLGregorianCalendar value) {
        this.dataAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade responsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * Define o valor da propriedade responsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavel(String value) {
        this.responsavel = value;
    }

    /**
     * Obtém o valor da propriedade responsavelAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavelAprovacao() {
        return responsavelAprovacao;
    }

    /**
     * Define o valor da propriedade responsavelAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavelAprovacao(String value) {
        this.responsavelAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade situacaoAcordo.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoAcordo }
     *     
     */
    public SituacaoAcordo getSituacaoAcordo() {
        return situacaoAcordo;
    }

    /**
     * Define o valor da propriedade situacaoAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoAcordo }
     *     
     */
    public void setSituacaoAcordo(SituacaoAcordo value) {
        this.situacaoAcordo = value;
    }

    /**
     * Obtém o valor da propriedade tipoAcordo.
     * 
     * @return
     *     possible object is
     *     {@link TipoAcordo }
     *     
     */
    public TipoAcordo getTipoAcordo() {
        return tipoAcordo;
    }

    /**
     * Define o valor da propriedade tipoAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAcordo }
     *     
     */
    public void setTipoAcordo(TipoAcordo value) {
        this.tipoAcordo = value;
    }

    /**
     * Obtém o valor da propriedade statusPagamento.
     * 
     * @return
     *     possible object is
     *     {@link StatusPagamento }
     *     
     */
    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }

    /**
     * Define o valor da propriedade statusPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusPagamento }
     *     
     */
    public void setStatusPagamento(StatusPagamento value) {
        this.statusPagamento = value;
    }

    /**
     * Obtém o valor da propriedade statusCumprimento.
     * 
     * @return
     *     possible object is
     *     {@link StatusCumprimento }
     *     
     */
    public StatusCumprimento getStatusCumprimento() {
        return statusCumprimento;
    }

    /**
     * Define o valor da propriedade statusCumprimento.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCumprimento }
     *     
     */
    public void setStatusCumprimento(StatusCumprimento value) {
        this.statusCumprimento = value;
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
     * Obtém o valor da propriedade valorJuros.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorJuros() {
        return valorJuros;
    }

    /**
     * Define o valor da propriedade valorJuros.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorJuros(Double value) {
        this.valorJuros = value;
    }

    /**
     * Obtém o valor da propriedade valorAjuste.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorAjuste() {
        return valorAjuste;
    }

    /**
     * Define o valor da propriedade valorAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorAjuste(Double value) {
        this.valorAjuste = value;
    }

    /**
     * Obtém o valor da propriedade statusInadimplencia.
     * 
     * @return
     *     possible object is
     *     {@link StatusInadimplencia }
     *     
     */
    public StatusInadimplencia getStatusInadimplencia() {
        return statusInadimplencia;
    }

    /**
     * Define o valor da propriedade statusInadimplencia.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusInadimplencia }
     *     
     */
    public void setStatusInadimplencia(StatusInadimplencia value) {
        this.statusInadimplencia = value;
    }

    /**
     * Obtém o valor da propriedade dataInadimplencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInadimplencia() {
        return dataInadimplencia;
    }

    /**
     * Define o valor da propriedade dataInadimplencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInadimplencia(XMLGregorianCalendar value) {
        this.dataInadimplencia = value;
    }

    /**
     * Obtém o valor da propriedade dataUltimaModificacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaModificacao() {
        return dataUltimaModificacao;
    }

    /**
     * Define o valor da propriedade dataUltimaModificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaModificacao(XMLGregorianCalendar value) {
        this.dataUltimaModificacao = value;
    }

    /**
     * Obtém o valor da propriedade responsavelUltimaModificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsavelUltimaModificacao() {
        return responsavelUltimaModificacao;
    }

    /**
     * Define o valor da propriedade responsavelUltimaModificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsavelUltimaModificacao(String value) {
        this.responsavelUltimaModificacao = value;
    }

    /**
     * Obtém o valor da propriedade operacoes.
     * 
     * @return
     *     possible object is
     *     {@link Acordo.Operacoes }
     *     
     */
    public Acordo.Operacoes getOperacoes() {
        return operacoes;
    }

    /**
     * Define o valor da propriedade operacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link Acordo.Operacoes }
     *     
     */
    public void setOperacoes(Acordo.Operacoes value) {
        this.operacoes = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link Acordo.Parcelas }
     *     
     */
    public Acordo.Parcelas getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link Acordo.Parcelas }
     *     
     */
    public void setParcelas(Acordo.Parcelas value) {
        this.parcelas = value;
    }

    /**
     * Obtém o valor da propriedade escritorio.
     * 
     * @return
     *     possible object is
     *     {@link Escritorio }
     *     
     */
    public Escritorio getEscritorio() {
        return escritorio;
    }

    /**
     * Define o valor da propriedade escritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link Escritorio }
     *     
     */
    public void setEscritorio(Escritorio value) {
        this.escritorio = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="operacao" type="{http://service.commons.rico.ativos.com.br/}operacao" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "operacao"
    })
    public static class Operacoes {

        protected List<Operacao> operacao;

        /**
         * Gets the value of the operacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Operacao }
         * 
         * 
         */
        public List<Operacao> getOperacao() {
            if (operacao == null) {
                operacao = new ArrayList<Operacao>();
            }
            return this.operacao;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="parcela" type="{http://service.commons.rico.ativos.com.br/}parcela" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parcela"
    })
    public static class Parcelas {

        protected List<Parcela> parcela;

        /**
         * Gets the value of the parcela property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parcela property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParcela().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Parcela }
         * 
         * 
         */
        public List<Parcela> getParcela() {
            if (parcela == null) {
                parcela = new ArrayList<Parcela>();
            }
            return this.parcela;
        }

    }

}
