package com.example.luqidswipeanimation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class Adapter extends FragmentPagerAdapter {

    public Adapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch(position )
        {
            case 0: return new FragmentA();
            case 1: return new FragmentB();
            case 2: return new FragmentC();
            case 3: return new FrgamentD.FragmentD();

        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
