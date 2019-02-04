package net.frostq.DiagonalBridges;

import java.nio.ByteBuffer;

public class VStream implements IStream {
	public static final int DATA_LEN = UStream.DATA_LEN * 4;
	
	private UpperStream up;
	
	public void setUP(UpperStream up) {
		this.up = up;
	}
	
	public int getID() {
		return 2;
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