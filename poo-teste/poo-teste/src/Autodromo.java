public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1234567");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("7654321");
        //z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}
