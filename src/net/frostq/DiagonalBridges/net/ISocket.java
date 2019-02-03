package net.frostq.DiagonalBridges.net;

import java.nio.ByteBuffer;

public interface ISocket {
	public void send(ByteBuffer buf);
	public void broadcast(ByteBuffer buf);
	public void onReceive(ByteBuffer buf);
	public void close();
}