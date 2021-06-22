class ex6 {
  public static void main(String[] args) {
    int a = 22;
    int b = 33;
    int c = 70;
    int resultado = valores(a, b, c);

    System.out.println(" O maior numero e: " + resultado);
  }

  static int valores(int a, int b, int c) {
    if (a > b && a > c) {
      return a;

    } else if (b > a && b > c) {
      return b;

    } else {
      return c;
    }
  }
}
// OK
