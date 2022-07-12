package oo.abstrato;

public abstract class Animal {

	 public String respirar() {
		 return "Usando CO2";
	 }
	 
	 // difinindo o metodo como abstrato, não precisa necessariamente definir um corpo para ele.
	 // mas só é possivel ter um metodo abstrato numa classe abstrata
	 public abstract String mover();
}
