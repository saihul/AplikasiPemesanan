package com.example.aplikasipemesanan.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.fragment.DataFragment;
import com.example.aplikasipemesanan.fragment.HubungiFragment;
import com.example.aplikasipemesanan.fragment.MenuFragment;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private static final int[]TAB_TITLES=new int[]{R.string.menu_fragment,R.string.data_fragment, R.string.hubungi_fragment};
    private final Context tabContext;

    public SectionsPagerAdapter(@NonNull @org.jetbrains.annotations.NotNull FragmentManager fm, Context context) {
        super(fm);
        this.tabContext = context;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch ( position ){
            case 0 :
                return new MenuFragment();
            case 1 :
                return new DataFragment();
            case 2 :
                return new HubungiFragment();
            default:
                return new Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int positions){
        return tabContext.getString(TAB_TITLES[positions]);
    }
}
