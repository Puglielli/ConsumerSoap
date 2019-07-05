package com.atelecom.soapclient;

import br.com.ativos.rico.commons.service.PesquisarCPFOmnichannel;
import br.com.ativos.rico.commons.service.PesquisarCPFOmnichannelResponse;
import br.com.ativos.rico.commons.service.StatusTelefone;
import br.com.ativos.rico.commons.service.TipoTelefone;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSoapClientApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
//            String name = "Sajal";//Default Name
//            if(args.length>0){
//                name = args[0];
//            }
//            StudentDetailsRequest request = new StudentDetailsRequest();
//            request.setName(name);
//            StudentDetailsResponse response =(StudentDetailsResponse) soapConnector.callWebService("http://localhost:8080/service/student-details", request);
//            System.out.println("Got Response As below ========= : ");
//            System.out.println("Name : "+response.getStudent().getName());
//            System.out.println("Standard : "+response.getStudent().getStandard());
//            System.out.println("Address : "+response.getStudent().getAddress());

            String cpf = "04323553000136";
            String ddd = "11";
            String numero = "981694828";

            PesquisarCPFOmnichannel request = new PesquisarCPFOmnichannel();

            request.setCpfCnpj(cpf);
            request.setDdd(ddd);
            request.setNumero(numero);
            request.setTipoTelefone(TipoTelefone.CELULAR);
            request.setStatusTelefone(StatusTelefone.ATENDE);

            PesquisarCPFOmnichannelResponse response = (PesquisarCPFOmnichannelResponse) soapConnector.callWebService("http://10.20.2.29:8680/rico-webservice/OmnichannelService", request);
            System.out.println("Values Ativos SOAP Resquest");
            System.out.println("Nome: " + response.getReturn().getNome());
            System.out.println("Quantidade de Acordos: " + response.getReturn().getQtdeAcordosVigentes());
            System.out.println("Escritorio Preferencial: " + response.getReturn().getEscritorioPreferencial());
            System.out.println("Nome Escritorio: " + response.getReturn().getNomeEscritorio());
        };
    }
}
