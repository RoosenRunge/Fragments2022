package com.example.fragments2022;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class Fragmento1 extends Fragment {


    //1-criação das variáveis correspondente aos botões do fragment_fragmento1
    private Button btCount;
    private Button btHello;

    //2-variável de contagem
    private int count;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        //3--Criação de uma variável view para poder popular os itens de layout
        // return inflater.inflate(R.layout.fragment_third, container, false);
        View view = inflater.inflate(R.layout.fragment_fragmento1,container,false);
        btCount = (Button) view.findViewById(R.id.countXML);
        btHello = (Button) view.findViewById(R.id.activityXML);

        //4--associando a ação do contador para o botão btCount
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                Toast.makeText(getActivity(),"count: "+count,Toast.LENGTH_LONG).show();
            }
        });

        //5--associando ação no botâo btHello para chamada do método hello() da Activity
        btHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity manipulaMain = (MainActivity) getActivity();
                manipulaMain.hello();
            }
        });

        return view;

    }


}