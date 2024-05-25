import apps.*;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagem sm = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido = "fbm"; 
		
		if(appEscolhido.equals("msn"))
			sm = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			sm = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			sm = new Telegram();
		
			
		sm.enviarMensagem();
		sm.receberMensagem();
	}
}