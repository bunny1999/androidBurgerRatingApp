package in.irotech.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBar);
        textView=findViewById(R.id.textView);
    }
    public void update(View view){
        float ratingVal=ratingBar.getRating();
        if(ratingVal<2){
            textView.setText("Rating:"+ratingVal+"\nWe Will Try Hard Next Time!");
        }else if(ratingVal<=3 && ratingVal>=2){
            textView.setText("Rating:"+ratingVal+"\nWe Are Working On It!");
        }else{
            textView.setText("Rating:"+ratingVal+"\nWe Are Happy To Help You!");
        }
    }
}
