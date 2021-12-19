package br.com.generation.voluntariado;

import java.util.Scanner;

public class Leste {
	
    void leste(){
    	
	  Scanner entrada = new Scanner(System.in);
	  int regLeste;
	  System.out.println("Escolha uma das instituições para saber mais: \n[1] Grupo da Sopa\n[2] Lar da Redenção\n[3] Casa do Cristo Redentor\n[4] Missões Quilombo");
	  regLeste=entrada.nextInt();
	  if (regLeste==1) {
		  
	  System.out.println("Razão Social: Grupo da Sopa\r\n"
	     			+ "Descrição: Preparo e distribuição de refeições, atendimento e orientação para moradores de rua \n"
	     			+ "na cidade de São Paulo. Formado por um grupo de amigos que prepara 320 refeições todas as quintas \n"
	     			+ "das 17 às 21h e depois deste horário sai para a entrega nas regiões do Brás, Centro, Ipiranga e Jabaquara. \n"
	     			+ "Aos sábados são 120 refeições preparadas das 9 às 12h e depois sai para entrega até as 14h na região do Brás \n"
	     			+ "e Glicério. Além das refeições também são levadas roupas, kits de higiene, cobertores, etc. \n"
	     			+ "Área de Atuação: Outros/Assistência \n"
	     			+ "Rua Borges de Figueiredo, 82 \n"
	     			+ "Mooca \n"
	     			+ "CEP 03110-010\r\n"                    			
	     			+ "(11) 994465312 ou (11) 96332-4165 \n"
	     			+ "contato@grupodasopa.org ou norivalnogueira@gmail.com \n"
	     			+ "www.grupodasopa.org");
      }
	  else if(regLeste==2) {
	     System.out.println("Razão Social: Lar da Redenção \n"
	     			+ "Descrição: Oferece moradia e tratamento adequado a crianças especiais portadoras de deficiência física, mental e múltipla,\n"
	     			+ "em condição de abandono e maus tratos, desenvolvendo ao máximo suas potencialidades enquanto houver prognóstico reabilitacional.\n"
	     			+ "Promover a intervenção precoce para quando possível, facilitar sua autonomia e inclusão social. \n"
	     			+ "Área de Atuação: Assistência a pessoas com deficiência \n"
	     			+ "R.Cassandoca 535 \n"
	     			+ "Mooca \n"
	     			+ "CEP 03169-010 \n"                    			
	     			+ "(11) 2605 4879 \n"
	     			+ "lardaredencao@lardaredencao.org.br \n"
	     			+ "www.lardaredencao.org.br");
	  }
	  else if(regLeste==3) {
	      System.out.println("Razão Social: Casa do Cristo Redentor \n"
	     			+ "Descrição: Tem o objetivo de acolher, educar e promover o bem-estar físico e social de crianças, adolescentes \n"
	     			+ "e famílias em situação de vulnerabilidade social. \n"
	     			+ "Área de Atuação: Assistência a crianças\r\n"
	     			+ "R.Agrimensor Sugaya 986 \n"
	     			+ "Itaquera \n"
	     			+ "CEP 08260-030 \n"
	     			+ "(11) 6521 6222 \n"
	     			+ "ccr@casadocristoredentor.org.br \n"
	     			+ "www.casadocristoredentor.org.br");
	  }
	  else if(regLeste==4) {
	      System.out.println("Razão Social: Sociedade Cultural Missões Quilombo \n"
	     			+ "Descrição: Tem o objetivo de levar à consciência negra e à negritude cristã, debate racial com a sociedade.\n"
	     			+ "Promover a discussão bíblico-teológica sobre o racismo. Debater os preconceitos ainda encontrados na igreja, \n"
	     			+ "na teologia e na educação religiosa \n"
	     			+ "Área de Atuação: Direitos Humanos e Cidadania \n"
	     			+ "R.João Bodin 296 Quadra M Casa 01 \n"
	     			+ "Jardim Aurora \n"
	     			+ "CEP 08431-060 \n"                    			
	     			+ "(11) 6135 3867 \n"
	     			+ "hernaniquilombo@yahoo.com.br \n"
	     			+ "www.mquilombo.com.br");
	  }
	  else {
	 	  System.out.println("Você digitou um número inválido");
	 	   }
		   entrada.close();
	  }
}

       

