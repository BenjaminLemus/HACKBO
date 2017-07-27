package comp1;
import java.io.*;
import java.math.*;
import java.util.*;
public class love {
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int i,j,q,r,m,n,o,h;
		BigDecimal g;
		double f,d,s;
		String a,b,c;
		a=new String();
		a=" abcdefghijklmnopqrstuvwxyz";
		while(true){
		q=0; 
		r=0;
		b=leer.nextLine();
		c=leer.nextLine();
		b=b.toLowerCase();
		c=c.toLowerCase();
		for(j=0;j<=b.length()-1;j++)
		{
			for(i=0;i<=26;i++)
				{			
					if(a.charAt(i)==b.charAt(j)){
						q=q+(i);
				}
				}
		}
		for(j=0;j<=c.length()-1;j++)
		{
			for(i=0;i<=26;i++)
				{			
					if(a.charAt(i)==c.charAt(j)){
						r=r+(i);
				}
				}
		}
		do{o=0;
		do{
		m=q/10;
		n=q%10;
		o=n+o;
		q=m;}while(q!=0);
		q=o;
	}while(q>=10);

m=0;
n=0;
do{h=0;
do{
m=r/10;
n=r%10;
h=n+h;
r=m;}while(r!=0);
r=h;
}while(r>=10);
if(h==0&&o==0){}
else{
f=h;
d=o;
	if(d>f){
	s=(f/d)*100;
		BigDecimal bd=new BigDecimal(s);
		g=bd.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.println(g+" %");
		System.out.println( System.currentTimeMillis());
	}
	else{
		s=(d/f)*100;
			BigDecimal bd=new BigDecimal(s);
			g=bd.setScale(2,BigDecimal.ROUND_HALF_UP);
			System.out.println(g+" %");
			System.out.println( System.currentTimeMillis());}
}}
	
}}
