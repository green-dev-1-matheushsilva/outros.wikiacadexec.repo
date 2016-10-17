package br.gov.sp.fatec.MC.wikiacad.wikiacadexec.controlefluxo;




import br.gov.sp.fatec.MC.wikiacad.wikiacadexec.infos.WAMensagens;




/**
	* Created by matheusaiff on 10/12/16.
	*/
public abstract class WASistemaE {
		
	public static final byte limpar__objeto( Object alvo ){
			
			if( alvo != null ) {
					
					alvo = null;
			
					return (1);
			
			}else{
					
					WAMensagens.de_retorno( "Objeto em fluxo de execucao invalido para 'limpeza'." );
					
					return (0);
			}
			
			}
			
			public static final void encerrar(){
					
					WAMensagens.de_retorno( "Encerrando... Xau ;)" );
					
					System.exit( 0 );
					
					return;
			}
		
}
