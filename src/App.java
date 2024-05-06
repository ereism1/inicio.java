import App.Agendamento;
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

        Cliente cliente = new Cliente(1, "gerosvaldo", "jfoejfej", "fffff");
        System.out.println(cliente.getNome());
        Usuario usuario = new Usuario(1 , "Eduardo" , "senha");
        System.out.println( usuario.getNome());

        

        Agendamento agendamento = new Agendamento(1, cliente, barba, 30, "09/05/1996 08:15");
        System.out.println(agendamento.getCliente().getNome());
    
    
    
    }
    

}
