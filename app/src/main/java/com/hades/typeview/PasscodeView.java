package com.hades.typeview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.hades.typeview.databinding.ViewPasscodeBinding;


public class PasscodeView extends ConstraintLayout {

    protected ViewPasscodeBinding binding;

    public PasscodeView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PasscodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize(context);
    }

    private void initialize(Context context) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.view_passcode,this,true);
    }

}
