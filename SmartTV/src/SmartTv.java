public class SmartTv {
    
    boolean ligada = true;
    int canalAtual = 1;
    int volume = 10;

    public void aumentaVolume() {

        volume++;

    }
    
    public void diminuiVolume() {

        volume--;

    }
    
    public void passaCanal() {

        canalAtual++;
    }
    
    public void voltaCanal() {

        canalAtual--;

    }
    
    public void mudaCanal(int novoCanal) {
        
        canalAtual = novoCanal;
    }
}

