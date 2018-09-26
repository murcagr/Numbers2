package murcagr.numbers;

import murcagr.numbers.Model.MNumber;

public class MViewModel extends android.arch.lifecycle.ViewModel {

    private MNumber number = new MNumber();

    public String getNumber(){
        return  number.getNum().toString();
    }

}
