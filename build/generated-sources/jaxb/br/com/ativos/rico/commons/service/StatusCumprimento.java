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
 * <p>Classe Java de statusCumprimento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusCumprimento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VIGENTE"/&gt;
 *     &lt;enumeration value="NAO_CUMPRIDO"/&gt;
 *     &lt;enumeration value="CANCELADO"/&gt;
 *     &lt;enumeration value="REJEITADO"/&gt;
 *     &lt;enumeration value="CUMPRIDO"/&gt;
 *     &lt;enumeration value="RESCINDIDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusCumprimento")
@XmlEnum
public enum StatusCumprimento {

    VIGENTE,
    NAO_CUMPRIDO,
    CANCELADO,
    REJEITADO,
    CUMPRIDO,
    RESCINDIDO;

    public String value() {
        return name();
    }

    public static StatusCumprimento fromValue(String v) {
        return valueOf(v);
    }

}
