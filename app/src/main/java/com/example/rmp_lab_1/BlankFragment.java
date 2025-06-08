package com.example.rmp_lab_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_blank, container, false);

        // Находим элементы по id
        Button button = view.findViewById(R.id.button);
        EditText editText = view.findViewById(R.id.editText);
        TextView resultText = view.findViewById(R.id.resultText);

        button.setOnClickListener(v -> {
            String inputText = editText.getText().toString();
            resultText.setText(inputText);
        });

        return view;
    }
}