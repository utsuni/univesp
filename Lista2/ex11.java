	class ex11{
		public static void main(String[] args) {

			boolean resultado = divisor();
			System.out.println(resultado);

		}
		static int divisor() {
			int dividendo = 25;
			int divisor = 5;
			int conta = dividendo / divisor ;

			if (conta){
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
	// não consigo resolver pois bulean nao converte para int. 
	}