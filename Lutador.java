package relacionamentoDeClasses;

public class Lutador {

	// Attributes
	private String nome, alcunha;
	private String granja, nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// Constructor
	public Lutador(String nome, String alcunha, String granja, String nacionalidade, int idade, double altura,
			double peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.alcunha = alcunha;
		this.granja = granja;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	// Get and Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlcunha() {
		return alcunha;
	}

	public void setAlcunha(String alcunha) {
		this.alcunha = alcunha;
	}

	public String getGranja() {
		return granja;
	}

	public void setGranja(String granja) {
		this.granja = granja;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (this.peso < 0.6) {
			this.categoria = "Invalido";
		} else if (this.peso <= 1.2) {
			this.categoria = "Leve";
		} else if (this.peso <= 2.4) {
			this.categoria = "Medio";
		} else if (this.peso <= 3.1) {
			this.categoria = "Pesado";
		} else
			categoria = "Invalido";

	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// Methods

	public void apresentar() {
		System.out.println("----------------------------");
		System.out.println("ladies and gentlemens, CHEGOU A HORA");
		System.out.println("Apresentamos o galo " + this.getNome() + " " + this.alcunha);
		System.out.println("Diretamente da Granja " + this.getGranja() + "Do(a)" + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " Anos " + "E " + this.altura + "m");
		System.out.println("� um peso: " + getCategoria());
                System.out.println("Pesando: " + this.getPeso() + "Kg");
		System.out.println("Com " + this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas e");
		System.out.println(this.getEmpates() + " Empates! ");
	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println("� um peso: " + getCategoria());
		System.out.println(this.getVitorias() + "Vitorias");
		System.out.println(this.getDerrotas() + "Derrotas");
		System.out.println(this.getEmpates() + "Empates");
	}

	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

}
