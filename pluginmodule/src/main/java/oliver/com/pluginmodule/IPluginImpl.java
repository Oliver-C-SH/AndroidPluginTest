package oliver.com.pluginmodule;

import oliver.com.pluginlibrary.IPluginInterface;

/**
 * Created by User on 2016/12/28.
 */
public class IPluginImpl implements IPluginInterface {

    @Override
    public String getVersion() {
        return "Version 1.0";
    }

    @Override
    public String getPluginMessage() {
        return "Hi,this is from the Plugin Module!";
    }
}
