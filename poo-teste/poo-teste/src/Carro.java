public class Carro extends Veiculo{
     
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void conferirCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void conferirCambio(){
        System.out.println("Conferindo cambio em P");
    }

}
