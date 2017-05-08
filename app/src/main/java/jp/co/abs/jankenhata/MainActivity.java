package jp.co.abs.jankenhata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1=(ImageView)findViewById(R.id.imageView1);
        ImageView imageView2=(ImageView)findViewById(R.id.imageView2);
        ImageView imageView3=(ImageView)findViewById(R.id.imageView3);


    }

    public void image(View v) {
        Intent intent = new Intent(getApplication(), ResultActivity.class);
        //送る
        intent.putExtra("image",v.getId());
        startActivity(intent);

    }

}
