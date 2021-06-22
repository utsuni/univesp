class ex5 {
  public static void main(String[] args) {
    // boolean precoNormla= false;
    // double preco2vezes = 10 / 100;
    // boolean preco3vezes= false;
    int opcao = 3;
    double valorCompra = 10.0;
    double resultado = valor_eletrodomestico(opcao, valorCompra);

    System.out.println(" O valor a pagar e: " + resultado);
  }

  static double valor_eletrodomestico(int opcao, double valorCompra) {
    // double a;
    // double b;
    // a = valorCompra * ((100.0 / 100.0) + (10.0 / 100.0));
    if (opcao == 2) {
      return valorCompra * 1.1;
    } else if (opcao == 3) {
      return valorCompra * 1.2;
    } else {
      return valorCompra;
    }
    // return a;

    // if (precoNormla){
    //	return valorCompra;
    //} else {
    // return (int) valorCompra * ((100.0 / 100.0) - (10.0 / 100.0));
    // return valorCompra * ((100.0 / 100.0) - (20.0 / 100.0));
  }
}

// ERRADO!
