package com.zaduban.cfolio.login.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.zaduban.cfolio.R
import com.zaduban.cfolio.login.model.LoginModel

class LoginScreen : Fragment() {

    private var navController: NavController? = null
    private val registerLink: TextView? = view?.findViewById(R.id.dontHaveAccount)
    private val loginBtn: Button? = view?.findViewById(R.id.cardLoginButton)
    private val emailInput: EditText? = view?.findViewById(R.id.editTextEmail)
    private val passwordInput: EditText? = view?.findViewById(R.id.editTextEmail)


    private lateinit var viewModel: LoginScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("LoginScreen", "on createView")
        return inflater.inflate(R.layout.login_screen
            , container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LoginScreen", "on viewCreated")
        navController = tryFindNavController(view)
        if (navController != null) {
            print("nav controller found")
            Log.d("Onviewcreated", "navcontroeller")
        }

        initView()

    }

    private fun initView() {

        registerLink?.setOnClickListener(linkListener)
        loginBtn?.setOnClickListener(buttonListener)

    }

    private fun clickOnText(view: View) {
        registerLink?.setOnClickListener(linkListener)

    }

    private val linkListener = View.OnClickListener {
        val navigationController = tryFindNavController(view)
        Log.d("InitView, onclick", "register link clicked")
        navigationController?.navigate(R.id.action_login_to_register)

    }

    private val buttonListener = View.OnClickListener{
        Log.d("InitView, onclick", "button clicked")
        var payload = LoginModel(emailInput?.text.toString(), passwordInput?.text.toString())
        viewModel.login(payload)
    }

    private fun tryFindNavController(view: View?): NavController? {
        try {
            return view?.findNavController()
        } catch (ex: Exception) {
        }
        return null
    }



}


