package net.frostq.DiagonalBridges;

import java.io.InputStream;
import java.io.OutputStream;

public class UStream implements IStream {
	public static final int DATA_LEN = 512;
	
	private UpperStream up;
	private InputStream is;
	private OutputStream os;
	
	public void setUP(UpperStream up) {
		this.up = up;
	}
	
	public int getID() {
		return 1;
	}
	
	@Override
	public void close() {
		
	}
}