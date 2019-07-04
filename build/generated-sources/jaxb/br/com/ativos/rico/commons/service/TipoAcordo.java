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
 * <p>Classe Java de tipoAcordo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoAcordo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDEFINIDO"/&gt;
 *     &lt;enumeration value="EXTERNO"/&gt;
 *     &lt;enumeration value="EXTRAORDINARIO"/&gt;
 *     &lt;enumeration value="HOMESITE"/&gt;
 *     &lt;enumeration value="JURIDICO"/&gt;
 *     &lt;enumeration value="BOLETAGEM"/&gt;
 *     &lt;enumeration value="PRODUTO"/&gt;
 *     &lt;enumeration value="VP"/&gt;
 *     &lt;enumeration value="PGFN"/&gt;
 *     &lt;enumeration value="MENOR"/&gt;
 *     &lt;enumeration value="MOBILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoAcordo")
@XmlEnum
public enum TipoAcordo {

    INDEFINIDO,
    EXTERNO,
    EXTRAORDINARIO,
    HOMESITE,
    JURIDICO,
    BOLETAGEM,
    PRODUTO,
    VP,
    PGFN,
    MENOR,
    MOBILE;

    public String value() {
        return name();
    }

    public static TipoAcordo fromValue(String v) {
        return valueOf(v);
    }

}
