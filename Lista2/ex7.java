class ex7 {
  public static void main(String[] args) {
    // double celsius = 8;
    double temperatura = 10;
    int opcao = 1; // 0 - retorna em Celsius; 1 - retorna em Fahrenheit
    double resultado = converte_temperatura(opcao, temperatura);

    if (opcao == 0) {
      System.out.println(" A Temperatura em Celsius e: " + resultado);
    } else {
      System.out.println(" A Temperatura em Fahrenheit e: " + resultado);
    }
  }

  static double converte_temperatura(int opcao, double temperatura) {
    // double f;
    // f = celsius * 1.8 + 32;
    // return f;
    if (opcao == 0) {
      return (5.0 / 9.0) * (temperatura - 32);
    } else {
      return (9.0 / 5.0) * temperatura + 32;
    }
  }
}
// ERRADO!
