public class App {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.status();
        c1.destampar();
        c1.rabiscar();

        caneta c2 = new caneta();
        c1.cor = "vermelha";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.status();
        c1.tampar();
        c1.rabiscar();

        
    }
}
