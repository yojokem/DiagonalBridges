package net.frostq.DiagonalBridges;

import java.nio.ByteBuffer;

public interface IStream {
	public int getID();
	
	public void send(ByteBuffer buf);
	public void onReceive(ByteBuffer buf);
	
	public void close();
}