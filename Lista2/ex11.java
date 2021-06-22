class ex11 {
  public static void main(String[] args) {
    int primeiro = 2;
    int segundo = 5;
    boolean resultado = divisor(primeiro, segundo);
    if (resultado) {
      System.out.println("O segundo e divisor!");
    } else {
      System.out.println("O segundo nao e divisor!");
    }
    // System.out.println(resultado);
  }

  static boolean divisor(int primeiro, int segundo) {
    // int dividendo = 25;
    // int divisor = 5;
    // int conta = dividendo / divisor;
    int resto = segundo % primeiro;

    if (resto == 0) {
      // System.out.println("true");
      return true;
    } else {
      // System.out.println("false");
      return false;
    }
  }
  // não consigo resolver pois bulean nao converte para int.
}
