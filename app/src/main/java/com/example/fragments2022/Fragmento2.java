package com.example.fragments2022;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class Fragmento2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento2, container, false);
    }
    //1-- criação do método helloFrag2 que será evocado na opção de captura da instância do Fragmento2 através da Tag ("Frag2")
    public void helloFrag2(){
        Toast.makeText(getActivity(),"método hello do Fragmento2",Toast.LENGTH_LONG).show();

    }
}