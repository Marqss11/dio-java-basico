package apps;
public class FacebookMessenger extends ServicoMensagem{
    
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

	protected void salvarHistoricoMensagem(){
	}
}
