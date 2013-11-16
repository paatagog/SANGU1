package Svanadze.host;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetRigthIP {
	public String GetIP(String domainName) throws UnknownHostException {
		InetAddress[] machines = InetAddress.getAllByName(domainName);
		String rightIP = null;
		for (InetAddress address : machines) {
			rightIP = address.getHostAddress();
		}
		return rightIP;
	}
}
