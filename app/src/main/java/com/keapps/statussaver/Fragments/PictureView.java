package com.keapps.statussaver.Fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.keapps.statussaver.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PictureView extends Fragment {

    @BindView(R.id.pictureLoad) ImageView imageLoad;
    @BindView(R.id.saveImage) Button saveButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String value = getArguments().getString("key");
        Log.v("mainactivity", "this is the key" + value);
        //Picasso.get().load(value).into(imageLoad);
        View view = inflater.inflate(R.layout.picture_view,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this,view);
    }
}
