package com.ricardomorarey.examplemvpdaggerretrofit.root;

import com.ricardomorarey.examplemvpdaggerretrofit.LoginActivity;
import com.ricardomorarey.examplemvpdaggerretrofit.http.TwitchModule;
import com.ricardomorarey.examplemvpdaggerretrofit.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class, TwitchModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);
}
