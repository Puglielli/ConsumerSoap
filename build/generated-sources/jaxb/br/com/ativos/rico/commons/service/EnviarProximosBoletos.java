//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.05 �s 05:25:01 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enviarProximosBoletos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="enviarProximosBoletos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ndg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoTelefone" type="{http://service.commons.rico.ativos.com.br/}tipoTelefone" minOccurs="0"/&gt;
 *         &lt;element name="statusTelefone" type="{http://service.commons.rico.ativos.com.br/}statusTelefone" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarProximosBoletos", propOrder = {
    "ndg",
    "ddd",
    "numero",
    "tipoTelefone",
    "statusTelefone"
})
public class EnviarProximosBoletos {

    protected String ndg;
    protected String ddd;
    protected String numero;
    @XmlSchemaType(name = "string")
    protected TipoTelefone tipoTelefone;
    @XmlSchemaType(name = "string")
    protected StatusTelefone statusTelefone;

    /**
     * Obt�m o valor da propriedade ndg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdg() {
        return ndg;
    }

    /**
     * Define o valor da propriedade ndg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdg(String value) {
        this.ndg = value;
    }

    /**
     * Obt�m o valor da propriedade ddd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * Define o valor da propriedade ddd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdd(String value) {
        this.ddd = value;
    }

    /**
     * Obt�m o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obt�m o valor da propriedade tipoTelefone.
     * 
     * @return
     *     possible object is
     *     {@link TipoTelefone }
     *     
     */
    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    /**
     * Define o valor da propriedade tipoTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTelefone }
     *     
     */
    public void setTipoTelefone(TipoTelefone value) {
        this.tipoTelefone = value;
    }

    /**
     * Obt�m o valor da propriedade statusTelefone.
     * 
     * @return
     *     possible object is
     *     {@link StatusTelefone }
     *     
     */
    public StatusTelefone getStatusTelefone() {
        return statusTelefone;
    }

    /**
     * Define o valor da propriedade statusTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTelefone }
     *     
     */
    public void setStatusTelefone(StatusTelefone value) {
        this.statusTelefone = value;
    }

}
