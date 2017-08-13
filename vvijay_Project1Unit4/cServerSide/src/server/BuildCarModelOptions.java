package server;

import java.util.Properties;
import adapter.BuildAuto;
import model.Automobile;

public class BuildCarModelOptions {
	public void parseCarModelOptions(Properties props,Automobile a) {
		AutoServer server = new BuildAuto();
		server.BuildAutoFromPropertiesFile(props,a);
		}
}
