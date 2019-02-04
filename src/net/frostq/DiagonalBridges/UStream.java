package net.frostq.DiagonalBridges;

import java.nio.ByteBuffer;

public class UStream implements IStream {
	public static final int DATA_LEN = 512;
	
	private UpperStream up;
	
	public void setUP(UpperStream up) {
		this.up = up;
	}
	
	public int getID() {
		return 1;
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