package com.example.anujsheth.tipcalulator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intDisplayButton();
    }

    public void intDisplayButton() {
        Button displayButton = (Button) findViewById(R.id.CalcTipBtn);
        displayButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View args0) {
                EditText enterNameId = (EditText) findViewById(R.id.enterNameId);
                EditText enterPercentId = (EditText) findViewById(R.id.enterPercentId);
                EditText enterBillAmtId = (EditText) findViewById(R.id.enterBillAmtId);

                Double totalBillAmount = Double.parseDouble(enterBillAmtId.getText().toString()) +
                        Double.parseDouble(enterBillAmtId.getText().toString()) *
                                Double.parseDouble(enterPercentId.getText().toString()) / 100;

                TextView idTotalBillAmount = (TextView) findViewById(R.id.idTotalBillAmount);
                idTotalBillAmount.setText(totalBillAmount.toString());
            }
        });
       // this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        Button displayButton1 = (Button) findViewById(R.id.ClrBtn);

        displayButton1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View args0) {

                EditText enterNameId = (EditText) findViewById(R.id.enterNameId);
                enterNameId.setText("");
                EditText enterPercentId = (EditText) findViewById(R.id.enterPercentId);
                enterPercentId.setText("");
                EditText enterBillAmtId = (EditText) findViewById(R.id.enterBillAmtId);
                enterBillAmtId.setText("");
                TextView idTotalBillAmount = (TextView) findViewById(R.id.idTotalBillAmount);
                idTotalBillAmount.setText("");

            }
        });

    }

}