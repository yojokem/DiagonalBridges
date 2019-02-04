package net.frostq.DiagonalBridges.net;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import net.frostq.DiagonalBridges.IStream;

public class TCPSocket implements ISocket {
	public static List<Integer> usingPorts = new ArrayList<Integer>();
	
	private Socket sock;
	private ServerSocket ssock;
	private boolean receiving;
	
	private IStream instream, outstream;
	
	@Override
	public void send(ByteBuffer buf) {
		outstream.send(buf);
	}

	@Override
	public void onReceive(InetSocketAddress inet, ByteBuffer buf) {
		
	}

	@Override
	public void broadcast(ByteBuffer buf) {
		
	}

	@Override
	public void setDataLength(int DATA_LEN) {
		
	}

	@Override
	public void setReceiving(boolean b) {
		this.receiving = b;
	}
	
	@Override
	public void close() {
		try {
			sock.close();
			ssock.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("TCPSocket Error! While closing,");
		}
	}
	
	public static ServerSocket createMiddle(int PORT) {
		usingPorts.add(PORT);
		try {
			return new ServerSocket(PORT);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Socket createClient(InetSocketAddress inet) {
		try {
			return new Socket(inet.getAddress(), inet.getPort());
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void log(Object m) {
		net.frostq.DiagonalBridges.Logger.log("[TCPSocket]", m, true);
	}
}