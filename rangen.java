package Task1;

import java.util.Scanner;

class rangen{
    public int genrate(int max,int min){
        return (int) (Math.random()*(max - min + 1) + min);
    }
}

