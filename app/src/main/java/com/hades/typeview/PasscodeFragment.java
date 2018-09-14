package com.hades.typeview;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hades.typeview.callback.OnKeyClickListener;
import com.hades.typeview.model.Passcode;

public class PasscodeFragment extends Fragment {

    private PasscodeView mPasscodeView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_passcode, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPasscodeView = view.findViewById(R.id.passcode_login);
        mPasscodeView.binding.setCallback(mListener);
        PasscodeViewModel viewModel = ViewModelProviders.of(this).get(PasscodeViewModel.class);
        observe(viewModel);
    }

    private void observe(PasscodeViewModel viewModel) {
        viewModel.getmPasscodeLiveData().observe(this, new Observer<Passcode>() {
            @Override
            public void onChanged(@Nullable Passcode passcode) {
                updatePasscode(passcode);
            }
        });
    }

    private void updatePasscode(Passcode passcode) {
        if (passcode == null) return;
//        if (passcode.firstNumber == -1)
    }

    private OnKeyClickListener mListener = new OnKeyClickListener() {
        @Override
        public void onKeyClick(String value) {
            System.out.println(value);
        }
    };
}
