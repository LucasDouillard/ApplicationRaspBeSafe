package com.example.applicationraspbesafe.ui

    import android.app.Dialog
    import android.os.Bundle


    import android.view.Window
    import android.widget.TextView
    import com.example.applicationraspbesafe.MainActivity
    import com.example.applicationraspbesafe.R


    class PopupContact (
        private val context: MainActivity

    ): Dialog(context){
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(R.layout.popup_contact)
            setupComponents()

        }

        private fun setupComponents() {
            val Name = findViewById<TextView>(R.id.et_name)
            val Email = findViewById<TextView>(R.id.et_email)
            val Message = findViewById<TextView>(R.id.et_message)
        }

        override fun show() {
       findViewById<TextView>(R.id.information)        }
    }