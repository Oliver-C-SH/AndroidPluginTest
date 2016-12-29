package oliver.com.androidplugintest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import oliver.com.androidplugintest.plugin.PluginManager;
import oliver.com.pluginlibrary.IPluginInterface;

public class MainActivity extends AppCompatActivity {

    private TextView text_version,text_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_version=(TextView)findViewById(R.id.text_version);
        text_info=(TextView)findViewById(R.id.text_info);

        PluginManager pluginManager=PluginManager.getInstance();
        IPluginInterface pluginTool=pluginManager.createTestPluginInstance();
        text_version.setText(pluginTool.getVersion());
        text_info.setText(pluginTool.getPluginMessage());

    }


}
