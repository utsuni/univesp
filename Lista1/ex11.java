class ex11{
     
     static int a,b,c;
     
     static void P(int x, int y) {
      a = x+y+a; 
     System.out.println(x+" "+y+" "+a);
}                       

    public static void main(String[] args) {
    a = 5;                          
    b = 8;                       
    c = 3;                       
      
      // A = 18      //B = 8    //C = 3
      // A = 54
      // A = 492

    P(a,b); //(5,8) 
     //a = x+y+a; (A = 5 + 8 + 5 = 18 )
     //println(5+" "+8+" "+18)
                     
    P(7,a+b+c); // (7,18 + 8 + 3) = 29
           //a = x+y+a; (a = 7 + 29 + 18 = 54 )
         // println(7+" "+29+" "+54);  

    P(a*b,a%b); //(54*8,54%8) 
     //a = x+y+a; (a = 432 + 6 + 54 = 492 )
     //println(432+" "+6+" "+492)
    }
}


