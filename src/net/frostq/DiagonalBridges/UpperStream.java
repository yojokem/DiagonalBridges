package net.frostq.DiagonalBridges;

public class UpperStream implements IStream {
	public static final int DATA_LEN = UStream.DATA_LEN / 2;
	
	public int getID() {
		return 0;
	}
	
	@Override
	public void close() {
		
	}
}