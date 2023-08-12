package com.maul.mobook;

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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.DialogFragment;

import com.maul.mobook.R;

public class DialogAbout extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.about,container,false);
    }
}
