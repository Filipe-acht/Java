package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		// o put tanto adiciona, quanto substitui caso exista
		/*usuarios.put(1, "Roberto");
		System.out.println(usuarios);
		usuarios.put(1, "Ricardo");		
		System.out.println(usuarios);*/
		
		usuarios.put(1, "Roberto");
		usuarios.put(20, "Ricardo");
		usuarios.put(3, "Lily");
		
		System.out.println("Tamanho " + usuarios.size());
		System.out.println("Vazio? " + usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); //retorna todas as chaves
		System.out.println(usuarios.values()); //retorna só os valores
		System.out.println(usuarios.entrySet()); //retorna chave e valor
		
		System.out.println(usuarios.containsKey(20)); //contém a chave tal
		System.out.println(usuarios.containsValue("Lily")); //contém valor tal
		
		System.out.println(usuarios.get(3));// encontrar o valor através da chave
		System.out.println(usuarios.remove(1)); //remover elemento pela chave
		System.out.println(usuarios.remove(4, "Gui")); // removendo a partir da chave e valor
		
		// percorrendo somente as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// percorrendo somente os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		// percorrendo os dois ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
	}

}
