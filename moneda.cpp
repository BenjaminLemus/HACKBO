#include<stdio.h>  
int main(){    int N, coin, John, Mary;    int i;  
   while( 1 ){       scanf( "%d", &N );       if( N==0 )          break;       John = Mary = 0;       for( i=0; i<N; i++ ){          scanf( "%d", &coin );          if( coin==1 )             John++;          else             Mary++;       }       printf( "Mary won %d times and John won %d times\n", Mary, John);    }    return 0; } 
