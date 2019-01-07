package moo.ruts.ac.th.lab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class temCal extends AppCompatActivity {

    private String Tem, Unit, Answer;
    private TextView txt1, txt2, txt3;
    private Button butbk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tem_cal);

        butbk = (Button) findViewById(R.id.butbk);
        butbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(temCal.this, tem.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        Tem = intent.getExtras().getString("Tem");
        Unit = intent.getExtras().getString("Unit");
        Answer  = intent.getExtras().getString("Answer");

        txt1 = (TextView)findViewById(R.id.txtget);
        txt2 = (TextView)findViewById(R.id.txttemp);
        txt3 = (TextView)findViewById(R.id.txtresult);


        txt1.setText(getIntent().getStringExtra("Tem"));
        txt2.setText(getIntent().getStringExtra("Unit"));
        txt3.setText(getIntent().getStringExtra("Answer"));

    }
}
