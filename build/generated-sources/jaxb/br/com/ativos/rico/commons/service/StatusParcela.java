//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.07.04 às 05:17:54 PM GMT-03:00 
//


package br.com.ativos.rico.commons.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusParcela.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusParcela"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A_PAGAR"/&gt;
 *     &lt;enumeration value="PAGA"/&gt;
 *     &lt;enumeration value="PAGAMENTO_MAIOR"/&gt;
 *     &lt;enumeration value="PAGAMENTO_MENOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusParcela")
@XmlEnum
public enum StatusParcela {

    A_PAGAR,
    PAGA,
    PAGAMENTO_MAIOR,
    PAGAMENTO_MENOR;

    public String value() {
        return name();
    }

    public static StatusParcela fromValue(String v) {
        return valueOf(v);
    }

}
