class ex9{
	public static void main(String[] args) {
		// 3 - milhas; 2 - jardas; 1 - pes; 0 - polegadas
		int opcao = 3;
		double valor = 1;

		System.out.println("O valor em quilometros e: "+ converte_quilometros(valor, opcao));
	}

	static double converte_quilometros(double valor, int tipo_medida) {
		double milimetros = 25.3995;
		if(tipo_medida == 0){
			return milimetros * valor * (1.0/1000000.0);
		} else if (tipo_medida == 1) {
			return 12 * milimetros * valor * (1.0/1000000.0);
		} else if (tipo_medida == 2){
			return 3 * 12 * milimetros * valor * (1.0/1000000.0);
		} else {
			return 1760 * 3 * 12 * milimetros * valor * (1.0/1000000.0);
		}
	}
}
