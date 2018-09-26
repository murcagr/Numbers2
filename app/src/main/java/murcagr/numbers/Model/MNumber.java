package murcagr.numbers.Model;

import android.databinding.BaseObservable;

import java.util.Random;

public class MNumber extends BaseObservable {


    private Integer num;

    public MNumber() {
        num = 0;
    }


    private void increase(){
        num++;
    }

    private void randomize(){
        Random rand = new Random();
        num = rand.nextInt();

    }


    public Integer getNum() {
        return num;
    }
}
