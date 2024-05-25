package apps;
public abstract class ServicoMensagem{
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	protected abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}