package com.tavi.impl;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.function.Function;

public class AppThread {
	public Function<Socket,Thread> service=sock->{
	    return new Thread(()->{
	      try(DataOutputStream out = new DataOutputStream(sock.getOutputStream());
	        DataInputStream in = new DataInputStream(sock.getInputStream())){  
	        double longitA=0,longitB=0;
	        longitA=in.readDouble();
	        longitB=in.readDouble();
	        int difference=FusOrar.timezoneDifference(longitA, longitB);
	        out.writeInt(difference);;
	        sock.close();
	      }
	      catch(IOException e){
	         e.printStackTrace();
	      }  
	    });
	  };
}
