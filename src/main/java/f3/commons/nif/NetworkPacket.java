package f3.commons.nif;

/**
 * @author n3k0nation
 *
 */
public interface NetworkPacket {
	NetworkClient getClient();
	void setClient(NetworkClient client);
}
