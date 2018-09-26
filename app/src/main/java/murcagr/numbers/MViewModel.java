package murcagr.numbers;

import murcagr.numbers.Model.MNumber;

public class MViewModel extends android.arch.lifecycle.ViewModel {

    private MNumber number = new MNumber();

    public Integer getNumber(){
        return  number.getNum();
    }

}
