package mx.edu.utng.operation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kast on 01/03/2017.
 */
public class Operation1 extends AppCompatActivity {

    private ImageView ivOperation;
    private EditText etX;
    private EditText etY;
    private Button btSolve;
    private TextView tvImpResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operation1);

        ivOperation = (ImageView)findViewById(R.id.iv_Operation);
        etX = (EditText)findViewById(R.id.x);
        etY = (EditText)findViewById(R.id.y);
        btSolve = (Button)findViewById(R.id.bt_solve);
        tvImpResult = (TextView)findViewById(R.id.tv_ImpResult);

        btSolve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int x = Integer.valueOf(etX.getText().toString());
                int y = Integer.valueOf(etY.getText().toString());

                double result =((2 * Math.pow(x,2))+(3*x)-1+(x*y));
                tvImpResult.setText(""+result);
            }
        });

    }

}
