package net.frostq.DiagonalBridges.net;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public abstract class ReceiveHandler {
	public abstract void onReceive(InetSocketAddress inet, ByteBuffer buf);
}