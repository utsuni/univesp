class ex10 {
  public static void main(String[] args) {
    double velocidade = 200;
    double resultado = velocidade(velocidade);

    System.out.println(resultado);
  }
  static double velocidade(double velocidade) {
    if (velocidade <= 61) {
      System.out.println("A tempestade nao e classificada como um furacao");
    } else if (velocidade >= 62 && velocidade <= 118) {
      System.out.println("A tempestade e classificada como tempestade tropical");
    } else if (velocidade >= 119 && velocidade <= 153) {
      System.out.println("A tempestade e classificada como um furacao de categoria 1");
    } else if (velocidade >= 154 && velocidade <= 177) {
      System.out.println("A tempestade e classificada como um furacao de categoria 2");
    } else if (velocidade >= 178 && velocidade <= 209) {
      System.out.println("A tempestade e classificada como um furacao de categoria 3");
    } else if (velocidade >= 210 && velocidade <= 249) {
      System.out.println("A tempestade e classificada como um furacao de categoria 4");
    } else if (velocidade > 249) {
      System.out.println("A tempestade e classificada como um furacao de categoria 5");
    }
    return 1;
  }
}
// OK
