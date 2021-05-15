class ex8r {
  public static void main(String[] args) {
    // Delta > 0
    int a = 1;
    int b = -1;
    int c = -12;

    // Link para consulta: https://brasilescola.uol.com.br/matematica/raiz-uma-equacao-2-grau.htm
    // >>>>>> AINDA NAO DÁ PRA FAZER CERTO <<<<<<<<<<
    // // Delta < 0
    // int a = 1;
    // int b = -4;
    // int c = 5;

    // // Delta = 0
    // int a = 1;
    // int b = -4;
    // int c = 1;

    double bhaskara = Math.pow(b,2) - 4*a*c;
    // System.out.printf("B: %2f", bhaskara);
    double x1 = (-b + Math.sqrt(bhaskara))/(2*a);
    double x2 = (-b - Math.sqrt(bhaskara))/(2*a);

    // SYSOUT.PRINF: para evitar de usar concatenação com +
    // Verificar: https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
    System.out.printf("As raizes são: %2f %2f \n", x1, x2);
    // System.out.println("As raizes são: "+ x1+" "+x2);

  }
}
