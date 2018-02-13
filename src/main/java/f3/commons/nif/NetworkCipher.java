package f3.commons.nif;

import java.nio.ByteBuffer;

/**
 * @author n3k0nation
 *
 */
public interface NetworkCipher {
	
	boolean encrypt(ByteBuffer buffer, int length);
	boolean decrypt(ByteBuffer buffer, int length);
	
}
