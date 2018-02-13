package f3.commons.nif;

import java.nio.ByteBuffer;

/**
 * @author n3k0nation
 *
 */
public interface PacketSerializer {
	void serialize(NetworkClient client, OutcomeNetworkPacket packet, ByteBuffer buffer);
	IncomeNetworkPacket deserialize(NetworkClient client, ByteBuffer buffer);
}
