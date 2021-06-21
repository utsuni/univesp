	class ex5 {
		public static void main(String[] args) {

	//boolean precoNormla= false;
			double preco2vezes= 10/100;
	//boolean preco3vezes= false;
			double  valorCompra = 225.5;
			double resultado = total(preco2vezes, valorCompra);

			System.out.println(" O valor a pagar e: " +resultado);
		}

		static double total(double preco2vezes,  double valorCompra) {
			double a ;
			double b ;
			a = valorCompra * ((100.0 / 100.0) + (10.0 / 100.0));
			return a;

	//if (precoNormla){
	//	return valorCompra;
	//} else {
	//return (int) valorCompra * ((100.0 / 100.0) - (10.0 / 100.0));
	//return valorCompra * ((100.0 / 100.0) - (20.0 / 100.0));

		}
	}	
