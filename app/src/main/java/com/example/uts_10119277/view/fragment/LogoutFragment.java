package com.example.uts_10119277.view.fragment;
//10119277-Muhamad Marsa-IF7
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.annotation.Nullable;
import com.example.uts_10119277.R;
import com.example.uts_10119277.view.activity.LoginActivity;
import com.example.uts_10119277.view.activity.MainActivity;
import com.google.firebase.auth.FirebaseAuth;

public class LogoutFragment extends Fragment {
    private MainActivity mainActivity;
    private Button btnlogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_logout, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();
        btnlogout = getView().findViewById(R.id.btn_logout);

        btnlogout.setOnClickListener(v -> {
            FirebaseAuth.getInstance().signOut();
            startActivity(new Intent(getContext(), LoginActivity.class));
        });
    }
}
