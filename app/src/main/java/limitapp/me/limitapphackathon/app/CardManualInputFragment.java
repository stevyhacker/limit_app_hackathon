package limitapp.me.limitapphackathon.app;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import limitapp.me.limitapphackathon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CardManualInputFragment extends Fragment {


    public CardManualInputFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_card_manual_input, container, false);

        TextView addBtn = v.findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((CardInputActivity) getActivity()).mainScreen();
            }
        });


        return v;
    }

}
