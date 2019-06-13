package com.example.ubermaid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Page_Adapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public Page_Adapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Tela_Cadastro_Passo1 tab1 = new Tela_Cadastro_Passo1();
                return tab1;
            case 1:
                Tela_Cadastro_Passo2 tab2 = new Tela_Cadastro_Passo2();
                return tab2;
            case 2:
                Tela_Cadastro_Passo3 tab3 = new Tela_Cadastro_Passo3();
                return tab3;
            case 3:
                Tela_Cadastro_Passo4 tab4 = new Tela_Cadastro_Passo4();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}