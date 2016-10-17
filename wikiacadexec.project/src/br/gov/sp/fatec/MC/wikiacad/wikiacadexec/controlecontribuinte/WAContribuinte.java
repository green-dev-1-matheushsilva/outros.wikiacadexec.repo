package br.gov.sp.fatec.MC.wikiacad.wikiacadexec.controlecontribuinte;




import br.gov.sp.fatec.MC.wikiacad.wikiacadexec.infos.WAMensagens;




/**
	* Created by matheusaiff on 10/11/16.
	*/
public final class WAContribuinte {
		
		
		
		
		private String IDU__CONTRIBUINTE = null;
		
		
		private String nome_contribuinte = null;
		
		
		private String data_nascimento = null;
		
		
		private String sexo = null;
		
		
		private String e_mail_comunicacao = null;
		
		
		private String breve_descricao = null;
		
		
		private String perfil_apresentacao = null;
		
		
		private String perfil_gostos_preferencia = null;
		
		
		private short qtd_de_publicacoes = 0;
		
		
		private String publicacoes_curtidas = null;
		
		
		private String publicacoes_comentadas = null;
		
		
		private String avisos_adver_administrador = null;
		
		
		private String diretorio_util = null;

		
		
		
		public final void especificar__IDU_CONTRIBUINTE( final String valor__IDU_CONTRIBUINTE ){
				
				
				if( valor__IDU_CONTRIBUINTE != null && valor__IDU_CONTRIBUINTE.length() == 8 ) {
						this.IDU__CONTRIBUINTE = valor__IDU_CONTRIBUINTE;
				}
				
				return;
		}
		
		public final String retornar__IDU_CONTRIBUINTE( ){
				
				if( this.IDU__CONTRIBUINTE != null && this.IDU__CONTRIBUINTE.length() == 8 ){
				
						return this.IDU__CONTRIBUINTE;
				
				}else{
				
						return new String("DESCONHECIDO");
				
				}
		}
		
		public final void especificar__nome_contribuinte( final String valor__nome_contribuinte ){
				
				
				if( valor__nome_contribuinte != null && valor__nome_contribuinte.length() <= 48
						&& valor__nome_contribuinte.length()  > 7) {
						this.nome_contribuinte = valor__nome_contribuinte;
				}
				
				return;
		}
		
		public final String retornar__nome_contribuinte( ){
				
				if( this.nome_contribuinte != null && this.nome_contribuinte.length() > 7 ){
						
						return this.nome_contribuinte;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__data_nascimento( final String valor__data_nascimento ){
				
				
				if( valor__data_nascimento != null && valor__data_nascimento.length() == 10 ) {
						this.data_nascimento = valor__data_nascimento;
				}
				return;
		}
		
		public final String retornar__data_nascimento( ){
				
				if( this.data_nascimento != null && this.data_nascimento.length() == 10 ){
						
						return this.data_nascimento;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__sexo( final String valor__sexo ){
				
				if( (valor__sexo != null && valor__sexo.length() <= 9)
					&& (valor__sexo.length() >= 8) ) {
						this.sexo = valor__sexo;
				}
				return;
		}
		
		public final String retornar__sexo( ){
				
				if( this.sexo != null && this.sexo.length() >= 8 ){
						
						return this.sexo;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__e_mail_comunicacao( final String valor__e_mail_comunicacao ){
				
				
				if(valor__e_mail_comunicacao != null && valor__e_mail_comunicacao.length() <= 48
						&& valor__e_mail_comunicacao.length() > 5 && valor__e_mail_comunicacao.contains( "@" )) {
						this.e_mail_comunicacao = valor__e_mail_comunicacao;
				}
				return;
		}
		
		public final String retornar__e_mail_comunicacao( ){
				
				if( this.e_mail_comunicacao != null && this.e_mail_comunicacao.length() > 5
							&& this.e_mail_comunicacao.contains( "@" )
						){
						
						return this.e_mail_comunicacao;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__breve_descricao( final String valor__breve_descricao ){
				
				
				if(valor__breve_descricao != null && valor__breve_descricao.length() <= 160
						&& valor__breve_descricao.length() > 11) {
						this.breve_descricao = valor__breve_descricao;
				}
				return;
		}
		
		public final String retornar__breve_descricao( ){
				
				if( this.breve_descricao != null && this.breve_descricao.length() > 11 ){
						
						return this.breve_descricao;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__perfil_apresentacao( final String valor__perfil_apresentacao ){
				
				
				if(valor__perfil_apresentacao != null && valor__perfil_apresentacao.length() <= 1655
						&& valor__perfil_apresentacao.length() > 23 ) {
						this.perfil_apresentacao = valor__perfil_apresentacao;
				}
				return;
		}
		
		public final String retornar__perfil_apresentacao( ){
				
				if( this.perfil_apresentacao != null && this.perfil_apresentacao.length() > 23 ){
						
						return this.perfil_apresentacao;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__perfil_gostos_preferencia( final String valor__perfil_gostos_preferencia ){
				
				if(valor__perfil_gostos_preferencia != null && valor__perfil_gostos_preferencia.length() <= 128
						&& valor__perfil_gostos_preferencia.length() > 11 ) {
						this.perfil_gostos_preferencia = valor__perfil_gostos_preferencia;
				}
				
				return;
		}
		
		public final String retornar__perfil_gostos_preferencia( ){
				
				if( this.perfil_gostos_preferencia != null && this.perfil_gostos_preferencia.length() > 11 ){
						
						return this.e_mail_comunicacao;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__qtd_de_publicacoes( final short valor__qtd_de_publicacoes ){
				
				if( valor__qtd_de_publicacoes >= 0 ) {
						this.qtd_de_publicacoes = valor__qtd_de_publicacoes;
				}
				return;
		}
		
		public final short retornar__qtd_de_publicacoes( ){
	
						
						return this.qtd_de_publicacoes;
		
		}
		
		public final void especificar__publicacoes_curtidas( final String valor__publicacoes_curtidas ){
				
						this.publicacoes_curtidas = valor__publicacoes_curtidas;
				
				return;
		}
		
		public final String retornar__publicacoes_curtidas( ){
				
				if( this.publicacoes_curtidas != null && this.publicacoes_curtidas.length() > 5 ){
						
						return this.publicacoes_curtidas;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__publicacoes_comentadas( final String valor__publicacoes_comentadas ){
				
				this.publicacoes_comentadas = valor__publicacoes_comentadas;
				
				return;
		}
		
		public final String retornar__publicacoes_comentadas( ){
				
				if( this.publicacoes_comentadas != null && this.publicacoes_comentadas.length() > 5 ){
						
						return this.publicacoes_comentadas;
						
				}else{
						
						return new String("DESCONHECIDO");
						
				}
		}
		
		public final void especificar__avisos_adver_administrador( final String valor__avisos_adver_administrador ){
				
				this.avisos_adver_administrador = valor__avisos_adver_administrador;
				
				return;
		}
		
		public final String retornar__avisos_adver_administrador( ){
				
				if( this.avisos_adver_administrador != null && this.avisos_adver_administrador.length() > 5 ){
						
						return this.avisos_adver_administrador;
						
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
				
			final String	in_IDU__CONTRIBUINTE,
			final String in_nome_contribuinte,
			final String in_data_nascimento,
			final String in_sexo,
			final String in_e_mail_comunicacao,
			final String in_breve_descricao,
			final String in_perfil_apresentacao,
			final String in_perfil_gostos_preferencia,
			final short 	in_qtd_de_publicacoes,
			final String in_publicacoes_curtidas,
			final String in_publicacoes_comentadas,
			final String in_avisos_adver_administrador,
			final String in_diretorio_util
				
		) {
				
				
				try {
						
						this.especificar__IDU_CONTRIBUINTE( in_IDU__CONTRIBUINTE );
						this.especificar__nome_contribuinte( in_nome_contribuinte );
						this.especificar__data_nascimento( in_data_nascimento );
						this.especificar__sexo( in_sexo );
						this.especificar__e_mail_comunicacao( in_e_mail_comunicacao );
						this.especificar__breve_descricao( in_breve_descricao );
						this.especificar__perfil_apresentacao( in_perfil_apresentacao );
						this.especificar__perfil_gostos_preferencia( in_perfil_gostos_preferencia );
						this.especificar__qtd_de_publicacoes( in_qtd_de_publicacoes );
						this.especificar__publicacoes_curtidas( in_publicacoes_curtidas );
						this.especificar__publicacoes_comentadas( in_publicacoes_comentadas );
						this.especificar__avisos_adver_administrador( in_avisos_adver_administrador );
						this.especificar__diretorio_util( in_diretorio_util );
						
				} catch( Exception excessao ) {
						
						WAMensagens.de_excecao( excessao.getMessage() );
				
				}
				
				
				return;
		}
		
		
		WAContribuinte(
				
				final String	cin_IDU__CONTRIBUINTE,
				final String cin_nome_contribuinte,
				final String cin_data_nascimento,
				final String cin_sexo,
				final String cin_e_mail_comunicacao,
				final String cin_breve_descricao,
				final String cin_perfil_apresentacao,
				final String cin_perfil_gostos_preferencia,
				final short 	cin_qtd_de_publicacoes,
				final String cin_publicacoes_curtidas,
				final String cin_publicacoes_comentadas,
				final String cin_avisos_adver_administrador,
				final String cin_diretorio_util
				
				
		){
				
				
		this.construir(
				
				cin_IDU__CONTRIBUINTE,
				cin_nome_contribuinte,
				cin_data_nascimento,
				cin_sexo,
				cin_e_mail_comunicacao,
				cin_breve_descricao,
				cin_perfil_apresentacao,
				cin_perfil_gostos_preferencia,
				cin_qtd_de_publicacoes,
				cin_publicacoes_curtidas,
				cin_publicacoes_comentadas,
				cin_avisos_adver_administrador,
				cin_diretorio_util
		
		);
		
		
		}
		
		
}
