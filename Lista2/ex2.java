class ex2 {
  public static void main(String[] args) {
    int c = -1;
    int a = 5;
    int b = 2;

    // Outra forma de fazer o condicional
    // if (a > 0 && a < b) {
    if (0 < a && a < b) {
      c = 0;
    }
    System.out.printf("O valor de c é: %d\n", c);
  }
}
