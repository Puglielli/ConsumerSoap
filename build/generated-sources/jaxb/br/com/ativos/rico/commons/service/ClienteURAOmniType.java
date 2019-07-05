//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2019.07.04 �s 05:17:54 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de clienteURAOmniType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="clienteURAOmniType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://service.commons.rico.ativos.com.br/}return"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpfCnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ndg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="escritorioPreferencial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeEscritorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefoneEscritorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ramal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="qtdeAcordosVigentes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lstAcordos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Acordo" type="{http://service.commons.rico.ativos.com.br/}acordo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlRootElement(name = "return")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteURAOmniType", propOrder = {
    "nome",
    "cpfCnpj",
    "ndg",
    "escritorioPreferencial",
    "nomeEscritorio",
    "telefoneEscritorio",
    "ramal",
    "qtdeAcordosVigentes",
    "lstAcordos"
})
public class ClienteURAOmniType
    extends Return
{

    protected String nome;
    protected String cpfCnpj;
    protected String ndg;
    protected String escritorioPreferencial;
    protected String nomeEscritorio;
    protected String telefoneEscritorio;
    protected int ramal;
    protected int qtdeAcordosVigentes;
    protected ClienteURAOmniType.LstAcordos lstAcordos;

    /**
     * Obt�m o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obt�m o valor da propriedade cpfCnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfCnpj() {
        return cpfCnpj;
    }

    /**
     * Define o valor da propriedade cpfCnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfCnpj(String value) {
        this.cpfCnpj = value;
    }

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
     * Obt�m o valor da propriedade escritorioPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscritorioPreferencial() {
        return escritorioPreferencial;
    }

    /**
     * Define o valor da propriedade escritorioPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscritorioPreferencial(String value) {
        this.escritorioPreferencial = value;
    }

    /**
     * Obt�m o valor da propriedade nomeEscritorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEscritorio() {
        return nomeEscritorio;
    }

    /**
     * Define o valor da propriedade nomeEscritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEscritorio(String value) {
        this.nomeEscritorio = value;
    }

    /**
     * Obt�m o valor da propriedade telefoneEscritorio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefoneEscritorio() {
        return telefoneEscritorio;
    }

    /**
     * Define o valor da propriedade telefoneEscritorio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefoneEscritorio(String value) {
        this.telefoneEscritorio = value;
    }

    /**
     * Obt�m o valor da propriedade ramal.
     * 
     */
    public int getRamal() {
        return ramal;
    }

    /**
     * Define o valor da propriedade ramal.
     * 
     */
    public void setRamal(int value) {
        this.ramal = value;
    }

    /**
     * Obt�m o valor da propriedade qtdeAcordosVigentes.
     * 
     */
    public int getQtdeAcordosVigentes() {
        return qtdeAcordosVigentes;
    }

    /**
     * Define o valor da propriedade qtdeAcordosVigentes.
     * 
     */
    public void setQtdeAcordosVigentes(int value) {
        this.qtdeAcordosVigentes = value;
    }

    /**
     * Obt�m o valor da propriedade lstAcordos.
     * 
     * @return
     *     possible object is
     *     {@link ClienteURAOmniType.LstAcordos }
     *     
     */
    public ClienteURAOmniType.LstAcordos getLstAcordos() {
        return lstAcordos;
    }

    /**
     * Define o valor da propriedade lstAcordos.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteURAOmniType.LstAcordos }
     *     
     */
    public void setLstAcordos(ClienteURAOmniType.LstAcordos value) {
        this.lstAcordos = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Acordo" type="{http://service.commons.rico.ativos.com.br/}acordo" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "acordo"
    })
    public static class LstAcordos {

        @XmlElement(name = "Acordo")
        protected List<Acordo> acordo;

        /**
         * Gets the value of the acordo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the acordo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAcordo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Acordo }
         * 
         * 
         */
        public List<Acordo> getAcordo() {
            if (acordo == null) {
                acordo = new ArrayList<Acordo>();
            }
            return this.acordo;
        }

    }

}
