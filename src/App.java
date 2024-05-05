import App.Cliente;
import App.Servico;
import App.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String nome = "tiago";
        System.out.println(nome);

        Servico barba = new Servico(1 , "barba",  30);
        System.out.println(Servico.getValor());

        Cliente cliente = new Cliente(1, "thiago", "M", "464646464464", "rua jabá");
        System.out.println(cliente.getNome());
         Usuario usuario = new Usuario(1, "Eduardo", "fff" );
        System.out.println( usuario.getNome());

    
    
    
    
    }
    

}
