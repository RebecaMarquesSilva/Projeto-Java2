package br.com.generation.voluntariado;

import java.util.Scanner;

public class Abc {

	void abc() {
		
        System.out.println("Escolha uma cidade do ABC Paulista: "
                + "\n[1] Santo André \n[2] São Bernardo do Campo");
        Scanner entrada = new Scanner (System.in);
        int voluntariarAbc, regAndre, regBernardo;
        voluntariarAbc=entrada.nextInt();
        if(voluntariarAbc==1) {
        
        System.out.println("Escolha uma das instituições para saber mais: \n[1] Amélia Rodrigues\n[2] Projeto J.E.D.A\n[3] Casa do Caminho Ananias\n[4] AVSSA");
        	
        regAndre=entrada.nextInt();
        if(regAndre==1) {
        	System.out.println("Razão Social: Instituição Assistencial e Educacional Amélia Rodrigues \n"
    				+ "Descrição: A Instituição Amélia Rodrigues tem como objetivo proporcionar o desenvolvimento \n"
    				+ "integral de crianças e oferecer condições de trabalho às mães, visando melhoria na renda familiar. \n"
    				+ "Área de Atuação: Educação \n"
    				+ "R. Tamarutaca, 190 \n"
    				+ "Vila Guiomar \n"
    				+ "CEP 09071-130 \n"
    				+ "ameliarodrigues@ameliarodrigues.org.br \n"
    				+ "www.ameliarodrigues.org.br \n");
    				
        }
        else if(regAndre==2) {
    		System.out.println("Razão Social: Assoc.Civil Projeto Juventude Esperança do Amanhã \n"                		
    				+ "Área de Atuação: Educação"
    				+ "Descrição: O JEDA atua na defesa dos direitos de crianças, adolescentes e suas famílias,\n"
    				+ "executando ações que previnem a ocorrência de situações de risco social e fortalecendo a \n"
    				+ "convivência familiar e comunitária. \n"
    				+ "R. Dr. Eduardo Monteiro, 946 \n"
    				+ "Jd. Bela Vista \n"
    				+ "CEP 09041-300 \n"
    				+ "projetojeda@aol.com \n"
    				+ "http://www.projetojeda.org.br/index.html \n");
        }
        else if(regAndre==3) {
    		System.out.println("Razão Social: Instituição Assistencial Casa do Caminho Ananias \n"
    				+ "Área de Atuação: Assistência a idosos e adultos \n"
    				+ "Descrição: A Casa do Caminho Ananias oferece acolhimento de idosas acamadas e o fortalecimento \n"
    				+ "de vínculos para crianças, adolescentes e famílias em situação de vulnerabilidade social e econômica. \n"
    				+ "Rua Andorinhas, nº 09 \n"
    				+ "Jardim do Sol \n"
    				+ "CEP 09071-120 \n"
    				+ "https://www.casadocaminhoananias.org.br/ \n");
        }
        else if(regAndre==4) {
    		System.out.println("Razão Social: Associação dos Voluntários da Saúde de Santo André - AVSSA \n"
    				+ "Descrição: A Associação busca humanizar o atendimento da rede pública de saúde de Santo André \n"
    				+ "através de ações de apoio e acolhimento. \n"
    				+ "Área de Atuação: Saúde \n"
    				+ "Av. João Ramalho, 305 \n"
    				+ "Vila Assunção \n"
    				+ "CEP 09041-030 \n"
    				+ "mariaemilia@avssa.org.br \n"
    				+ "www.avssa.org.br \n");
        }
        else {
    		System.out.println("Você digitou um número inválido");
        }
    	
 }
    
        else if(voluntariarAbc==2) {
      
    	System.out.println("Escolha uma das instituições para saber mais: \n[1] Casa dos Velhinhos Dona Adelaide\n[2] IAIP - Irmão Palminha\n[3] AGDS\n[4] Casa de Estar São Luiz\n[5] Instituto Mamãe Clory");
    	
        regBernardo=entrada.nextInt();
        if(regBernardo==1) {
    		System.out.println("Razão Social: Casa dos Velhinhos Dona Adelaide \n"
    				+ "Descrição: A instituição promove a qualidade de vida e inclusão social da pessoa idosa em situação \n"
    				+ "de vulnerabilidade através de moradia e atividades sociais. \n"
    				+ "Área de Atuação: Assistência a idosos e adultos \n"
    				+ "Rua Príncipe Humberto, 250 \n"
    				+ "Campestre \n"
    				+ "CEP 09725-200 \n"
    				+ "contato@velhinhosadelaide.org.br \n"
    				+ "http://velhinhosadelaide.org.br/ \n"
    				);
        }
        else if(regBernardo==2) {
    		System.out.println("Razão Social: Instituição Assistencial Irmão Palminha \n"                		
    				+ "Área de Atuação: Assistência a crianças \n"
    				+ "Descrição: A IAIP realiza atendimento socioassistencial para famílias em situação de vulnerabilidade, \n"
    				+ "exclusão e risco social pois acredita que o núcleo familiar, independente de sua organização, é o primeiro\n"
    				+ "espaço de referência, proteção e socialização do indivíduo. \n"
    				+ "Rua Benedito Conrado Filho, 65 \n"
    				+ "Jardim Beatriz \n"
    				+ "CEP 09895-110 \n"
    				+ "palminha@palminha.org.br \n"
    				+ "www.iaip.org.br \n");
        }
        else if(regBernardo==3) {
    		System.out.println("Razão Social: Assoc.Global para o Desenvolvimento Sustentado \n"
    				+ "Área de Atuação: Ambientalismo \n"
    				+ "Descrição: A Associação desenvolve e implanta projetos e programas de educação ambiental, gestão \n"
    				+ "e recuperação de áreas a serem preservadas nos diversos biomas brasileiros e representa a sociedade \n"
    				+ "junto aos fóruns oficiais em temas relacionados à educação e ao meio ambiente. \n"
    				+ "Av.Vivaldi, 1421 \n"
    				+ "Rudge Ramos \n"
    				+ "CEP 09617-000 \n"
    				+ "agds@agds.org.br \n"
    				+ "www.agds.org.br \n");
        }
        else if(regBernardo==4) {
    		System.out.println("Razão Social: Associação São Luiz \n"
    				+ "Descrição: A entidade promove o acolhimento e a preservação dos vínculos familiares, sociais \n"
    				+ "e comunitários através do exercício da cidadania. Oferece atendimento e acompanhamento médico,\n"
    				+ "odontológico e psicológico, atividades pedagógicas e recreativas e tratamento especializado para\n"
    				+ "crianças com necessidades especiais. \n"
    				+ "Área de Atuação: Assistência a crianças \n"
    				+ "R. Miguel Arco e Flecha, 41 \n"
    				+ "Vila Euclides \n"
    				+ "CEP 09725-500 \n"
    				+ "https://associacaosaoluiz.org.br/ \n");
        }
        else if(regBernardo==5) {
    		System.out.println("Razão Social: Lar da Mamãe Clory \n"
    				+ "Descrição: O Lar da Mamãe Clory atua com o objetivo de amparar e assistir crianças e adolescentes \n"
    				+ "e mantém diversas atividades como creche, apoio educacional, cultural e esportivo, núcleo de educação \n"
    				+ "ambiental e núcleo de atendimento à família. \n"
    				+ "Área de Atuação: Assistência e serviços sociais \n"
    				+ "R. Francisco Visentainer, 438 \n"
    				+ "Assunção \n"
    				+ "CEP 09861-630 \n"
    				+ "diretoria@mamaeclory.org.br \n"
    				+ "www.mamaeclory.org.br \n");
        }
        else {
    	     System.out.println("Você digitou um número inválido");
        }
}
         entrada.close();
    }
}
