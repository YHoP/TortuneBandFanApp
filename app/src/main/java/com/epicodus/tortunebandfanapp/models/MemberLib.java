package com.epicodus.tortunebandfanapp.models;

import com.epicodus.tortunebandfanapp.R;

import java.util.ArrayList;

/**
 * Created by ack & yp on 10/21/15.
 */

public class MemberLib {

    private ArrayList<Member> mMembers;

    public MemberLib(){
        setMember();
    }

    public ArrayList<Member> getMembers() {
        return mMembers;
    }

    public void setMember() {
        mMembers = new ArrayList<>();

        mMembers.add(new Member(
                "Lex Allyson",
                "vocals, guitar, flute \n\n Lex Allyson and Hilary Hanes deliver crisp, off-kilter, darkly comedic, bourbon-influenced music and live shows with an ear always tuned toward refreshing and inspired melodies. \n" +
                        "\n" +
                        "Lex's songs are carried by her literate, sometimes literary, playful, and often starkly personal lyrics (PonderPop!).  Her songbird vocal range will keep you wondering how high she can go, until you hear Europa Europa (finally recorded on Little Machine after a long life on stage), with a chorus you can't get out of you head (a \"tortune\" if you read the Urban Dictionary!), and which you can't help trying out for size in your own lungs.",
                R.drawable.lex_allyson
        ));

        mMembers.add(new Member(
                "Hilary Hanes",
                "bass, vocals, electronics \n\n Hilary began his professional bass-playing career in San Francisco in the late ‘70’s -- most notably with Pearl Harbor and the Explosions, whose meteoric rise as the region’s most popular club band led to an album on Warner Bros. They played shows with The Clash, The Police, Talking Heads and many others, as well as headlining their own national tour.  Hilary’s playing can be found on several albums by the seminal Industrial band Chrome, as well as a rock band project led by celebrated avant-garde guitarist Henry Kaiser. Hilary’s work with Providence, RI, band Lucky 57 contributed to their earning a 2006 Boston Music Award for Best Americana Band.",
                R.drawable.hilary_hanes
        ));
    }


    public Member nextMember(Member currentMember) {
        int index = mMembers.indexOf(currentMember);
        if(index == mMembers.size() -1) {
            return mMembers.get(0);
        } else {
            return mMembers.get(index +1);
        }
    }





}
