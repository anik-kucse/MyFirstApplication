package my.first.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button logInButton;
    private  Button logOutButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);
        logInButton = findViewById(R.id.logInButtonId);
        logOutButton = findViewById(R.id.logOutButtonId);

        logInButton.setOnClickListener(this);
        logOutButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.logInButtonId :
                textView.setText("Log In");
                break;
            case R.id.logOutButtonId :
                textView.setText("Log Out");
                break;
        }
    }
}
