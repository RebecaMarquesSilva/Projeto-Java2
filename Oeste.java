package br.com.generation.voluntariado;

import java.util.Scanner;

public class Oeste {

	void oeste() {
		
		Scanner entrada =new Scanner(System.in);
		int  RegOeste;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Instituto Sorrir Para Vida\n[2]  Associação criança Brasil\n[3] Liga das Senhoras Católicas de São Paulo\r\n[4] Instituto Fazendo História");
		RegOeste=entrada.nextInt();
		
    	if(RegOeste==1) {
    		System.out.println("Razão Social: Instituto Sorrir Para Vida \n"
    				+ "Descrição: Organização social sem fins lucrativos, criada para garantir o tratamento odontológico \n"
    				+ "de pessoas com câncer e com deficiência em situação de vulnerabilidade social. \n"
    				+ "Área de Atuação: Tratamento odontológico de pessoas com câncer \n"
    				+ "rua Ferreira de Araujo, 957 \n"
    				+ "Pinheiros \n"
    				+ "CEP 05428-002 \n"
    				+ "(11) 2977-4626 \n"
    				+ "contato@sorrirparavida.org.br \n");
        }
    	else if(RegOeste==2) {
    		System.out.println("Razão Social: Associação Criança Brasil \n"            		
    				+ "Descrição:Associação Criança Brasil é uma organização social sem fins econômicos com Certificado \n"
    				+ "de Entidade Beneficente de Assistência Social (CEBAS), inscrita no Conselho Municipal de Assistência Social \n"
    				+ "(COMAS) e no Conselho Municipal dos Direitos da Criança e do Adolescente (CMDCA).\n"
    				+ "Área de Atuação: Assistência a crianças \n"
    				+ "Rua Jacundá, 112 \n"
    				+ "Jardim Panorama \n"
    				+ "CEP 05679-060 \n"
    				+ "(11) 3773-4992 \n"
    				+ "crianca@criancabrasil.org.br");
    	}
    	else if(RegOeste==3) {
    		System.out.println(" Razão Social: Liga das Senhoras Católicas de São Paulo \n"    				
    				+ "Descrição:A Liga Solidária desenvolve programas sociais de educação e cidadania para crianças,\n"
    				+ "jovens e adultos que residem em áreas de alta vulnerabilidade social. \n"
    				+ "Área de Atuação: Educação e cidadania \n"
    				+ "Av. Dr. Arnaldo 1943 \n"
    				+ "Sumaré\r\n"
    				+ "CEP 01255-000 \n"
    				+ "(11) 3017-0613 \n"
    				+ "contatovoluntariado@ligasolidaria.org");
    	}
    	else if(RegOeste==4) {
    		System.out.println("Razão Social: Associação Fazendo História \n"
    				+ "Descrição: Há 15 anos, o Instituto Fazendo História trabalha pelo direito de cada uma das 40 mil crianças \n"
    				+ "e adolescentes que vivem separados de suas famílias, em abrigos e outros serviços de acolhimento, para que \n"
    				+ "se desenvolvam plenamente em família e na comunidade. \n"
    				+ "Área de Atuação: Acolhimento de crianças e adolecentes \n"
    				+ "Rua Pedro Ortiz 114 \n"
    				+ "Sumarezinho \n"
    				+ "CEP 05440-010 \n"
    				+ "(11) 3021-9889 \n"
    				+ "daniela@fazendohistoria.org.br");
    	}
    	else {
    		System.out.println("Você digitou um número inválido");
    	}
    	entrada.close();

        }
}
