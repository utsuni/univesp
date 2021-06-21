class ex8{
	public static void main(String[] args) {
		int data1 = 19062021;
		int data2 = 18062021;
		int data3 = 17062021;
		int resultado = data(data1, data2, data3);

		System.out.println(" O Cronograma e:" +resultado);


	}

	static int data(int data1, int data2, int data3) {
		if (data1 > data2 && data1 > data3) {
			return data1;

		}else if (data2 > data1 && data2 > data3){
			return data2;

		}else {
			return data3;
		}
	}
}