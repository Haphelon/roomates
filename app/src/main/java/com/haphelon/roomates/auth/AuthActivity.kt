package com.haphelon.roomates.auth

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.haphelon.roomates.R

class AuthActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
        /*FirebaseApp.initializeApp(this)
        FirebaseApp.*/
    }

    override fun onStart() {
        super.onStart()
        /*auth = FirebaseAuth.getInstance()*/
    }

    fun goToSignUp(view: View) {
        view.findNavController().navigate(R.id.goToSignUp)
    }
}
