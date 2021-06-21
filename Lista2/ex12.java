class ex12{
	public static void main(String[] args) {
		double num1 = 25;
		double num2 = 5;
		double num3 = 10;
		double conta = num1*num2/2;
		double resultado = verificar(num1, num2, num3, conta);

		System.out.println(" A verificarcao e: " +resultado);

	}
	static double verificar(double num1, double num2, double num3, double conta){

		if(conta){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		return 1;
	}
}