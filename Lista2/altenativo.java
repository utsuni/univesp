class alternativo {
  public static void main(String[] args) {
	// TAREFA EXTRA: Fazer entrada do usario ser pelo terminal usando o Scanner.
    // boolean opcaoNormal = true;
    boolean opcaoNormal = false;
    double numeroHoras = 22;
    double valorHora = 20.5;

    System.out.printf("O valor a pagar é de: %2f\n", valorPagar(opcaoNormal, numeroHoras, valorHora));
  }

  static double valorPagar(boolean normal, double horas, double valorAula) {
	// System.out.println("var normal "+ normal);
    if (normal) {
	  // System.out.printf("Entrou errado!\n");
      return horas * valorAula;
    } else {
	  // System.out.printf("Resultado 1: %2f\n", ((100.0 / 100.0) - (7.0 / 100.0)));
      return horas * valorAula * ((100.0 / 100.0) - (7.0 / 100.0));
    }
  }
}
//     double horas = 22.0;
//     double valorH = 20.5;
//     double desconto = 7.0;
//     double ter = antecipado(horas, valorH, "desconto");

//     if (horas < 1000)
//       System.out.println("o valor do desconto e" + ter);
//     else
//       System.out.println(" o valor apagar e " + desconto);
//   }

//   static double antecipado(double horas, double valorH, double desconto) {
//     double prim;
//     double segun;
//     double ter;

//     prim = horas * valorH;
//     segun = (prim * desconto) / 100.0;
//     // return (horas * valorH) - ((horas * valorH * desconto) / 100.0);
//     ter = prim - segun;
//     return (double) ter;
//   }
// }
