package com.example.fragments2022;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Fragmento3 extends Fragment {
    //1--cria a variável "text" relativa ao caixa de texto no arquivo XML
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //2--Criação de uma variável view para poder manipular o TextView no fragment_frame3
        View view = inflater.inflate(R.layout.fragment_fragmento3, container, false);

        //3-- Recebimento e passagem de valor para a TexView
        if(getArguments() !=null){                                  //verifica se há conteúdo a ser lido
            String conteudo = getArguments().getString("myTag"); //extrai o conteúdo e guarda na variável "conteudo"
            text = (TextView) view.findViewById(R.id.textoFrag3); //Faz o link entre a view XML e a variávle "text"
            text.setText(conteudo); //insere o conteudo na caixa de texto
        }
        return view ;
    }
}