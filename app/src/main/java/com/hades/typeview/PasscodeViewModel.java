package com.hades.typeview;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.hades.typeview.model.Passcode;

public class PasscodeViewModel extends AndroidViewModel {

    private final LiveData<Passcode> mPasscodeLiveData;
    private ObservableField<Passcode> mObservable = new ObservableField<>();

    public PasscodeViewModel(@NonNull Application application) {
        super(application);
        mPasscodeLiveData = null;
    }

    public LiveData<Passcode> getmPasscodeLiveData() {
        return mPasscodeLiveData;
    }

    public void setPasscode(Passcode passCode) {
        mObservable.set(passCode);
    }
}
