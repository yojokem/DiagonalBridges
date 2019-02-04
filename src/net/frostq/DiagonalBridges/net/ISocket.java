package net.frostq.DiagonalBridges.net;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public interface ISocket {
	public void send(ByteBuffer buf);
	public void broadcast(ByteBuffer buf);
	public void onReceive(InetSocketAddress inet, ByteBuffer buf);
	
	public void setDataLength(int DATA_LEN);
	public void setReceiving(boolean b);
	public void close();
}