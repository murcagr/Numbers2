package murcagr.numbers;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import murcagr.numbers.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Получаем ВьюМодел
        MViewModel mVm = ViewModelProviders.of(this).get(MViewModel.class);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.setMv(mVm);


    }




//    public void countMe (View view) {
//        // Get the text view.
//        TextView showCountTextView = (TextView)
//                findViewById(R.id.text_number);
//
//        // Get the value of the text view.
//        String countString = showCountTextView.getText().toString();
//
//        if(countString.isEmpty()){
//            showCountTextView.setText("0");
//
//        }
//        else{
//            Integer count = Integer.parseInt(countString);
//            count++;
//            showCountTextView.setText(count.toString());
//
//        }
//    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
