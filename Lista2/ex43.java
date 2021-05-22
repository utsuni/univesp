class ex43{

	public static Void main(String[] args) {

		Double horas = 22.0;
		Double valorH = 20.5;
		Double desconto = 7.0;
		Double ter = Antecipado(horas, valorH, desconto);


		if ( horas < 1000)
			System.out.println("o valor do desconto e" +ter);
		else System.out.println(" o valor apagar e " +desconto);

	}

	static Double Antecipado(Double horas, Double valorH, Double desconto) { 

		Double prim;
		Double segun; 
		Double ter; 

		prim = horas*valorH;
		segun = (prim * desconto)/100;
		ter = prim - segun; 
		return (Double) ter; 

	}
}