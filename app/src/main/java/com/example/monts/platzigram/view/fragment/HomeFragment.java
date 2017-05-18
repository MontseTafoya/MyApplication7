package com.example.monts.platzigram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.monts.platzigram.R;
import com.example.monts.platzigram.adapter.PictureAdapterRecyclerView;
import com.example.monts.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar((getResources().getString(R.string.tab_home)), false, view);
        //El reciclar
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);
        //Acomodando
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buidPictures() {
        ArrayList<Picture> pictures = new ArrayList<>();
        //Se agregan las imagenes
       pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Uriel Ramirez","4 dias","3 Me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Juan Pablo","3 dias","10 Me gusta"));
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg","Anahí Salgado","2 dias","9 Me gusta"));
return pictures;
    }

//Se copia de create acount Activity solo se agrega view
    public void showToolbar(String tittle,boolean upButton,View view){
        Toolbar toolbar=(Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
