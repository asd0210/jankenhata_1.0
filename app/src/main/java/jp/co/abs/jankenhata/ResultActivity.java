package jp.co.abs.jankenhata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        ImageView imageView4 = (ImageView) findViewById(R.id.imageView4);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageView5);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageView6);
        TextView textView=(TextView)findViewById(R.id.textView3);

        //受け取り
        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);


        //相手の手をランダム
        long seed = System.currentTimeMillis();
        Random rnd = new Random(seed);
        int enemy = rnd.nextInt(3);

        //相手の手を表示
        switch (enemy) {
            case 0:
                imageView5.setImageResource(R.drawable.j_gu02);
                break;
            case 1:
                imageView5.setImageResource(R.drawable.j_ch02);
                break;
            case 2:
                imageView5.setImageResource(R.drawable.j_pa02);
                break;
        }


        int me = 0;
        //自分の手を表示
        switch (image) {
            case R.id.imageView1:
                imageView6.setImageResource(R.drawable.j_gu02);
                me = 0;
                break;
            case R.id.imageView2:
                imageView6.setImageResource(R.drawable.j_ch02);
                me = 1;
                break;
            case R.id.imageView3:
                imageView6.setImageResource(R.drawable.j_pa02);
                me = 2;
                break;
        }


        //勝敗判定
        switch (me) {
            case 0:
                switch (enemy){
                    case 0:
                        imageView4.setImageResource(R.drawable.draw);
                        textView.setText(R.string.draw);
                        break;
                    case 1:
                        imageView4.setImageResource(R.drawable.win);
                        textView.setText(R.string.win);
                        break;
                    case 2:
                        imageView4.setImageResource(R.drawable.lose);
                        textView.setText(R.string.lose);
                        break;
                }
                break;

            case 1:
                switch (enemy) {
                    case 0:
                        imageView4.setImageResource(R.drawable.lose);
                        textView.setText(R.string.lose);
                        break;
                    case 1:
                        imageView4.setImageResource(R.drawable.draw);
                        textView.setText(R.string.draw);
                        break;
                    case 2:
                        imageView4.setImageResource(R.drawable.win);
                        textView.setText(R.string.win);
                        break;
                }
                break;

            case 2:
                switch (enemy) {
                    case 0:
                        imageView4.setImageResource(R.drawable.win);
                        textView.setText(R.string.win);
                        break;
                    case 1:
                        imageView4.setImageResource(R.drawable.lose);
                        textView.setText(R.string.lose);
                        break;
                    case 2:
                        imageView4.setImageResource(R.drawable.draw);
                        textView.setText(R.string.draw);
                        break;
                }
                break;
        }
    }

}
