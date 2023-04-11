package com.example.assignment2;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Afragment extends Fragment {



    public Afragment() {
        // Required empty public constructor
    }

    Context mContext;
    View rootView;
    List<Offers> mOffers;
    RecyclerView mRecyclerView;

    RecyclerViewAdapter mRecyclerViewAdapter;
    FragmentManager fragmentManager;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mContext = getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView =  inflater.inflate(R.layout.fragment_afragment, container, false);


        mRecyclerView = rootView.findViewById(R.id.recycler_view1);
        mOffers = new ArrayList<>();

        fragmentManager = getActivity().getSupportFragmentManager();
        mOffers.add(new Offers("71% OFF","Starry Bag",R.drawable.img));
        mOffers.add(new Offers("50% OFF","Head Scarf",R.drawable.img_1));
        mOffers.add(new Offers("48% OFF","4 Headbands",R.drawable.img_2));
        mOffers.add(new Offers("30% OFF","Golden Headband",R.drawable.img_3));
        mOffers.add(new Offers("80% OFF","Soft scrunchie",R.drawable.img_4));
        mOffers.add(new Offers("45% OFF","Kamarbandh",R.drawable.img_5));
        mOffers.add(new Offers("67% OFF","Cool Watch",R.drawable.img_6));
        mOffers.add(new Offers("45% OFF","12 Lipstick's set ",R.drawable.img_7));

        mRecyclerViewAdapter = new RecyclerViewAdapter(getContext(),mOffers);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
        mRecyclerView.setAdapter(mRecyclerViewAdapter);

        return rootView;
    }
}