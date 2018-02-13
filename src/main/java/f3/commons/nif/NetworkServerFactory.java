package f3.commons.nif;

/**
 * @author n3k0nation
 *
 */
public interface NetworkServerFactory {
	NetworkServerConfiguration createConfiguration();
	NetworkServer createServer(NetworkServerConfiguration configuration);
}
