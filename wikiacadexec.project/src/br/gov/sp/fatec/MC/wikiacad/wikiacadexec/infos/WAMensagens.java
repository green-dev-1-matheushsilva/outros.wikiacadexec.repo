package br.gov.sp.fatec.MC.wikiacad.wikiacadexec.infos;




/**
	* Created by matheusaiff on 10/11/16.
	*/
public abstract class WAMensagens {
		
		public static final void de_excecao( final String captura__excecao ){
				
				System.out.println("+-------------------------------------+");
				System.out.println("|O WIKIACADEXEC encontrou uma excecao...");
				System.out.println("|"+captura__excecao);
				System.out.println("+-------------------------------------+");
				
				return;
		}
		
		public static final void de_retorno( final String captura__retorno ){
				
				System.out.println("+-------------------------------------+");
				System.out.println("|O WIKIACADEXEC retorna...");
				System.out.println("|"+captura__retorno);
				System.out.println("+-------------------------------------+");
				
				return;
		}
		
		public static final void de_saida( final String captura__saida ){
				
				System.out.println("<div id=\"WIKIACADEXEC__resposta\">");
				System.out.println("<p id=\"WIKIACADEXEC__tdo\">");
				System.out.println(captura__saida);
				System.out.println("</p>");
				System.out.println("</div>");
		
				return;
		}
		
}
