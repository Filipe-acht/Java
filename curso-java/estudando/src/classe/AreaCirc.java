package classe;

public class AreaCirc {
    
    /* atributos */
    double raio;
    //double pi;
    static final double PI = 3.14; // final - modificardor para definir uma constante
    //final static double PI = 3.14;

    /* construtor */
    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    /* método que calcula circunferência */
    double area(){
        return PI * Math.pow(raio, 2);
        //return pi * raio * raio;
    }
    
    // método estático
    static double  area(double raio) {
    	return PI * Math.pow(raio, 2);
    }    
}
