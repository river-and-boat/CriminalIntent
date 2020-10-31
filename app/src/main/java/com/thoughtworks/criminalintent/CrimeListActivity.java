package com.thoughtworks.criminalintent;

import androidx.fragment.app.Fragment;

import com.thoughtworks.criminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
