package com.tavi.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first longitude");
		double longitA=sc.nextDouble();
		System.out.println("Enter second longitude");
		double longitB=sc.nextDouble();
		
		try {
			Socket socket=new Socket("localhost",4444);
			DataInputStream in=new DataInputStream(socket.getInputStream());
			DataOutputStream out=new DataOutputStream(socket.getOutputStream());
			out.writeDouble(longitA);
			out.writeDouble(longitB);
			int r=in.readInt();
			System.out.println("Diferenta de fus orar dintre longitA: "+longitA+" si longitB: "+longitB+" este de "+r);
			socket.close();
			sc.close();
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
