package com.example.dekonstruktor;
import java.util.ArrayList;

import android.os.Bundle;
import android.os.Debug;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.dekonstruktor.databinding.FragmentSecondBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    AdModel ad_1 = new AdModel("Chocapic","36 rue due kiosque",R.drawable.ic_launcher_background);
    AdModel ad_2 = new AdModel("Pain","Pékin",R.drawable.ic_launcher_background);
    AdModel ad_3 = new AdModel("Béton","Rouen",3);

    ArrayList<AdModel> Adlist = new ArrayList<>();

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Adlist.add(ad_1);
        Adlist.add(ad_2);
        Adlist.add(ad_3);

        AdAdapter adAdapter = new AdAdapter(view.getContext(), Adlist);
        ListView listviewGlobal = view.findViewById(R.id.ListeAnnonce);
        listviewGlobal.setAdapter(adAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}