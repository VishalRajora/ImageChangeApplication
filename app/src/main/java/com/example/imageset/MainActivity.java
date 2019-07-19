package com.example.imageset;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
    }

    public void nextImage(View view)
    {
        Button b=(Button)findViewById ( R.id.btn );
        ImageView img=(ImageView)findViewById ( R.id.iv );
        img.setImageResource ( R.drawable.download1 );
        b.setText ( "Complete" );
    }
}
