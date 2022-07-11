package classe;

public class Equals {

    public static void main(String[] args) {
        
        Usuario u1 = new Usuario();
        u1.nome  = "Filipe Soares";
        u1.email = "filipe.soares@essemail.com";

        Usuario u2 = new Usuario();
        u2.nome  = "Filipe Soares";
        u2.email = "filipe.soares@essemail.com";

        
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }

}
