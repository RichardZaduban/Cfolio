package com.zaduban.cfolio.register.usecase

import com.zaduban.cfolio.register.model.RegisterModel

interface RegisterUseCase {
    fun submitRegister(payload: RegisterModel)
}