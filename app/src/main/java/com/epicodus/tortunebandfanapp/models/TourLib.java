package com.epicodus.tortunebandfanapp.models;

import java.util.ArrayList;

/**
 * Created by Guest on 10/21/15.
 */
public class TourLib {

    private ArrayList<Tour> mTours;

    public TourLib(){
        setTours();
    }

    public ArrayList<Tour> getTours() {
        return mTours;
    }

    public void setTours() {
        mTours = new ArrayList<>();

        mTours.add(new Tour(
                "May 03",
                "Tortune @ Davey Gerow and Flip McGuire",
                "McMenamins Al's Den \n",
                "Attention all Tortune-y's! It's our first full live set of 2015, and it's Lex's birthday celebration as well! We're extremely pleased and proud to be joining Davey Gerow on the first night of his Al's Den week-long residency, along with Flip McGuire (Blue Flags & Black Grass). We'll be starting around 8:30, but be sure to get there at 7:00 so you won't miss a minute of Davey's and Flip's sets. Al's Den shows are always free; it's an intimate setting with great sound - don't miss it!"
        ));

        mTours.add(new Tour(
                "Oct 25",
                "Tortune @ Plew's Brews",
                "Plew's Brews \n",
                "Tortune opens for Michael Manning @ Plew's Brew's, 8409 N. Lombard, St. Johns, PDX. We start at 9:00pm. Be there!"
        ));

        mTours.add(new Tour(
                "Sep 13",
                "Tortune @ St. Johns Farmers Market",
                "St. Johns Farmers Market \n",
                "On Saturday 9/13 Tortune returns to the St Johns Farmers Market - music, fruits and vegetables, all locally grown! Music from 10am-1pm."
        ));

        mTours.add(new Tour(
                "Jan 28",
                "Tortune & Chance Wiesner at The Nest",
                "The Nest: 2715 SE Belmont St. PDX 97214 \n",
                "Saturday June 28th kicks off Tortune's new monthly gig at The Nest! We'll be playing there the last Saturday of every month, with special guests. We're thrilled to have Chance Wiesner with us for the first one, you don't want to miss his crooning! New albums for sale from both bands. Music has to be done by 10:30pm, so music really will start by 8, not the classic PDX late start!"
        ));
    }


}
