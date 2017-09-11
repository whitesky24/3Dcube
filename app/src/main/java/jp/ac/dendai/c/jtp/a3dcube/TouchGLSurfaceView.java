package jp.ac.dendai.c.jtp.a3dcube;


        import android.content.Context;
        import android.opengl.GLSurfaceView;

public class TouchGLSurfaceView extends GLSurfaceView {

    MyRenderer myRenderer;

    public TouchGLSurfaceView(Context context) {
        super(context);
        myRenderer = new MyRenderer();
        setRenderer(myRenderer);
    }

}