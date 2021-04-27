package tech.hashincludebrain.tabexample;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/**
 * Created by Priyabrata Naskar on 25-04-2021.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int numberOfTabs;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior, int numberOfTabs) {
        super(fm, behavior);
        this.numberOfTabs = numberOfTabs;
    }

    /**
     * Constructor
     * @param supportFragmentManager
     * @param tabCount
     */
    public PagerAdapter(FragmentManager supportFragmentManager, int tabCount) {
        super(supportFragmentManager, tabCount);
        this.numberOfTabs = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new SuggestedFragment();
            case 1: return new BusinessFragment();
            case 2: return new TechnologyFragment();
            case 3: return new GeneralFragment();
            case 4: return new EntertainmentFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
