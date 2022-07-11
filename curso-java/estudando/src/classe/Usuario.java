package classe;

public class Usuario {

    String nome;
    String email;
    
    // implementando o equals
    public boolean equals(Object objeto) {
    	
    	Usuario outro = (Usuario) objeto;
    	
    	boolean nomeIgual  = outro.nome.equals(this.nome);
    	boolean emailIgual = outro.email.equals(this.email);
    	
    	return nomeIgual && emailIgual;
    }
    
    
    /*public boolean equals(Object objeto) {
    	
    	if( objeto instanceof Usuario) { // verifica se o objeto é um instância do objeto Usuario
    		Usuario outro = (Usuario) objeto; // convertendo um object 
    	
    		return super.equals(objeto);
    	} else {
    		return false;
    	}
    }*/
}  
    
