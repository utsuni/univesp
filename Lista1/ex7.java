class ex7{
	public static void main(String[] args){
		
	double alturai = 5; 
	double altura = 0; 
	double gravidade = 10;
	double tempo; 
	
	tempo = Math.sqrt((2*(altura - alturai)) / -gravidade);
	tempo = (int) (tempo * 100);
	tempo = (double) (tempo / 100);
	System.out.println(tempo);

	}
}
		
