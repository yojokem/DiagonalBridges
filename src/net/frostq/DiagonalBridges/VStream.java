package net.frostq.DiagonalBridges;

public class VStream implements IStream {
	public static final int DATA_LEN = UStream.DATA_LEN * 4;
	
	public int getID() {
		return 2;
	}

	@Override
	public void close() {
		
	}
}