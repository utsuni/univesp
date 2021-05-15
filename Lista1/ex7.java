class ex7 {
  public static void main(String[] args) {
    double alturai = 5;
    double altura = 0;
    double gravidade = 10;
    double tempo;

    tempo = Math.sqrt((2 * (altura - alturai)) / -gravidade);
    tempo = (int) (tempo * 100);
    tempo = (double) (tempo / 100);
    System.out.println(tempo);
  }
}
// entendi mais ou menos.
// idade anos > 21;24;20;50;55
// int 0-122
// dinheiro reais/cent >
// Aline > float
// Bia > double
// Float          1000000
// Double 100000000000000
// https://tableless.com.br/java-tipos-de-dados/
// 1 byte = 8 bits = 00000000 = 256 números
// Classe Math: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
