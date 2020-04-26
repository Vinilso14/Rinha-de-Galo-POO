package relacionamentoDeClasses;

public class Main {

	public static void main(String[] args) {
		Lutador galo[] = new Lutador[2];
				
		galo [0] = new Lutador("Jaime", "O Fenomeno", "Otofume ", "Japão", 3, 0.30, 3.4, 8, 1, 2);
		
		galo [1] = new Lutador("Foguete", "A estrela", "Sadia ", "Brasil", 4, 0.27, 3.2, 6, 1, 1);
		
		galo [0].apresentar();
		galo [1].apresentar();
	}

}
