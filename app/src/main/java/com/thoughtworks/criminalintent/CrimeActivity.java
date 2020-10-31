package com.thoughtworks.criminalintent;

import androidx.fragment.app.Fragment;

import com.thoughtworks.criminalintent.fragment.CrimeFragment;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}