package net.frostq.DiagonalBridges;

import java.nio.ByteBuffer;

public class UpperStream implements IStream {
	public static final int DATA_LEN = UStream.DATA_LEN / 2;
	
	public int getID() {
		return 0;
	}
	
	@Override
	public void send(ByteBuffer buf) {
		
	}

	@Override
	public void onReceive(ByteBuffer buf) {
		
	}
	
	@Override
	public void close() {
		
	}
}