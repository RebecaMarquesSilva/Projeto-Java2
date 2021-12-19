package br.com.generation.voluntariado;

import java.util.Scanner;

public class Norte {
	
	void norte() {
		
		Scanner entrada =new Scanner(System.in);
		int  regNorte;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Instituto Resgatando Vidas\n[2] Associação Tia Marly\n[3] Associação Cultural e Esportiva Viva ZN\r\n[4] Moradia Associação Civil\r\n");
		regNorte=entrada.nextInt();
		
    	if(regNorte==1) {
    		System.out.println("Razão Social: Instituto Resgatando Vidas Para Vida \n"
    				+ "Descrição: Tem como objetivo principal promover cidadania e transformação social através da educação \n"
    				+ "e empreendedorismo junto à população aos arredores do bairro da Vila Nova Cachoeirinha \n"
    				+ "Área de Atuação: Cidadania e vida \n"
    				+ "Rua Augusto Gil 465 \n"
    				+ "Vila Dionisia \n"
    				+ "CEP  02670-070 \n"
    				+ "(11) 3774-5981 \n"
    				+ "contato@institutoresgatandovidas.org.br"
    				);
    	}
    	else if(regNorte==2) {
    		System.out.println("Razão Social: Associação Tia Marly \n"                		
    				+ "Descrição: A associação Tia Marly é uma organização social, não conveniada a órgãos públicos, \n "
    				+ "sem fins lucrativos, fundada em 27 de junho de 2007, através da iniciativa de um grupo de amigos. \n "
    				+ "Na unidade são oferecidas 17 vagas para acolhida integral de crianças e adolescentes de 0 a 17 anos e 11 meses.\n"
    				+ "Vítimas de maus tratos, abuso, violência e abandono. \n"
    				+ "Área de Atuação: Assistência a crianças \n"
    				+ "Rua Duarte de Azevedo 608 \n"
    				+ "Santana- SP \n"
    				+ "CEP 02036-022 \n"
    				+ "(11) 2099-3725 \n"
    				+ "marly@casatiamarly.org.br");
    	}
    	else if(regNorte==3) {
    		System.out.println("Razão Social: Associação Cultural e Esportiva Viva ZN \n"
    				+ "Descrição: A Viva ZN é uma entidade sem fins lucrativos que acredita no potencial que a cultura, \n"
    				+ "a educação e o esporte têm para transformar a realidade social de crianças e adolescentes que vivem em regiões periféricas. \n"
    				+ "Área de Atuação: Cultura, educação e esportes \n"
    				+ "Rua Engenheiro César 76 \n"
    				+ "Santana - SP \n"
    				+ "CEP 02018-070 \n"
    				+ "(11) 9989-6654 \n"
    				+ "associacaovivazn@gmail.com \n");
    	}
    	else if(regNorte==4) {
    		System.out.println("Razão Social: Moradia Associação Civil \n"
    				+ "Descrição: As Casas Taiguara são Casas de Acolhimento e Abrigos para crianças e adolescentes sem moradia,\n"
    				+ "principalmente aqueles que estão nas ruas de São Paulo. Desde 1996, seguem uma metodologia de trabalho \n"
    				+ "pioneira e atuante: o acolhimento 24 horas, oferecendo moradia segura, volta à escola, boa alimentação e calor humano. \n"
    				+ "Área de Atuação: Acolhimento e abrigos para moradores de rua \n"
    				+ "Rua Felipe Fragoso 177 \n"
    				+ "Bairro Freguesia do Ó \n"
    				+ "CEP 02558-060 \n"
    				+ "(11) 3951-6987 \n"
    				+ "valeriagonpassaro@gmail.com");
    	}
    	else {
    		System.out.println("Você digitou um número inválido");
    	}
    	entrada.close();

    }
}

