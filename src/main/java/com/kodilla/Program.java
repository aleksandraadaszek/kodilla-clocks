package com.kodilla;

import java.util.LinkedList;
import java.util.List;

public class Program {
        public static void main (String[] args) {


            List<Clocks> theCollectionOfClocks = new LinkedList<>();
            Clocks clock1 = new Clocks(12,33);
            Clocks clock2 = new Clocks(14,29);
            Clocks clock3 = new Clocks(17,17);
            Clocks clock4 = new Clocks(21,22);

            theCollectionOfClocks.add(clock1);
            theCollectionOfClocks.add(clock2);
            theCollectionOfClocks.add(clock3);
            theCollectionOfClocks.add(clock4);
            for( int n = 0; n < theCollectionOfClocks.size(); n++){
                System.out.println("The clock number "+ n +" shows that" + " " + theCollectionOfClocks.get(n));
                theCollectionOfClocks.get(n).setClockTime(theCollectionOfClocks.get(n).getClockTime().plusMinutes(1));

                System.out.println(theCollectionOfClocks.get(n));

            }
        }
}
