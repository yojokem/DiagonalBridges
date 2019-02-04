package net.frostq.DiagonalBridges.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import net.frostq.DiagonalBridges.IStream;

public class UDPSocket implements ISocket {
	public static List<Integer> usingPorts = new ArrayList<Integer>();
	
	private MulticastSocket ms;
	public InetSocketAddress target;
	private boolean receiving;
	
	private IStream instream;
	
	@Override
	public void send(ByteBuffer buf) {
		send(this.target, buf);
	}
	
	public void send(InetSocketAddress target, ByteBuffer buf) {
		buf.flip();
		byte[] toSend = new byte[buf.remaining()];
		buf.get(toSend);
		try {
			ms.send(new DatagramPacket(toSend, 0, toSend.length, target));
			log("Sent a data to: " + target.getAddress().getHostAddress() + ":" + target.getPort());
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	
	protected void receive(InetSocketAddress inet) {
		Thread t = new Thread(() -> {
			
		}, "UDPSocket - Receive Thread [" + inet.getAddress().getHostAddress() + ":" + inet.getPort() + "]");
	}

	@Override
	public void close() {
		try {
			ms.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("UDPSocket Error! While closing,");
		}
	}
	
	public static MulticastSocket createMultiSocket(int PORT) {
		usingPorts.add(PORT);
		try {
			return new MulticastSocket(PORT);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void log(Object m) {
		net.frostq.DiagonalBridges.Logger.log("[UDPSocket]", m, true);
	}
}