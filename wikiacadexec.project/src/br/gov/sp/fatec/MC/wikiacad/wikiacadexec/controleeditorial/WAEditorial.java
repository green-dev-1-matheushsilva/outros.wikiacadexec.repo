package br.gov.sp.fatec.MC.wikiacad.wikiacadexec.controleeditorial;




import br.gov.sp.fatec.MC.wikiacad.wikiacadexec.infos.WAMensagens;




/**
	* Created by matheusaiff on 10/12/16.
	*/
public final class WAEditorial {
		
		
		
		
		private String IDU__EDITORIAL = null;
		
		
		private String nome_editorial = null;
		
		
		private String data_nascimento = null;
		
		
		private String sexo = null;
		
		
		private String e_mail_comunicacao = null;
		
		
		private String CHAVE_AUTO_editorial = null;
		
		
		private String publicacoes_curtidas_editorial = null;
		
		
		private String publicacoes_comentadas_editorial = null;
		
		
		private String avisos_adver_administrador_peditorial = null;
		
		
		private String publs_selecionadas = null;
		
		
		private String diretorio_util = null;
		
		
		
		public final void especificar__IDU__EDITORIAL( final String valor__IDU__EDITORIAL ) {
				
				
				if( valor__IDU__EDITORIAL != null && valor__IDU__EDITORIAL.length( ) == 6 ) {
						this.IDU__EDITORIAL = valor__IDU__EDITORIAL;
				}
				
				return;
		}
		
		
		public final String retornar__IDU__EDITORIAL( ) {
				
				
				if( this.IDU__EDITORIAL != null && this.IDU__EDITORIAL.length( ) == 6 ) {
						
						return this.IDU__EDITORIAL;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
		}
		
		
		public final void especificar__nome_editorial( final String valor__nome_editorial ) {
				
				
				if( valor__nome_editorial != null && valor__nome_editorial.length( ) <= 48
						&& valor__nome_editorial.length( ) > 7 ) {
						this.nome_editorial = valor__nome_editorial;
				}
				
				return;
		}
		
		
		public final String retornar__nome_editorial( ) {
				
				
				if( this.nome_editorial != null && this.nome_editorial.length( ) > 7 ) {
						
						return this.nome_editorial;
						
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
		
		public final void especificar__CHAVE_AUTO_editorial( final String valor__CHAVE_AUTO_editorial ) {
				
				
				if( valor__CHAVE_AUTO_editorial != null && valor__CHAVE_AUTO_editorial.length( ) == 58 ) {
						this.CHAVE_AUTO_editorial = valor__CHAVE_AUTO_editorial;
				}
				return;
		}
		
		public final String retornar__CHAVE_AUTO_editorial( ) {
				
				
				if( this.CHAVE_AUTO_editorial != null && this.CHAVE_AUTO_editorial.length( ) == 58 ) {
						
						return this.CHAVE_AUTO_editorial;
						
				} else {
						
						return new String( "DESCONHECIDO" );
						
				}
				
				
		}
		public final void especificar__publicacoes_curtidas_editorial( final String valor__publicacoes_curtidas_editorial ){
				
				this.publicacoes_curtidas_editorial = valor__publicacoes_curtidas_editorial;
				
				return;
		}
		
		public final String retornar__publicacoes_curtidas_editorial( ){
				
				if( this.publicacoes_curtidas_editorial != null && this.publicacoes_curtidas_editorial.length() > 5 ){
						
						return this.publicacoes_curtidas_editorial;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__publicacoes_comentadas_editorial( final String valor__publicacoes_comentadas_editorial ){
				
				this.publicacoes_comentadas_editorial = valor__publicacoes_comentadas_editorial;
				
				return;
		}
		
		public final String retornar__publicacoes_comentadas_editorial( ){
				
				if( this.publicacoes_comentadas_editorial != null && this.publicacoes_comentadas_editorial.length() > 5 ){
						
						return this.publicacoes_comentadas_editorial;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__avisos_adver_administrador_peditorial( final String
																																																																										valor__avisos_adver_administrador_peditorial ){
				
				this.avisos_adver_administrador_peditorial = valor__avisos_adver_administrador_peditorial;
				
				return;
		}
		
		public final String retornar__avisos_adver_administrador_peditorial( ){
				
				if( this.avisos_adver_administrador_peditorial != null && this.avisos_adver_administrador_peditorial.length() > 5 ){
						
						return this.avisos_adver_administrador_peditorial;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__publs_selecionadas( final String valor__publs_selecionadas ){
				
				this.publs_selecionadas = valor__publs_selecionadas;
				
				return;
		}
		
		public final String retornar__publs_selecionadas( ){
				
				if( this.publs_selecionadas != null && this.publs_selecionadas.length() > 5 ){
						
						return this.publs_selecionadas;
						
				}else{
						
						return new String("DESCONHECIDO");
						
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
				
				final String in_IDU__EDITORIAL,
				final String in_nome_editorial,
				final String in_data_nascimento,
				final String in_sexo,
				final String in_e_mail_comunicacao,
				final String in_CHAVE_AUTO_editorial,
				final String in_publicacoes_curtidas_editorial,
				final String in_publicacoes_comentadas_editorial,
				final String in_avisos_adver_administrador_peditorial,
				final String in_publs_selecionadas,
				final String in_diretorio_util
				
		){
			
				try {
						
						this.especificar__IDU__EDITORIAL( in_IDU__EDITORIAL );
						this.especificar__nome_editorial( in_nome_editorial );
						this.especificar__data_nascimento( in_data_nascimento );
						this.especificar__sexo( in_sexo );
						this.especificar__e_mail_comunicacao( in_e_mail_comunicacao );
						this.especificar__CHAVE_AUTO_editorial( in_CHAVE_AUTO_editorial );
						this.especificar__publicacoes_curtidas_editorial( in_publicacoes_curtidas_editorial );
						this.especificar__publicacoes_comentadas_editorial( in_publicacoes_comentadas_editorial );
						this.especificar__avisos_adver_administrador_peditorial( in_avisos_adver_administrador_peditorial );
						this.especificar__publs_selecionadas( in_publs_selecionadas );
						this.especificar__diretorio_util( in_diretorio_util );
						
						
				}catch(Exception excessao){
						
						WAMensagens.de_excecao( excessao.getMessage() );
						
				}
		}
		
		WAEditorial(
				
				final String cin_IDU__EDITORIAL,
				final String cin_nome_editorial,
				final String cin_data_nascimento,
				final String cin_sexo,
				final String cin_e_mail_comunicacao,
				final String cin_CHAVE_AUTO_editorial,
				final String cin_publicacoes_curtidas_editorial,
				final String cin_publicacoes_comentadas_editorial,
				final String cin_avisos_adver_administrador_peditorial,
				final String cin_publs_selecionadas,
				final String cin_diretorio_util
				
				
		){
				
				this.construir(
				
				cin_IDU__EDITORIAL,
				cin_nome_editorial,
				cin_data_nascimento,
				cin_sexo,
				cin_e_mail_comunicacao,
				cin_CHAVE_AUTO_editorial,
				cin_publicacoes_curtidas_editorial,
				cin_publicacoes_comentadas_editorial,
				cin_avisos_adver_administrador_peditorial,
				cin_publs_selecionadas,
				cin_diretorio_util
						
				);
				
				
		}
		
}
