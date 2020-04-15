package com.ricardomorarey.examplemvpdaggerretrofit.login;

public interface LoginRepository {

    void saveUser(User user);

    User getUser();
}
