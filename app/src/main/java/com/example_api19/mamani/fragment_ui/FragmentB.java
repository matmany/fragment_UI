package com.example_api19.mamani.fragment_ui;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mamani on 13/07/16.
 */
public class FragmentB extends Fragment {

    TextView text;
    String data= null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.layout_fragment_b,container,false);

        if(savedInstanceState != null)
        {
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(savedInstanceState.getString("msg"));
        }


        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("msg",data);
    }


    public void change_data(int i) {

        Resources res = getResources();
        String[] descriptions = res.getStringArray(R.array.descriptions);

        data = descriptions[i];
        text.setText(descriptions[i]);

    }

}
