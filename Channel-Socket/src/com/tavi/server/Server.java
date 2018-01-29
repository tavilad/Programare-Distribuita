package com.tavi.server;


import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import com.tavi.impl.AppThread;
import com.tavi.interf.IServer;

public class Server implements IServer {

	@Override
	public ServerSocket getServerSocket(int port) {
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(port);
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println("Server socket listening on port:" + port);

		return socket;

	}

	@Override
	public void myAction(ServerSocket socket) {
		int NTHREADS=8192;
	    ExecutorService exec=Executors.newFixedThreadPool(NTHREADS);
	    AppThread appThread=new AppThread();
	    while(true){
	      try{
	        exec.execute(appThread.service.apply(socket.accept()));
	      }
	      catch(IOException e){
	        e.printStackTrace();
	      }        
	    }

	}

}
