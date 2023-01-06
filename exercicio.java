package POO;

public class exercicio {
	//declaração dos atributos da classe
		private String nomeProprietario;
		private String modelo;
		private String placa;
		private int ano;
		
		//declarar o método construtor
		public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
			this.nomeProprietario = nomeProprietario;
			this.modelo = modelo;
			this.placa = placa;
			this.ano = ano;
		}

		public Automovel() {
			super();
		}

		//declaração dos demais métodos (get/set)
		public String getNomeProprietario() {
			return nomeProprietario;
		}

		public void setNomeProprietario(String nomeProprietario) {
			this.nomeProprietario = nomeProprietario;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}
		
		
		public void imprimirInfo() {
			
			System.out.println("\nNome: "+nomeProprietario+" possui um automóvel "+modelo+" com placa: "+placa+" e ano: "+ano);
		}

			
		
		
		
		
		

	}

public static void main(String[] args) {
	
	
	//instanciando um objeto da classe Automóvel
	Automovel auto = new Automovel("Leonardo Assis","Skyline","JDK8A89",1995);
	auto.imprimirInfo();
	
	System.out.println("\n***Transferência de Proprietarie");
	auto.setNomeProprietario("Tânia Andrade");
	auto.imprimirInfo();
	
	System.out.println("\nAlteração da placa do Automóvel");
	auto.setPlaca("TYJ0067");
	auto.imprimirInfo();
}

}


}
