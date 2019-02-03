package net.frostq.DiagonalBridges;

import java.io.InputStream;
import java.io.OutputStream;

public class VStream implements IStream {
	public static final int DATA_LEN = UStream.DATA_LEN * 4;
	
	private UpperStream up;
	private InputStream is;
	private OutputStream os;
	
	public void setUP(UpperStream up) {
		this.up = up;
	}
	
	public int getID() {
		return 2;
	}

	@Override
	public void close() {
		
	}
}