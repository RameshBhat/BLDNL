package nl.bld.gda.icn.actions;
import java.util.Locale;

import com.ibm.ecm.extension.PluginAction;

public class AddGdaDossierAction extends PluginAction{

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public String getActionFunction() {
        // TODO Auto-generated method stub
        return "addGdaDossierAction";
    }

    @Override
    public String getName(Locale arg0) {
        // TODO Auto-generated method stub
        return "Add GDA Dossier";
    }

    @Override
    public String getServerTypes() {
        // TODO Auto-generated method stub
        return "p8";
    }

    @Override
    public boolean isMultiDoc() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isGlobal() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String getPrivilege() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getIcon() {
        // TODO Auto-generated method stub
        return null;
    }
}
