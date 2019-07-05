//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.05 às 05:25:01 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.ativos.rico.commons.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnviarProximosBoletos_QNAME = new QName("http://service.commons.rico.ativos.com.br/", "enviarProximosBoletos");
    private final static QName _EnviarProximosBoletosResponse_QNAME = new QName("http://service.commons.rico.ativos.com.br/", "enviarProximosBoletosResponse");
    private final static QName _PesquisarCPFOmnichannel_QNAME = new QName("http://service.commons.rico.ativos.com.br/", "pesquisarCPFOmnichannel");
    private final static QName _PesquisarCPFOmnichannelResponse_QNAME = new QName("http://service.commons.rico.ativos.com.br/", "pesquisarCPFOmnichannelResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.ativos.rico.commons.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Acordo }
     * 
     */
    public Acordo createAcordo() {
        return new Acordo();
    }

    /**
     * Create an instance of {@link ClienteURAOmniType }
     * 
     */
    public ClienteURAOmniType createClienteURAOmniType() {
        return new ClienteURAOmniType();
    }

    /**
     * Create an instance of {@link EnviarProximosBoletos }
     * 
     */
    public EnviarProximosBoletos createEnviarProximosBoletos() {
        return new EnviarProximosBoletos();
    }

    /**
     * Create an instance of {@link EnviarProximosBoletosResponse }
     * 
     */
    public EnviarProximosBoletosResponse createEnviarProximosBoletosResponse() {
        return new EnviarProximosBoletosResponse();
    }

    /**
     * Create an instance of {@link PesquisarCPFOmnichannel }
     * 
     */
    public PesquisarCPFOmnichannel createPesquisarCPFOmnichannel() {
        return new PesquisarCPFOmnichannel();
    }

    /**
     * Create an instance of {@link PesquisarCPFOmnichannelResponse }
     * 
     */
    public PesquisarCPFOmnichannelResponse createPesquisarCPFOmnichannelResponse() {
        return new PesquisarCPFOmnichannelResponse();
    }

    /**
     * Create an instance of {@link Return }
     * 
     */
    public Return createReturn() {
        return new Return();
    }

    /**
     * Create an instance of {@link Operacao }
     * 
     */
    public Operacao createOperacao() {
        return new Operacao();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link Modalidade }
     * 
     */
    public Modalidade createModalidade() {
        return new Modalidade();
    }

    /**
     * Create an instance of {@link Origem }
     * 
     */
    public Origem createOrigem() {
        return new Origem();
    }

    /**
     * Create an instance of {@link Parcela }
     * 
     */
    public Parcela createParcela() {
        return new Parcela();
    }

    /**
     * Create an instance of {@link Escritorio }
     * 
     */
    public Escritorio createEscritorio() {
        return new Escritorio();
    }

    /**
     * Create an instance of {@link Acordo.Operacoes }
     * 
     */
    public Acordo.Operacoes createAcordoOperacoes() {
        return new Acordo.Operacoes();
    }

    /**
     * Create an instance of {@link Acordo.Parcelas }
     * 
     */
    public Acordo.Parcelas createAcordoParcelas() {
        return new Acordo.Parcelas();
    }

    /**
     * Create an instance of {@link ClienteURAOmniType.LstAcordos }
     * 
     */
    public ClienteURAOmniType.LstAcordos createClienteURAOmniTypeLstAcordos() {
        return new ClienteURAOmniType.LstAcordos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarProximosBoletos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.commons.rico.ativos.com.br/", name = "enviarProximosBoletos")
    public JAXBElement<EnviarProximosBoletos> createEnviarProximosBoletos(EnviarProximosBoletos value) {
        return new JAXBElement<EnviarProximosBoletos>(_EnviarProximosBoletos_QNAME, EnviarProximosBoletos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarProximosBoletosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.commons.rico.ativos.com.br/", name = "enviarProximosBoletosResponse")
    public JAXBElement<EnviarProximosBoletosResponse> createEnviarProximosBoletosResponse(EnviarProximosBoletosResponse value) {
        return new JAXBElement<EnviarProximosBoletosResponse>(_EnviarProximosBoletosResponse_QNAME, EnviarProximosBoletosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarCPFOmnichannel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.commons.rico.ativos.com.br/", name = "pesquisarCPFOmnichannel")
    public JAXBElement<PesquisarCPFOmnichannel> createPesquisarCPFOmnichannel(PesquisarCPFOmnichannel value) {
        return new JAXBElement<PesquisarCPFOmnichannel>(_PesquisarCPFOmnichannel_QNAME, PesquisarCPFOmnichannel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarCPFOmnichannelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.commons.rico.ativos.com.br/", name = "pesquisarCPFOmnichannelResponse")
    public JAXBElement<PesquisarCPFOmnichannelResponse> createPesquisarCPFOmnichannelResponse(PesquisarCPFOmnichannelResponse value) {
        return new JAXBElement<PesquisarCPFOmnichannelResponse>(_PesquisarCPFOmnichannelResponse_QNAME, PesquisarCPFOmnichannelResponse.class, null, value);
    }

}
