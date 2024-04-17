public class caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("modelo" + this.modelo);
        System.out.println("uma caneta" + this.cor);
        System.out.println("ponta" + this.ponta);
        System.out.println("carga" + this.carga);
        System.out.println("está tampada?" + this.tampada);

    }

    void rabiscar (){
        if (tampada == true) {
            System.out.println("erro");
        }else{
            System.out.println("estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;

    }
    void destampar(){
        this.tampada = false;

    }
}
