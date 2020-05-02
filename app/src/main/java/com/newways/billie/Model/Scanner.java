package com.newways.billie.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.newways.billie.Adapter.Previouspayment_adapter;
import com.newways.billie.R;
import com.newways.billie.Utils.Previouspayment_detail;

import java.util.ArrayList;

public class Scanner extends AppCompatActivity {
    ListView paymentslistview;
    ImageView account_btn;
    Previouspayment_adapter adapter;
    ArrayList<Previouspayment_detail>cardetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        paymentslistview=findViewById(R.id.previouspayment_listview);
        account_btn=findViewById(R.id.accountbutton);

        String [] carplates={
                "KCA 199C - 50KSH","KCA 199C - 50KSH","KCA 199C - 50KSH","KCA 199C - 50KSH","KCA 199C - 50KSH"
        };
        String [] carsacco={
                "LOPHA TRAVELLS","LOPHA TRAVELLS","LOPHA TRAVELLS","LOPHA TRAVELLS","LOPHA TRAVELLS"
        };

        cardetails=new ArrayList<>();
        Previouspayment_detail previouspayment_detail=new Previouspayment_detail();
        for (int i=0;i<carplates.length;i++){
            previouspayment_detail.setPlatenumber(carplates[i]);
            previouspayment_detail.setSacconame(carsacco[i]);
            cardetails.add(previouspayment_detail);
        }
        adapter=new Previouspayment_adapter(this,R.layout.layout_paymentprevious,cardetails);
        paymentslistview.setAdapter(adapter);

        account_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Scanner.this,AccountActivity.class));
            }
        });


    }
}
