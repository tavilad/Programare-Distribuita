package com.tavi.interf;

import java.net.ServerSocket;

public interface IServer {

	public ServerSocket getServerSocket(int port);

	public void myAction(ServerSocket socket);

}
