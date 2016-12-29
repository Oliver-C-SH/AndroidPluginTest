package oliver.com.androidplugintest;

import android.app.Application;
import android.content.Context;

import oliver.com.androidplugintest.plugin.PluginManager;

/**
 * Created by User on 2016/12/28.
 */
public class MyApplication extends Application{
    private static MyApplication mInstance;

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        mInstance = this;
        PluginManager.getInstance().loadPluginApk();
    }

    /**
     * 获取Application的实例
     */
    public static MyApplication getInstance() {
        return mInstance;
    }
}
