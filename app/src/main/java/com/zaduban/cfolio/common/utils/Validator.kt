package com.zaduban.cfolio.common.utils

import java.util.regex.Pattern

class Validator {

    fun isBlank(input: List<String>): Boolean {
        return when (input.contains("")) {
            true -> true
            false -> false
        }
    }

    fun isEmailValid(input: String): Boolean {
        val emailPattern = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        return emailPattern.matcher(input).matches()
    }

    fun isPasswordMatched(password: String, retypePassword: String): Boolean {
        return when (retypePassword == password){
            true -> true
            false -> false
        }
    }
}