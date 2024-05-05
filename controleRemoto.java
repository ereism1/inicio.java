package aula06;

public class controleRemoto implements Controlador {
    
        //Atributos
        
        @Override
        public void abrirMenu() {
            // TODO Auto-generated method stub
            System.out.println("está ligado?" + this.getLigado());
            System.out.println("está tocando?" + this.getTocando());
            System.out.println("volume"+ this.getVolume());
            for (int i = 0; i <= this.getVolume();i +=10){System.out.println("[]");}
            
        }
        @Override
        public void desligar() {
            // TODO Auto-generated method stub
            this.setLigado(false);
        }
        @Override
        public void desligarMudo() {
            // TODO Auto-generated method stub
            if (this.getLigado() && this.getVolume() == 0) {
                this.setVolume(50);
            }
        }
        @Override
        public void fecharMenu() {
            // TODO Auto-generated method stub
            System.out.println("fechando menu...");
        }
        @Override
        public void ligar() {
            // TODO Auto-generated method stub
            this.setLigado(true);
        }
        @Override
        public void ligarMudo() {
            // TODO Auto-generated method stub
            if (this.getLigado() && this.getVolume() > 0) {
             this.setVolume(0);   
            }
        }
        @Override
        public void maisVolume() {
            // TODO Auto-generated method stub
            if (this.getLigado()){
                this.setVolume(this.getVolume() + 5);
            }
        }
        @Override
        public void menosVolume() {
            // TODO Auto-generated method stub
            if(this.getLigado()){
                this.setVolume(this.getVolume() - 5);
            }
        }
        @Override
        public void pause() {
            // TODO Auto-generated method stub
            if (this.getLigado() && this.getTocando()) {
                this.setTocando(false);
            }
        }
        @Override
        public void play() {
            // TODO Auto-generated method stub
            if (this.getLigado() && !(this.getTocando())) {
                this.setTocando(true);
            }
        }
        private int volume;
        private boolean ligado;
        private boolean tocando;
        //metodos especiais

        public controleRemoto (){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        }
        public int getVolume() {
            return volume;
        }
        public void setVolume(int volume) {
            this.volume = volume;
        }
        public boolean getLigado(){
            return ligado;
        }
        public void setLigado( boolean ligado){
            this.ligado = ligado;
        }
        public boolean getTocando(){
            return tocando;
        }
        public void setTocando(boolean tocando){
            this.tocando=tocando;
        }
        //metodos abstratos

         





        
    }

