package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo

//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

//		PrintStream ps = new PrintStream(new File("lorem2.txt"));

		PrintWriter ps = new PrintWriter(new File("lorem2.txt", "UTF-8"));
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("asfasdfsafdas dfs sdf asf assd?");

		ps.close();
		
		
		
	}
}
