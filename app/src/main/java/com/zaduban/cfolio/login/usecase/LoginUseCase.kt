package com.zaduban.cfolio.login.usecase

import com.zaduban.cfolio.login.model.LoginModel

interface LoginUseCase {

     fun userLogin(payload: LoginModel)
}