package com.auxgroup.edittextdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.CycleInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et_pop, et_cursor, et_emotion,et_delete;
    private  Button btn_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_pop = (EditText) findViewById(R.id.et_pop);
        et_pop.requestFocus();
        et_cursor = (EditText) findViewById(R.id.et_cursor);
        et_cursor.setSelection(3, 5);

        Button btn_add = (Button) findViewById(R.id.btn_add);
        et_emotion = (EditText) findViewById(R.id.et_emotion);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpannableString spanstr = new SpannableString("imge");
                Drawable drawable = MainActivity.this.getResources().getDrawable(R.drawable.smile2, null);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                ImageSpan imageSpan = new ImageSpan(drawable, ImageSpan.ALIGN_BASELINE);
                spanstr.setSpan(imageSpan, 0, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                int cursor = et_emotion.getSelectionStart();
                et_emotion.getText().insert(cursor, spanstr);

            }
        });
        et_delete= (EditText) findViewById(R.id.et_delete);
        btn_delete= (Button) findViewById(R.id.btn_delete);
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(et_delete.getText()) ) {

                }
            }
        });

    }

}
