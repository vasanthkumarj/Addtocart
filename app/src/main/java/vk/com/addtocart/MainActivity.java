package vk.com.addtocart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText itemEditText;
    private TextView resultTextView;
    private String itemValue;
    private int resultValue;
    private List<String> localDatabase = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        itemEditText = findViewById(R.id.editText);
        resultTextView = findViewById(R.id.textView);
    }

    public void addToCart(View view) {
      itemValue = String.valueOf(itemEditText.getText());
      resultValue = Integer.parseInt(String.valueOf(resultTextView.getText()));
      if(StringUtils.isNotEmpty(itemValue) && !localDatabase.contains(itemValue))
      {
          localDatabase.add(itemValue);
          resultValue=resultValue+1;
         resultTextView.setText(String.valueOf(resultValue));
      }

    }


}
