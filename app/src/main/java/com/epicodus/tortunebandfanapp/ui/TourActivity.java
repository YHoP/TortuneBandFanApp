package com.epicodus.tortunebandfanapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import com.epicodus.tortunebandfanapp.R;
import com.epicodus.tortunebandfanapp.models.Tour;
import com.epicodus.tortunebandfanapp.models.TourLib;

public class TourActivity extends AppCompatActivity {

    private TourLib mTourLib;
    private Tour mCurrentTour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour);
        final LinearLayout layout = (LinearLayout) findViewById(R.id.tourLinear);

        mTourLib = new TourLib();
        int tourLibSize = mTourLib.getTours().size();



        for (int i = 0; i < tourLibSize; i++){
            mCurrentTour = mTourLib.getTours().get(i);
            TextView mDate = new TextView(this);
            mDate.setText(mCurrentTour.getDate());
            mDate.setTextSize(getResources().getDimension(R.dimen.text_size));
            layout.addView(mDate);

            TextView mEvent = new TextView(this);
            mEvent.setText(mCurrentTour.getEvent());
            mEvent.setTextSize(getResources().getDimension(R.dimen.text_size));
            layout.addView(mEvent);

            TextView mLocation = new TextView(this);
            mLocation.setText(mCurrentTour.getLocation());
            mLocation.setTextSize(getResources().getDimension(R.dimen.text_size));
            layout.addView(mLocation);

            TextView mDetail = new TextView(this);
            mDetail.setText(mCurrentTour.getDetail());
            mDetail.setTextSize(getResources().getDimension(R.dimen.text_size));
            layout.addView(mDetail);
            mDetail.setVisibility(View.INVISIBLE);

            TextView mMore = new TextView(this);
            mMore.setText("...more");
            layout.addView(mMore);

//            TextView mLess = new TextView(this);
//            mLess.setText("...less");
//            layout.addView(mLess);
//            mLess.setVisibility(View.INVISIBLE);

            mMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(getApplicationContext(), "Testing", Toast.LENGTH_LONG);

//                    mMore.setVisibility(View.INVISIBLE);
//                    mDetail.setVisibility(View.VISIBLE);
//                    mLess.setVisibility(View.VISIBLE);

                }
            });

        }
    }

}
