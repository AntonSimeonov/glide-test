package ninja.paranoidandroid.glidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        loadImg();
    }

    private void initUI(){

        mImageView = (ImageView) findViewById(R.id.iv_activity_main);

    }

    private void loadImg(){

        Glide.with(this).load(R.drawable.androidify).into(mImageView);

    }

}
