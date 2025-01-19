package nl.bld.gda.icn;
import java.util.Locale;

import com.ibm.ecm.extension.Plugin;
import com.ibm.ecm.extension.PluginAction;
import nl.bld.gda.icn.actions.*;

public class GDAPlugin extends Plugin{
	@Override
	public String getId() {
		return "GDAPlugin";
	}

	@Override
	public String getName(Locale locale) {
		// TODO Auto-generated method stub
		return "GDAPlugin";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	@Override
	public String getScript() {
		return "GDAPlugin.js";
	}

	@Override
	public String getDojoModule() {
		// TODO Auto-generated method stub
		return "gdaPluginDojo";
	}

	@Override
	public PluginAction[] getActions() {
		// TODO Auto-generated method stub
		return new PluginAction[] {new AddGdaDossierAction() };
	}



}