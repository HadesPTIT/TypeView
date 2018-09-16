package com.hades.typeview;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hades.typeview.callback.OnKeyClickListener;
import com.hades.typeview.model.Passcode;

public class PasscodeFragment extends Fragment {

    private PasscodeView mPasscodeView;
    private PasscodeViewModel mViewModel;
    private Passcode mPasscode = new Passcode();
    private int mCount = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_passcode, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPasscodeView = view.findViewById(R.id.passcode_login);
        mViewModel = ViewModelProviders.of(this).get(PasscodeViewModel.class);
        mPasscodeView.binding.setCallback(mListener);
        mPasscodeView.binding.setPasscodeViewModel(mViewModel);
        mPasscodeView.binding.setPc(mPasscode);
    }


    private OnKeyClickListener mListener = new OnKeyClickListener() {
        @Override
        public void onKeyClick(String value) {
            if (mCount == 0) {
                mPasscode.setFirstNumber(Integer.parseInt(value));
            }
            if (mCount == 1) {
                mPasscode.setSecondNumber(Integer.parseInt(value));
            }
            if (mCount == 2) {
                mPasscode.setThirdNumber(Integer.parseInt(value));
            }
            if (mCount == 3) {
                mPasscode.setFourthNumber(Integer.parseInt(value));
            }
            if (mPasscode.isActive()) {
                Toast.makeText(getContext(),"Passcode number is : " + mPasscode.getCode() , Toast.LENGTH_SHORT).show();
            }
            mCount++;
        }
    };
}
