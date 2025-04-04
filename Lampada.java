public class Lampada {
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Lampada() {
	}
	public Lampada(boolean status) {
		this.status = status;
	}
	public void ligar() {
		status = true;
	}
	public void desligar() {
		status = false;
	}
	public void observar() {
		if(status)	
			System.out.println("Ligado");
		else
			System.out.println("Desligado");
	}
}
