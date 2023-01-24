public Desenvolvedor{
   private String nome;
   private String profissao;
   private String empresa;
   private int idade;

	
   // Um constructor r´pidão apenas para testes
   Desenvolvedor(){
	if(nome != null){
           this.nome = nome;
        }
	if(profissao != null){
           this.profissao = profissao;
        }
	if(empresa != null){
           this.empresa = empresa;
        }
	if(idade != null and idade > 0){
           this.idade = idade;
        }
  }
}