package com.zaduban.cfolio.login.usecase

import android.content.ContentValues
import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

import com.zaduban.cfolio.login.model.LoginModel

class LoginUseCaseImpl: LoginUseCase {
    private lateinit var auth: FirebaseAuth
    private lateinit var baseContext: Context


    override fun userLogin(payload: LoginModel) {
        auth.signInWithEmailAndPassword(payload.email, payload.password).addOnCompleteListener {
                task -> if (task.isSuccessful){
            Log.d(ContentValues.TAG, "sign in with email successful")
        }
        else {
            Log.w(ContentValues.TAG, "sign in wasnt successful")
            Toast.makeText(baseContext, "Authentication failed.",
                Toast.LENGTH_SHORT).show()
        }
        }
    }
}