import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class PA3{

    ArrayList<Integer> giftBag = new ArrayList<Integer>();

    for (int i = 0; i < 500000; i++) {
        giftBag.add(i);
    }
    
    // randomize gift order
    Collections.shuffle(giftBag);

    LockFreeLL chain = new LockFreeLL();
}
