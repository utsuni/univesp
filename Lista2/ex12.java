class ex12 {
  public static void main(String[] args) {
    double num1 = 4;
    double num2 = 5;
    double num3 = 3;
    // double conta = num1 * num2 / 2;
    boolean resultado = verificar_triangulo(num1, num2, num3);
    if (resultado) {
      System.out.println("E triangulo retangulo!");
    } else {
      System.out.println("Nao e triangulo retangulo!");
    }
    // System.out.println(" A verificarcao e: " + resultado);
  }
  static boolean verificar_triangulo(double num1, double num2, double num3) {
    double quad_num1 = Math.pow(num1, 2);
    double quad_num2 = Math.pow(num2, 2);
    double quad_num3 = Math.pow(num3, 2);

    if ((quad_num1 + quad_num2) == quad_num3) {
      return true;
    } else if ((quad_num2 + quad_num3) == quad_num1) {
      return true;
    } else if ((quad_num3 + quad_num1) == quad_num2) {
      return true;
    } else {
      return false;
    }
    // if (conta) {
    //   System.out.println(true);
    // } else {
    //   System.out.println(false);
    // }
    // return 1;
  }
}
