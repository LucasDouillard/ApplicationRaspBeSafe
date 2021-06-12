package com.example.applicationraspbesafe.ui

import android.content.Context
import android.os.Bundle
import android.os.Message
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.applicationraspbesafe.MainActivity
import com.example.applicationraspbesafe.R

class MessageFragment(
    private val context: MainActivity
) : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater?.inflate(R.layout.message_page, container,false)

        //recuperer le bouton confirmer
        val confirmButton= view.findViewById<Button>(R.id.bt_send)
        confirmButton.setOnClickListener{ sendForm(view)}
        return view

    }

    private fun sendForm(view: View) {
        val Name = view.findViewById<EditText>(R.id.et_name).text.toString()
        val Email = view.findViewById<EditText>(R.id.et_email).text.toString()
        val  Message = view.findViewById<EditText>(R.id.et_message).text.toString()


    }


}