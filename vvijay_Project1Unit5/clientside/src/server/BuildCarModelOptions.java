package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class BuildCarModelOptions {
//Accept properties object from client socket over an ObjectStream and create an Automobile
	public void serverset(){
	ServerSocket serverSocket = null;
			try {
			serverSocket = new ServerSocket(4444);
			} catch (IOException e) {
			System.err.println("Could not listen on port: 4444.");
			System.exit(1);
			}
	DefaultSocketClient clientSocket = null;
	try {
		clientSocket = serverSocket.accept();
	} catch (IOException e) {
		System.err.println("Accept failed.");
		System.exit(1);
	}
	PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	BufferedReader in = new BufferedReader(
	new InputStreamReader(
	clientSocket.getInputStream()));
