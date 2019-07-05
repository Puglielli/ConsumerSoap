package com.atelecom.soapclient;

import br.com.ativos.rico.commons.service.PesquisarCPFOmnichannel;
import br.com.ativos.rico.commons.service.StatusTelefone;
import br.com.ativos.rico.commons.service.TipoTelefone;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;


public class JaxbExample
{
    public static void main(String[] args)
    {
        //Employee employee = new Employee(1, "Lokesh", "Gupta", new Department(101, "IT"));
        String cpf = "04323553000136";
        String ddd = "11";
        String numero = "981694828";

        PesquisarCPFOmnichannel request = new PesquisarCPFOmnichannel();

        request.setCpfCnpj(cpf);
        request.setDdd(ddd);
        request.setNumero(numero);
        request.setTipoTelefone(TipoTelefone.CELULAR);
        request.setStatusTelefone(StatusTelefone.ATENDE);
        jaxbObjectToXML(request);
    }

    private static void jaxbObjectToXML(PesquisarCPFOmnichannel pesquisaCPF)
    {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PesquisarCPFOmnichannel.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // To format XML
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            //If we DO NOT have JAXB annotated class
            JAXBElement<PesquisarCPFOmnichannel> jaxbElement =
                    new JAXBElement<PesquisarCPFOmnichannel>( new QName("", "ser:pesquisarCPFOmnichannel"),
                            PesquisarCPFOmnichannel.class,
                            pesquisaCPF);

            jaxbMarshaller.marshal(jaxbElement, System.out);

            //If we have JAXB annotated class
            //jaxbMarshaller.marshal(employeeObj, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}