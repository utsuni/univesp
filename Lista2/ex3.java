class ex3 {
  public static void main(String[] args) {
    int valor = 11;
    boolean valor2 = valor < 4 || valor > 10;

    // Outra forma de usar o condicional
    // if(valor < 4 || valor > 10)
    if (valor2)
      System.out.println(" FORA ");
    else
      System.out.println(" Dentro ");
  }
}
