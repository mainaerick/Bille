package com.newways.billie.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.newways.billie.Adapter.Notification_adapter;
import com.newways.billie.Adapter.Previouspayment_adapter;
import com.newways.billie.R;
import com.newways.billie.Utils.Notification_detail;
import com.newways.billie.Utils.Previouspayment_detail;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Notification_detail> notification_details;
    Notification_adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        listView=findViewById(R.id.listviewnotification);
        notification_details=new ArrayList<>();

        String [] notificationtitle={
                "Issue With Payments - Solved","Issue With Payments - Solved","Issue With Payments - Solved","Issue With Payments - Solved","Issue With Payments - Solved"
        };
        String [] notificationdate={
                "Monday 23rd May 2021","Monday 23rd May 2021","Monday 23rd May 2021","Monday 23rd May 2021","LMonday 23rd May 2021"
        };

        Notification_detail notification_detail=new Notification_detail();
        for (int i=0;i<notificationdate.length;i++){

            notification_detail.setTitle(notificationtitle[i]);
            notification_detail.setDate(notificationdate[i]);
            notification_details.add(notification_detail);
        }
        adapter=new Notification_adapter(this,R.layout.layout_notification,notification_details);
        listView.setAdapter(adapter);

    }
}
