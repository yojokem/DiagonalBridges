package net.frostq.DiagonalBridges;

public class UStream implements IStream {
	public static final int DATA_LEN = 512;
	
	public int getID() {
		return 1;
	}
	
	@Override
	public void close() {
		
	}
}