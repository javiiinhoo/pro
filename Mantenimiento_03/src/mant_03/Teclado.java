package mant_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado{
	String leerString() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s= br.readLine();
		return(s);
	}
	int leerInt() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int i;
		String s= br.readLine();
		try {
			i=Integer.parseInt(s);
		}catch(NumberFormatException nfe) {
			i=Integer.MIN_VALUE;
		}
		return(i);
	}
	float leerFloat() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		float f;
		String s= br.readLine();
		try {
			f=Float.parseFloat(s);
		}catch(NumberFormatException nfe) {
			f=Float.MIN_VALUE;
		}
		return(f);
	}
	double leerDouble() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		double d;
		String s= br.readLine();
		try {
			d=Double.parseDouble(s);
		}catch(NumberFormatException nfe) {
			d=Double.MIN_VALUE;
		}
		return(d);
	}
	char leerChar() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		char c;
		String s;
		s= br.readLine();
		c=s.charAt(0);
		return c;
	}
	void leerSalto() throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		br.readLine();			
	}
}

