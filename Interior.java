package br.com.generation.voluntariado;

import java.util.Scanner;

   public class Interior { 
	   
		void interior() {
			
		 Scanner entrada = new Scanner(System.in);
		 int voluntariarInt, regSerra, regEmbu, regArtes;
		 System.out.println("Escolha uma cidade do Interior Paulista: "
	             + "\n[1] Itapecerica da Serra \n[2] Embu-Guaçu\n[3] Embu das Artes"); 
		 voluntariarInt=entrada.nextInt();
		 
		 
		 if(voluntariarInt==1) {
			System.out.println("[1]Assoc.Cultural dos Amigos da Informática \n[2]Clave de Sol\n");
			regSerra=entrada.nextInt();
	 	 if(regSerra==1) {
	 		System.out.println("Razão social: Assoc.Cultural dos Amigos da Informática \n"
	 				+ "Descrição: O Lixo eletrônico é muito perigoso para o meio ambiente! Vamos ajudar \n"
	 				+ "a preservar a natureza e também a nossa história? \n"
	 				+ "Área de Atuação: Museus \n"
	 				+ "Rua Itanhaem 5 \n"
    				+ "Jd.João Montesano \n"
    				+ "CEP 06853-500 \n"
    				+ "(11) 46667545 \n"
	 				+ "curador@museudocomputador.org.br \n"
	 				+ "www.museudocomputador.org.br");
	 	}
	 	else if(regSerra==2) {
	 		System.out.println("Razão social : Assoc.Comunitária Clave de Sol \n"
	 				+ "Descrição: A Associação Comunitária Clave de Sol visa a gestão e execução \n"
	 				+ "de atividades do Serviço de Proteção Social Básica \n"
	 				+ "Área de Atuação: Educação \n"
	 				+ "Estrada das Palmeiras 969 \n"
    				+ "Parque Yara Cecy \n"
    				+ "CEP 06872-240 \n"
	 				+ "Tel (11) 4667 7708.\n"
	 				+ "clavedesol-diretoria@uol.com.br \n"
	 				+ "www.clavedesol.org.br");
	 	}
	 	else {
	 		System.out.println("Você digitou um número inválido");
	 		}
		}
	 	else if(voluntariarInt==2) {
	 		System.out.println("[1]Lar Voluntários do Amor\n");
	 		regEmbu=entrada.nextInt();
	 		if(regEmbu==1) {
	 		System.out.println("Razão social : Lar Voluntários do Amor \n"
	 				+ "Descrição: O Lar Voluntários do Amor é uma entidade sem fins lucrativos \n"
	 				+ "que visa os cuidados com o ser humano em desenvolvimento. \n"
	 				+ "Área de Atuação: Assistência e serviços sociais \n"
	 				+ "R.Voluntários do Amor 580 Cx.90 \n"
	 				+ "Cipó \n"
	 				+ "CEP 06900-000 \n"
	 				+ "(11) 95781-2914; (11) 94015-9481; (11) 94700-3817; (11) 97255-0227; (11) 4663-2606 \n"
	 				+ "https://www.larvoluntariosdoamor.com \n");
	 	}
	 		else {
		 		System.out.println("Você digitou um número inválido");
		 		}
	 	}
	 	else if(voluntariarInt==3) {
	 		System.out.println("[1]Aliança Cultural Brasil Filipinas\n");
	 		 regArtes=entrada.nextInt();
	 	 if( regArtes==1) {
	 		System.out.println("Razão social: Aliança Cultural Brasil Filipinas \n"
	 				+ "Descrição: Transformando Nossa Comunidade através de Projetos Sociais, Culturais e Esportivos \n"
	 				+ "Área de Atuação: Cultura \n"
	 				+ "Rua Califórnia, 512 \n"
	 				+ "Jardim Santo Eduardo \n"
	 				+ "CEP 06823-020 \n"
	 				+ "(11) 42034106 \n"
	 				+ "aliancaculturalbrasilfilipinas@gmail.com \n"
	 				+ "Brasilfilipinas.org.br");
	 	}
	 	else {
	 		System.out.println("Você digitou um número inválido");
	 	}
    }
	 	else {
	 		System.out.println("Você digitou um número inválido");
	 	}
	 	
	 	entrada.close();
	}
}


