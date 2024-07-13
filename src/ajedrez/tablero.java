package ajedrez;
import java.math.*;
/**
 *
 * @author pc
 */
public class tablero {
    
    public String pintarPosiciones(){
        String s=                    ("a8   b8  c8  d8  e8  f8  g8  h8\n"
                                     + "a7  b7  c7  d7  e7  f7  g7  h7\n"
                                     + "a6  b6  c6  d6  e6  f6  g6  h6\n"
                                     + "a5  b5  c5  d5  e5  f5  g5  h5\n"
                                     + "a4  b4  c4  d4  e4  f4  g4  h4\n"
                                     + "a3  b3  c3  d3  e3  f3  g3  h3\n"
                                     + "a2  b2  c2  d2  e2  f2  g2  h2\n"
                                     + "a1  b1  c1  d1  e1  f1  g1  h1\n" );
        
        return s;
    }
    public String pintartablero(int n){
            String s="";
            switch (n) 
        {
            case 1: s=("X  X   X  X  X  X  RN X\n"
                                     + "PN X   PN X  X  TN PN  PN\n"
                                     + "X  RnN  X  X  X  X  X   X\n"
                                     + "X  X   PN X  X  X  X   X\n"
                                     + "X  X   X  X  PB X  X   X\n"
                                     + "PB RnB X  X  X  X  X   X\n"
                                     + "X  PB  X  X  X  PB PB  X\n"
                                     + "X  X   X  TB X  X  RB  X\n" );
                     break;
            case 2:  s=("TN CN AN X  X  X  X  RN\n"
                                      + "PN X  X  X  X  X  PN PN\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  CB X  X  X\n"
                                      + "X  AB X  X  X  X  X  X\n"
                                      + "PB PB PB X  X  X  X  X\n"
                                      + "X  X  RB X  X  X  X  TB\n" );
                     break;
            case 3:  s=("X  X  X   X  X  X   TN  X\n"
                                      + "X  X RnB  X  X  AB  X  X\n"
                                      + "X  X  X   X  X  RN  X   X\n"
                                      + "X  X  X   X  X  AB  X   X\n"
                                      + "X  X  X   X  X  RB  X   X\n"
                                      + "X  X  X   X  X  X   X   X\n"
                                      + "X  X  X   X  X  X   X   X\n"
                                      + "X  X  X   X  X  X   X   X\n" );
                     break;
            case 4:  s=("X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  PN RN PB X  X\n"
                                      + "X  X  X  X  PN X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  RB X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  TB X X\n" );
                     break;
            case 5:  s=("X  X   X  CB CN  TN X  X\n"
                                      + "TB X   X  PB RN  PB X  X\n"
                                      + "X  X   X  X  PN  X  X  X\n"
                                      + "X  X   X  X  X   X  X  X\n"
                                      + "X  X   X  X  X   X  X  X\n"
                                      + "X  X   X  X  RB  X  X  X\n"
                                      + "X  X   X  X  X   X  X  X\n"
                                      + "X  X   X  TB X   X  X  X\n" );
                     break;
            case 6:  s=("X   X  RN TN X  X  X  X\n"
                                      + "X   X  X  X  X  X  X  X\n"
                                      + "X   X  X  X  X  X  X  X\n"
                                      + "X   X  X  X  X  X  X  X\n"
                                      + "RnB X  X  X  X  X  X  X\n"
                                      + "X   X  X  X  X  X  AB X\n"
                                      + "X   X  X  X  X  X  RB X\n"
                                      + "X   X  X  X  X  X  X  X\n" );
                     break;
            case 7:  s=("X  X  X  TN X  X  X  X\n"
                                      + "X  PN RN X  X  X  X  X\n"
                                      + "X  X  X  PN PB X  X  X\n"
                                      + "X  X  CB X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  TB  X  X  X X  X\n"
                                      + "X  X  X  X  X  X  X  RB\n" );
                     break;
            case 8:  s=("X   X  X  X  X  X  X  X\n"
                                      + "X   X  X  X  X  AB X  X\n"
                                      + "X   X  X  X  PN X  X  X\n"
                                      + "X   X  X  X  RN PN X  X\n"
                                      + "X   X  X  CB PN X  X  X\n"
                                      + "X   X  X  X  X  X  X  X\n"
                                      + "X   X  X  X  PB X  X  X\n"
                                      + "RnB X  X  TB X  X  RB X\n" );
                     break;
            case 9:  s=("X X  X  X X TN RN X\n"
                                      + "X X  X  X X X  X  X\n"
                                      + "X X  X  X X X  X  PB\n"
                                      + "X X  X  X X X  CB X\n"
                                      + "X X  X  X X X  X  X\n"
                                      + "X X  X  X X X  X  X\n"
                                      + "X AB X  X X X  X  X\n"
                                      + "X X  RB X X X  X  X\n" );
                     break; 
            case 10: s=("X  X  RN TN X  X  X  X\n"
                                      + "X  X  PN X  X  X  TB X\n"
                                      + "X  X  X  PB X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  X  X  X  X  X  X  X\n"
                                      + "X  TB X  X  X  X  RB X\n" );
                     break;
           
   }
   return s;        
  }
    
}
        
        
        
    

