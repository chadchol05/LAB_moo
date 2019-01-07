package moo.ruts.ac.th.lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;

import java.sql.RowId;

public class mvc extends AppCompatActivity {

        private ImageView imvAnimal;
        private RadioGroup radAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
    }

    private void initialwidget(){
        imvAnimal = (ImageView) findViewById(R.id,imvAnimal);
        radAnswer = (RadioGroup) findViewById(R.id.radAnswer);

    }

    public void ClickAnswer(View view){


    }
}

