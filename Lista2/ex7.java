class ex7{
	public static void main(String[] args) {
    double celsius = 8;
    double resultado = temperatura(celsius);

    System.out.println(" A Temperatura em Fahrenheit e: " +resultado);


	}

	static double temperatura (double celsius ) {
		double f;
		 f = celsius * 1.8 + 32;
		 return f; 
		 
}
}