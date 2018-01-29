package com.tavi.server;

import java.net.ServerSocket;

public class ServerMain {

	public static void main(String[] args) {
		
		Server server=new Server();
		ServerSocket socket=server.getServerSocket(4444);
		server.myAction(socket);
	}

}
