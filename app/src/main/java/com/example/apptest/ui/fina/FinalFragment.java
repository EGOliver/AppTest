package com.example.apptest.ui.fina;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.apptest.databinding.FragmentFinalBinding;
import com.example.apptest.databinding.FragmentGalleryBinding;
import com.example.apptest.ui.gallery.GalleryViewModel;

public class FinalFragment extends Fragment {

    private FragmentFinalBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FinalViewModel finalViewModel =
                new ViewModelProvider(this).get(FinalViewModel.class);

        binding = FragmentFinalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textFinal;
        finalViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
