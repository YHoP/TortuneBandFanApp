package com.epicodus.tortunebandfanapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.tortunebandfanapp.R;
import com.epicodus.tortunebandfanapp.models.Member;
import com.epicodus.tortunebandfanapp.models.MemberLib;


public class MemberActivity extends AppCompatActivity {

    private TextView mName, mDescription;
    private ImageView mImage;
    private Button mNextButton;

    private Member mCurrentMember;
    private MemberLib mMemberLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        mName = (TextView) findViewById(R.id.memberName);
        mDescription = (TextView) findViewById(R.id.memberDes);
        mImage = (ImageView) findViewById(R.id.memberImage);
        mNextButton = (Button) findViewById(R.id.nextMemberButton);

        mMemberLib = new MemberLib();
        mCurrentMember = mMemberLib.getMembers().get(0);
        setLayoutContent();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentMember = mMemberLib.nextMember(mCurrentMember);
                setLayoutContent();
            }
        });

    }

    private void setLayoutContent() {
        mName.setText(mCurrentMember.getName());
        mDescription.setText(mCurrentMember.getDescription());
        mImage.setImageResource(mCurrentMember.getImage());
    }


}
