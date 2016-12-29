package oliver.com.androidplugintest.plugin;

import android.util.Log;

import oliver.com.pluginlibrary.IPluginInterface;

/**
 * Created by User on 2016/12/28.
 */
public class PluginManager {
    private String TAG=this.getClass().toString();

    private static final String PLUGIN_NAME = "plugin.apk";
    private PluginClassLoader mPluginLoader;

    private static final class PluginManagerHolder {
        private static final PluginManager INSTANCE = new PluginManager();
    }

    public static PluginManager getInstance() {
        return PluginManagerHolder.INSTANCE;
    }

    /**
     * Load theloadDtPluginApk apk
     */
    public void loadPluginApk() {
        if (mPluginLoader == null) {
            mPluginLoader = new PluginClassLoader();
            mPluginLoader.loadPluginApk(PLUGIN_NAME);
        }
    }

    /**
     * 创建一个TestUtil插件
     */
    public IPluginInterface createTestPluginInstance() {
        if (mPluginLoader == null) {
            Log.e(TAG, "createTestPluginInstance plugin loader is null");
            return null;
        }

        IPluginInterface testManager = (IPluginInterface) mPluginLoader.newInstance("oliver.com.pluginmodule.IPluginImpl");
        return testManager;
    }
}
