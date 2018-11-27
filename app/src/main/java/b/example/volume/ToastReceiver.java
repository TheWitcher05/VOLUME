package b.example.volume;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.widget.Toast;

public class ToastReceiver extends BroadcastReceiver {
    private static String  VOLUME_CHANGE_ACTION="android.media.VOLUME_CHANGED_ACTION";
    @Override
    public void onReceive(Context context, Intent intent) {
        if(VOLUME_CHANGE_ACTION.equals(intent.getAction()))
        {  AudioManager audioManger=(AudioManager)context.getSystemService(context.AUDIO_SERVICE);
            //Toast.makeText(context,"volumn"+audioManger.getStreamMaxVolume(AudioManager.STREAM_MUSIC), Toast.LENGTH_SHORT).show();
            Intent intent2=new Intent(context,Main2Activity.class);
            context.startActivity(intent2);


    }
}}
