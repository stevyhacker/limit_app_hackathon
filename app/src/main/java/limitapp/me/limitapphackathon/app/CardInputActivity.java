package limitapp.me.limitapphackathon.app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import limitapp.me.limitapphackathon.R;

public class CardInputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_input);
        overridePendingTransition(R.anim.from_middle, R.anim.to_middle);
        getSupportActionBar().hide();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container, new CardInputStartFragment());
        transaction.commitAllowingStateLoss();

    }


    public void manualInput() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new CardManualInputFragment());
        transaction.commitAllowingStateLoss();
    }

    public void mainScreen() {
        startActivity(new Intent(this, MainActivity.class));
    }


}
