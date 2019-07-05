package com.atelecom.soapclient;

import br.com.ativos.rico.commons.service.PesquisarCPFOmnichannel;
import br.com.ativos.rico.commons.service.StatusTelefone;
import br.com.ativos.rico.commons.service.TipoTelefone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

public class Teste {

    public static void main(String[] args) {
        String cpf = "04323553000136";
        String ddd = "11";
        String numero = "981694828";

        PesquisarCPFOmnichannel request = new PesquisarCPFOmnichannel();

        request.setCpfCnpj(cpf);
        request.setDdd(ddd);
        request.setNumero(numero);
        request.setTipoTelefone(TipoTelefone.CELULAR);
        request.setStatusTelefone(StatusTelefone.ATENDE);
        try {
            String s = PesquisarCPFOmnichannel(request);
            System.out.println(s);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static String PesquisarCPFOmnichannel(PesquisarCPFOmnichannel pesquisa) throws JAXBException {
        StringWriter stringWriter = new StringWriter();

        JAXBContext jaxbContext = JAXBContext.newInstance(PesquisarCPFOmnichannel.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // format the XML output
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                true);

        QName qName = new QName("br.com.ativos.rico.commons.service", "pesquisa");
        JAXBElement<PesquisarCPFOmnichannel> root = new JAXBElement<>(qName, PesquisarCPFOmnichannel.class, pesquisa);

        jaxbMarshaller.marshal(root, stringWriter);

       // jaxbMarshaller.marshal(pesquisa, stringWriter);

        String result = stringWriter.toString();
        //System.out.println(result);
        //LOGGER.info(result);
        return result;

    }

}
