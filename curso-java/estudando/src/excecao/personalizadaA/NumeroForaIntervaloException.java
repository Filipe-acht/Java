package excecao.personalizadaA;

@SuppressWarnings("serial") // para não gerar o serialversioid
public class NumeroForaIntervaloException extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' esta negativo",
				nomeDoAtributo);
	}
}
