public class UsaLampada {

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada();
		lampada1.setStatus(true);
		lampada1.observar();
		
		Lampada lampada2 = new Lampada(true);
		lampada2.observar();
		lampada2.desligar();
		lampada2.observar();
	}
}
