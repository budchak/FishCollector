package com.yaroshevich.fishcollector.di.component;


import com.yaroshevich.fishcollector.di.module.NewTrophyScreenModule;
import com.yaroshevich.fishcollector.di.spore.FragmentSpore;
import com.yaroshevich.fishcollector.model.Trophy;
import com.yaroshevich.fishcollector.ui.newTrophy.NewTrophyFragment;

import dagger.Subcomponent;


@Subcomponent(modules = {NewTrophyScreenModule.class})
@FragmentSpore
public interface NewTrophyScreenComponent {
    void inject(NewTrophyFragment fragment);
}
