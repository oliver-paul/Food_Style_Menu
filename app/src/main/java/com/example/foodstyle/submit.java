package com.example.foodstyle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class submit extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    int sum=0,c=0;
    String temp;
    int ntemp=0,qtemp=0;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit2);
        Vegitarian v=new Vegitarian();
        Non_Vegitarian nv=new Non_Vegitarian();
        Both b=new Both();
        Desert d=new Desert();
        t=(TextView)findViewById(R.id.textView21);
        ArrayList<OrderList> orderLists = new ArrayList<>();
        for(int i=0; i<9; i++)
        {
            if(Vegitarian.vqcount[i] > 0)
            {
                c=0;
                temp=Vegitarian.vitem[i];
                ntemp=Vegitarian.vcount[i];
                qtemp=Vegitarian.vqcount[i];
                c=ntemp*qtemp;
                orderLists.add(new OrderList(temp,qtemp,c));
                sum+=(ntemp*qtemp);

            }
            //l
            if(Non_Vegitarian.nvqcount[i]>0)
            {
                c=0;
                temp=Non_Vegitarian.nvitem[i];
                ntemp=Non_Vegitarian.nvcount[i];
                qtemp=Non_Vegitarian.nvqcount[i];c=ntemp*qtemp;
                orderLists.add(new OrderList(temp, qtemp ,c));
                sum+=(ntemp*qtemp);
            }
            if(Both.bqcount[i]>0)
            {
                c=0;
                temp=Both.bitem[i];
                ntemp=Both.bcount[i];
                qtemp=Both.bqcount[i];c=ntemp*qtemp;
                orderLists.add(new OrderList(temp, qtemp ,c));
                sum+=(ntemp*qtemp);
            }
            if(Desert.dqcount[i]>0)
            {
                c=0;
                temp=Desert.ditem[i];
                ntemp=Desert.dcount[i];
                qtemp=Desert.dqcount[i];c=ntemp*qtemp;
                orderLists.add(new OrderList(temp, qtemp ,c));
                sum+=(ntemp*qtemp);
            }
        }

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new OrderAdapter(orderLists);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        t.setText(""+sum);
    }
}
