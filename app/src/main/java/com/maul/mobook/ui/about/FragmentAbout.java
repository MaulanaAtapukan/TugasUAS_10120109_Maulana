package com.maul.mobook.ui.about;

/**
 Nama : Maulana Ardiansyah Atapukan
 Nim : 10120109
 Kelas : IF-3
 Nim : maulanaatapukan@gmail.com


 */



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maul.mobook.DialogAbout;
import com.maul.mobook.R;

import androidx.fragment.app.Fragment;

public class FragmentAbout extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_about, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Reza Surya Nugraha");
        });

        return root;
    }
}

