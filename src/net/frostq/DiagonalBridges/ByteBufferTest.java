package net.frostq.DiagonalBridges;

import java.nio.ByteBuffer;

public class ByteBufferTest {
	public static void main(String[] args) {
		byte[] a = {0,1,2,3,4,5};
		ByteBuffer buf = ByteBuffer.wrap(a);
		byte[] b = buf.array();
		
		buf.get();
		ByteBuffer cc = (ByteBuffer) buf.clear();
		
		byte[] c = new byte[buf.remaining()];
		buf.get(c);
		log(c);
		cc.position(0);
		
		c = new byte[cc.remaining()];
		buf.get(c);
		log(c);
		
		log(a);
		log(b);
		log("A");
		
		buf = ByteBuffer.allocate(512);
		buf.put(a);
		log(buf.limit());
		log(buf.capacity());
		log(buf.position());
		log(buf.remaining());
		log("Flippin'");
		buf.flip();
		log(buf.position());
		log(buf.limit());
		log(buf.capacity());
		log(buf.remaining());
		c = new byte[buf.remaining()];
		buf.get(c);
		log(c);
	}
	
	public static void log(Object m) {
		System.out.println(m);
	}
	
	public static void log(byte[] b) {
		for(byte a : b)
			System.out.print(a);
		
		System.out.println();
	}
}