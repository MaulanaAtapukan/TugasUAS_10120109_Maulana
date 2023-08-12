package com.maul.mobook.ui.home;

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
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.maul.mobook.R;

public class FragmentHome extends Fragment{

    Button logout;
    GoogleSignInClient gClient;
    GoogleSignInOptions gOptions;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }
}
