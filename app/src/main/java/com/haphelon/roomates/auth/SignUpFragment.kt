package com.haphelon.roomates.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.haphelon.roomates.R

class SignUpFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_sign_up, container, false)
        view.findViewById<Button>(R.id.btn_register).setOnClickListener {
            validateParams(view)
        }
        return view;
    }

    @Throws(Exception::class)
    fun validateParams(view: View): Boolean {
        val userName: EditText = view.findViewById(R.id.etUsername)
        val email: EditText = view.findViewById(R.id.etEmail)
        val password: EditText = view.findViewById(R.id.etPassword)
        val passwordConfirm: EditText = view.findViewById(R.id.etPasswordConfirm)

        if (userName.text.toString() == "") {
            userName.error = "Username cannot be empty!"
            return false
        }
        if (email.text.toString() == "") {
            email.error = "Email cannot be empty!"
            return false
        }
        if (password.text.toString() == "") {
            password.error = "Password cannot be empty!"
            return false
        }
        if (passwordConfirm.text.toString() == "") {
            passwordConfirm.error = "Password Confirm cannot be empty!"
            return false
        }
        if (password.text.toString() != passwordConfirm.text.toString()) {
            passwordConfirm.error = "Password Confirm cannot be empty!"
            return false
        }
        return true
    }

}
