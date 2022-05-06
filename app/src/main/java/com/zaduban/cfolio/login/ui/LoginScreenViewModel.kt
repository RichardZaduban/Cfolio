package com.zaduban.cfolio.login.ui

import androidx.lifecycle.ViewModel
import com.zaduban.cfolio.login.model.LoginModel
import com.zaduban.cfolio.login.usecase.LoginUseCase


class LoginScreenViewModel(private val useCase: LoginUseCase) : ViewModel() {

     fun login(payload: LoginModel) {
        useCase.userLogin(payload)
    }


}

