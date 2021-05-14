class ex5{
	
	public static void main(String[] argns){
      
      int a = 3;
      int b = 5;
      int c = 8;
      int d = a * (b + c * 3) - 7;
      int e = a - b - c;

      System.out.println(a+" "+b+" "+c+" "+d+" "+e);
      a = a + 1;
      b = (4 * a + 1) / 10; // O resultado saira inteiro, pois não foi ultilizado o metado double
      c = (4 * a + 1) % 10; // mostrara o resto 
      System.out.println(a+" "+b+" "+c+" "+d+" "+e);
      

	}
}



