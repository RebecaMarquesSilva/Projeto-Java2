package br.com.generation.voluntariado;

import java.util.Scanner;

public class Teste_sul {

	void sul() {
		
		Scanner entrada =new Scanner(System.in);
		int  regSul;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Associação Beneficente Parsifal\n[2] GRAACC - Grupo de Apoio a Adolescentes e à Criança com Câncer\n[3] Fundação Bunge\n[4] Assoc.Desportiva para Deficientes");
		regSul=entrada.nextInt();
		
    	if(regSul==1) {
    		System.out.println("Razão Social: Assoc.Beneficente Parsifal \n"
    				+ "Descrição: A Parsifal, instituição de Pedagogia Curativa e Terapia Social, foi fundada em 1991 \n"
    				+ "e tem como objetivo promover o desenvolvimento pessoal e o convívio social de crianças, jovens \n"
    				+ "e adultos com deficiências e distúrbios psíquicos. \n"
    				+ "Área de Atuação: Assistência a pessoas com deficiência \n"
    				+ "R.Robélia 59 \n"
    				+ "Jardim Prudência \n"
    				+ "CEP 04648-240 \n"
    				+ "(11) 5547 0201 \n"
    				+ "aparsifal@terra.com.br \n"
    				+ "https://parsifal.org.br");
    	}
    	else if(regSul==2) {
    		System.out.println("Razão Social: GRAACC - Grupo de Apoio a Adolescentes e à Criança com Câncer \n"                		
    				+ "Descrição: Garantir a crianças e adolescentes com câncer, dentro do mais avançado padrão científico,\n"
    				+ "o direito de alcançar todas as chances de cura com qualidade de vida. \n"
    				+ "Área de Atuação: Assistência a crianças \n"
    				+ "R.Botucatu 743 \n"
    				+ "Vila Clementino \n"
    				+ "CEP 04023-062  \n"
    				+ "(11) 5080 8400 \n"
    				+ "graacc@graacc.org.br \n"
    				+ "www.graacc.org.br");
    	}
    	else if(regSul==3) {
    		System.out.println("Razão Social: Fundação Bunge \n"
    				+ "Descrição: Contribuir para o desenvolvimento sustentável por meio de ações que valorizem o avanço da ciência,\n"
    				+ "a educação e a conservação dos recursos naturais. \n"
    				+ "Área de Atuação: Educação e pesquisa \n"
    				+ "Av.Maria Coelho Aguiar 215 Bloco D - 5º andar \n"
    				+ "Jardim São Luiz \n"
    				+ "CEP 05804-900 \n"
    				+ "(11) 3741 6832 \n"
    				+ "fundacao@bunge.com.br \n"
    				+ "www.fundacaobunge.org.br");
    	}
    	else if(regSul==4) {
    		System.out.println("Razão Social: ADD- Assoc.Desportiva para Deficientes \n"
    				+ "Descrição: Missão Incentivar e promover o desenvolvimento e a inclusão de pessoas com deficiência por meio \n"
    				+ "do esporte e do apoio educacional em âmbito nacional. Princípios e Valores: ADD valoriza os talentos \n"
    				+ "e capacidades das pessoas, apoiando-se em princípios éticos e morais. \n"
    				+ "Área de Atuação: Assistência a pessoas com deficiência \n"
    				+ "Rua das Pitombeiras, 296 \n"
    				+ "Vila Parque Jabaquara \n"
    				+ "CEP 04321-160 \n"
    				+ "(11) 50116133 \n"
    				+ "contato@add.org.br \n"
    				+ "www.add.org.br \n"
    				+ "addassociacao \n"
    				+ "@addaddociacao");
    	}
    	else {
    		System.out.println("Você digitou um número inválido");
    	}
    	entrada.close();
    	}

	}