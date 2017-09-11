package jp.ac.dendai.c.jtp.a3dcube;

import android.app.Activity;
import android.os.Bundle;

public class OpenGL0 extends Activity {

    TouchGLSurfaceView myGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGLView = new TouchGLSurfaceView(this);
        setContentView(myGLView);
    }

    @Override
    protected void onResume(){
        super.onResume();
        myGLView.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
        myGLView.onPause();
    }
}