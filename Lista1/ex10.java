class ex10 {
  public static void main(String[] argn) {
    int numero = 987; // Resposta: 789

    // Criar função INV(numero): Dado um número inteiro passado para a função,
    // retornar o valor e depois de retornar, exibir na tela

	int prim_digito = 60000;
	int segn_digito = 0;
	int terc_digito = -11111;

	// Testar arredondamento e verificar o que é que
	// vai acontecer

	// Math.floor: pega a divisão inteira pra baixo
	terc_digito = numero % 10;
	int div_inteira = (int) Math.floor(numero / 10);
	segn_digito = div_inteira % 10;
	prim_digito = (int) Math.floor(div_inteira / 10);

	System.out.printf("O inverso é: %d%d%d \n", terc_digito, segn_digito, prim_digito);
    // int d2 = 876;
    // int d3 = 321;
    // System.out.println("O inverso do numero " + d1 + +d2 + +d3 + " e " + d3 + +d2 + +d1);
  }
}
