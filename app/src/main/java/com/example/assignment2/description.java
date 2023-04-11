package com.example.assignment2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class description extends Fragment {

    String received_data;
    String namee , typee;

    String category;

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public void setTypee(String typee) {
        this.typee = typee;
    }


    public String getReceived_data() {
        return received_data;
    }

    TextView name,type;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(category);
        System.out.println(namee);
        System.out.println(typee);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);

        TextView name , type;
        name = view.findViewById(R.id.offer_name_details);
        type = view.findViewById(R.id.offer_type_details);

        name.setText(namee);
        type.setText(typee);

        return view;
    }

    public void recvData(String descriptionData) {
        received_data = descriptionData;
    }


    public void setCategory(String category) {
        this.category = category;
    }
}