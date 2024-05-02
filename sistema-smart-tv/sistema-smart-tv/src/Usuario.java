public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        System.out.println("----------------------------------");
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("----------------------------------");

        smartTv.ligar();
        smartTv.diminuirVolume();
        smartTv.selecionarCanal(13);
        System.out.println("----------------------------------");
        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);
        System.out.println("----------------------------------");
    }
}
