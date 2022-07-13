package com.kodilla;

import java.util.*;
import java.time.*;
import java.io.*;
import java.lang.*;
import java.time.LocalTime.*;
import java.time.*;

public class Clocks {

    LocalTime clockTime;

    public Clocks(int hour, int minute){
        this.clockTime = LocalTime.of(hour, minute);
    }


    @Override
    public String toString() {
        return "the time is" + " " + clockTime;
    }

    public LocalTime getClockTime(){
        return clockTime;
    }
    public void setClockTime(LocalTime clockTime){
        this.clockTime = clockTime;
    }
}


