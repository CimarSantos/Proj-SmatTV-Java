public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        if (!smartTv.ligada) {

            System.out.println("A Tv está desligada");

        } else {

            System.out.println("A Tv está ligada");
            System.out.println("Está no canal " + smartTv.canalAtual);
            System.out.println("Está no volume " + smartTv.volume);
            
        }

        
    }
}
