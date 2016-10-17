package br.gov.sp.fatec.MC.wikiacad.wikiacadexec.controleadministrador;




import br.gov.sp.fatec.MC.wikiacad.wikiacadexec.infos.WAMensagens;




/**
	* Created by matheusaiff on 10/11/16.
	*/
public final class WAAdministrador {
		
		
		
		
		private String IDU__ADMINISTRADOR = null;
		
		
		private String nome_administrador = null;
		
		
		private String data_nascimento = null;
		
		
		private String sexo = null;
		
		
		private String e_mail_comunicacao = null;
		
		
		private String CHAVE_AUTO_administrador = null;
		
		
		private int qtd_publs_avaliadas = 0;
		
		
		private int qtd_publs_excluidas = 0;
		
		
		private String publicacoes_excluidas = null;
		
		
		private String contas_excluidas = null;
		
		
		private String diretorio_util = null;
		
		
		
		
		public final void especificar__IDU_ADMINISTRADOR( final String valor__IDU_ADMINISTRADOR ) {
				
				
				if( valor__IDU_ADMINISTRADOR != null && valor__IDU_ADMINISTRADOR.length( ) == 4 ) {
						this.IDU__ADMINISTRADOR = valor__IDU_ADMINISTRADOR;
				}
				
				return;
		}
		
		
		public final String retornar__IDU_ADMINISTRADOR( ) {
				
				
				if( this.IDU__ADMINISTRADOR != null && this.IDU__ADMINISTRADOR.length( ) == 4 ) {
						
						return this.IDU__ADMINISTRADOR;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
		}
		
		
		public final void especificar__nome_administrador( final String valor__nome_administrador ) {
				
				
				if( valor__nome_administrador != null && valor__nome_administrador.length( ) <= 48
						&& valor__nome_administrador.length( ) > 7 ) {
						this.nome_administrador = valor__nome_administrador;
				}
				
				return;
		}
		
		
		public final String retornar__nome_administrador( ) {
				
				
				if( this.nome_administrador != null && this.nome_administrador.length( ) > 7 ) {
						
						return this.nome_administrador;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
		}
		
		
		public final void especificar__data_nascimento( final String valor__data_nascimento ) {
				
				
				if( valor__data_nascimento != null && valor__data_nascimento.length( ) == 10 ) {
						this.data_nascimento = valor__data_nascimento;
				}
				return;
		}
		
		
		public final String retornar__data_nascimento( ) {
				
				
				if( this.data_nascimento != null && this.data_nascimento.length( ) == 10 ) {
						
						return this.data_nascimento;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
		}
		
		
		public final void especificar__sexo( final String valor__sexo ) {
				
				
				if( ( valor__sexo != null && valor__sexo.length( ) <= 9 )
						&& ( valor__sexo.length( ) >= 8 ) ) {
						this.sexo = valor__sexo;
				}
				return;
		}
		
		
		public final String retornar__sexo( ) {
				
				
				if( this.sexo != null && this.sexo.length( ) >= 8 ) {
						
						return this.sexo;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
		}
		
		
		public final void especificar__e_mail_comunicacao( final String valor__e_mail_comunicacao ) {
				
				
				if( valor__e_mail_comunicacao != null && valor__e_mail_comunicacao.length( ) <= 48
						&& valor__e_mail_comunicacao.length( ) > 5 && valor__e_mail_comunicacao.contains( "@" ) ) {
						this.e_mail_comunicacao = valor__e_mail_comunicacao;
				}
				return;
		}
		
		
		public final String retornar__e_mail_comunicacao( ) {
				
				
				if( this.e_mail_comunicacao != null && this.e_mail_comunicacao.length( ) > 5
						&& this.e_mail_comunicacao.contains( "@" )
						) {
						
						return this.e_mail_comunicacao;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
				
				
		}
		
		public final void especificar__CHAVE_AUTO_administrador( final String valor__CHAVE_AUTO_administrador ) {
				
				
				if( valor__CHAVE_AUTO_administrador != null && valor__CHAVE_AUTO_administrador.length( ) == 72 ) {
						this.CHAVE_AUTO_administrador = valor__CHAVE_AUTO_administrador;
				}
				return;
		}
		
		
		public final String retornar__CHAVE_AUTO_administrador( ) {
				
				
				if( this.CHAVE_AUTO_administrador != null && this.CHAVE_AUTO_administrador.length( ) == 72 ) {
						
						return this.CHAVE_AUTO_administrador;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
				
				
		}
		
		public final void especificar__qtd_publs_avaliadas( final int valor__qtd_publs_avaliadas ) {
				
				
				if( valor__qtd_publs_avaliadas >= 0 ) {
						this.qtd_publs_avaliadas = valor__qtd_publs_avaliadas;
				}
				return;
		}
		
		public final int retornar__qtd_publs_avaliadaso( ) {
				
						return this.qtd_publs_avaliadas;
				
		}
		
		public final void especificar__qtd_publs_excluidas( final int valor__qtd_publs_excluidas ) {
				
				
				if( valor__qtd_publs_excluidas >= 0 ) {
						this.qtd_publs_excluidas = valor__qtd_publs_excluidas;
				}
				return;
		}
		
		public final int retornar__qtd_publs_excluidas( ) {
				
						return this.qtd_publs_excluidas;
				
		}
		
		public final void especificar__publicacoes_excluidas( final String valor__publicacoes_excluidas ) {
				
						this.publicacoes_excluidas = valor__publicacoes_excluidas;
			
				return;
		}
		
		public final String retornar__publicacoes_excluidas( ) {
				
				
				if( this.publicacoes_excluidas != null && this.publicacoes_excluidas.length( ) > 5	) {
						
						return this.publicacoes_excluidas;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
				
				
		}
		
		public final void especificar__contas_excluidas( final String valor__contas_excluidas ) {
				
				this.contas_excluidas = valor__contas_excluidas;
				
				return;
		}
		
		public final String retornar__contas_excluidas( ) {
				
				
				if( this.contas_excluidas != null && this.contas_excluidas.length( ) > 5	) {
						
						return this.contas_excluidas;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
				
				
		}
		
		public final void especificar__diretorio_util( final String valor__diretorio_util ){
				
				
				if(valor__diretorio_util != null && valor__diretorio_util.length() <= 210
						&& valor__diretorio_util.length() > 5 && valor__diretorio_util.contains( "/" ) ) {
						this.diretorio_util = valor__diretorio_util;
				}
				return;
		}
		
		public final String retornar__diretorio_util( ){
				
				if( this.diretorio_util != null && this.diretorio_util.length() > 5 ){
						
						return this.diretorio_util;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		
		private final synchronized void construir(
				
				final String in_IDU__ADMINISTRADOR,
				final String in_nome_administrador,
				final String in_data_nascimento,
				final String in_sexo,
				final String in_e_mail_comunicacao,
				final String in_CHAVE_AUTO_administrador,
				final int  		in_qtd_publs_avaliadas,
				final int 			in__qtd_publs_excluidas,
				final String in_publicacoes_excluidas,
				final String in_contas_excluidas,
				final String in_diretorio_util
				
		){
				
				
				
				try{
						
						this.especificar__IDU_ADMINISTRADOR( in_IDU__ADMINISTRADOR );
						this.especificar__nome_administrador( in_nome_administrador );
						this.especificar__data_nascimento( in_data_nascimento );
						this.especificar__sexo( in_sexo );
						this.especificar__e_mail_comunicacao( in_e_mail_comunicacao );
						this.especificar__CHAVE_AUTO_administrador( in_CHAVE_AUTO_administrador );
						this.especificar__qtd_publs_avaliadas( in_qtd_publs_avaliadas );
						this.especificar__qtd_publs_excluidas( in__qtd_publs_excluidas );
						this.especificar__publicacoes_excluidas( in_publicacoes_excluidas );
						this.especificar__contas_excluidas( in_contas_excluidas );
						this.especificar__diretorio_util( in_diretorio_util );
						
				}catch( Exception excessao ){
						
						WAMensagens.de_excecao( excessao.getMessage() );
				
				}
		
		return;
		
		}
		
		
		WAAdministrador(
				
				final String cin_IDU__ADMINISTRADOR,
				final String cin_nome_administrador,
				final String cin_data_nascimento,
				final String cin_sexo,
				final String cin_e_mail_comunicacao,
				final String cin_CHAVE_AUTO_administrador,
				final int  		cin_qtd_publs_avaliadas,
				final int 			cin__qtd_publs_excluidas,
				final String cin_publicacoes_excluidas,
				final String cin_contas_excluidas,
				final String cin_diretorio_util
				
				
		) {
		
		this.construir(
				
				 cin_IDU__ADMINISTRADOR,
					cin_nome_administrador,
					cin_data_nascimento,
					cin_sexo,
					cin_e_mail_comunicacao,
					cin_CHAVE_AUTO_administrador,
					cin_qtd_publs_avaliadas,
					cin__qtd_publs_excluidas,
					cin_publicacoes_excluidas,
					cin_contas_excluidas,
					cin_diretorio_util
		
		);
		
		}

}
