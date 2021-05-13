package com.kimtech.kimtechwhatsapp;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessAdopter extends FragmentPagerAdapter {
    public TabAccessAdopter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 : {
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            }
            case 1 : {
                GroupFragment groupFragment=new GroupFragment();
                return groupFragment;
            }
            case 2 : {
                ContactFragment contactFragment=new ContactFragment();
                return contactFragment;
            }
            case 3 : {
                FriendRequestFragment friendRequestFragment=new FriendRequestFragment();
                return friendRequestFragment;
            }

            default: return  null;
        }


    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0 : {
                return "Chat";
            }
            case 1 : {
                return "Group";
            }
            case 2 : {
                return "Contact";
            }
            case 3 : {
                return "Friends Request";
            }
            default: return  null;
        }
    }
}
