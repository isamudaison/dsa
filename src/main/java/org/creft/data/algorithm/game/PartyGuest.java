package org.creft.data.algorithm.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartyGuest {
    //given a list of int[] containing guests' entrance & exit times to party, find
    // the time at which maximum occupancy was reached (and how many it was).
    public static String findMaxGuestTime(List<int[]> guests){
        List<int[]> events = new ArrayList<>();

        for(int[] guest : guests){
            //when a guest arrives, capacity gets +1
            events.add(new int[]{guest[0], 1});
            //when a guest leaves, capacity gets decremented
            events.add(new int[]{guest[1], -1});
        }

        //sort collection by time (process exit event first if equal)
        events.sort((a, b) -> a[0] == b[0]
                ? Integer.compare(a[1], b[1])
                : Integer.compare(a[0], b[0]));

        //counters for everything
        int maxGuests =0,currentGuests=0,maxTime=0;

        //sweep through events
        for(int[] event : events){
            currentGuests += event[1];
            if(currentGuests > maxGuests){
                maxGuests = currentGuests;
                maxTime = event[0];
            }
        }

        return "Maximum guests were present at time: " + maxTime + " with " + maxGuests + " guests.";

    }
}
