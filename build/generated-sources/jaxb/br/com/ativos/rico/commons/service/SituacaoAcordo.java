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
 * <p>Classe Java de situacaoAcordo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="situacaoAcordo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NAO_EXAMINADO"/&gt;
 *     &lt;enumeration value="APROVADO"/&gt;
 *     &lt;enumeration value="REJEITADO"/&gt;
 *     &lt;enumeration value="EM_ANALISE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "situacaoAcordo")
@XmlEnum
public enum SituacaoAcordo {

    NAO_EXAMINADO,
    APROVADO,
    REJEITADO,
    EM_ANALISE;

    public String value() {
        return name();
    }

    public static SituacaoAcordo fromValue(String v) {
        return valueOf(v);
    }

}
