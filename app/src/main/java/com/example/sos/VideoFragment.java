package com.example.sos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class VideoFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_map, container, false);
        View view= inflater.inflate(R.layout.fragment_video, container, false);
        Button open=(Button)view.findViewById(R.id.button2);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VideoPage.class);
                intent.putExtra(" , "," DEMO VIDEO PAGE");
                startActivity(intent);
            }
        });
        return view;
    }
}
