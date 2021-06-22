class ex8 {
  public static void main(String[] args) {
    // int data1 = 19062021;
    // int data2 = 18062021;
    // int data3 = 17062021;

	int pri_dia = 21;
	int seg_dia = 20;
	int pri_mes = 03;
	int seg_mes = 03;
	int pri_ano = 2021;
	int seg_ano = 2021;

    // int resultado = data(data1, data2, data3);
    // int resultado = maior_data(data1, data2, data3);
	// 0 para a primeira e qualquer outra coisa para a segunda.
	int resultado = maior_data( pri_dia,  seg_dia,  pri_mes,  seg_mes,  pri_ano,  seg_ano);
	if (resultado  == 0){
		System.out.println(" A primeida data e a maior!");
	} else if (resultado == 1){
		System.out.println(" A segunda data e a maior!");
	} else {
		System.out.println("Datas iguais!");
	}
  }

  static int maior_data(int pri_dia, int seg_dia, int pri_mes, int seg_mes, int pri_ano, int seg_ano) {
	  if (pri_ano > seg_ano){
		  return 0;
	  } else if (seg_ano > pri_ano){
		  return 1;
	  } else if (pri_mes > seg_mes){
		  return 0;
	  } else if (seg_mes > pri_mes){
		  return 1;
	  } else if (pri_dia > seg_dia){
		  return 0;
	  } else if (seg_dia > pri_dia){
		  return 1;
	  } else{
		  return 2;
	  }
    // if (data1 > data2 && data1 > data3) {
    //   return data1;

    // } else if (data2 > data1 && data2 > data3) {
    //   return data2;

    // } else {
    //   return data3;
    // }
  }
}
  // ERRADO!
// 01012020 || 02011020
