package com.example.tugas.View

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tugas.R

class Profile : Fragment(), View.OnClickListener {
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    private fun findViewById(profile: Int): TextView {
        return TODO("Provide the return value")
    }



    private fun finish() {
        TODO("Not yet implemented")
    }

    private fun setResult(resultOk: Int, intent: Intent) {
        TODO("Not yet implemented")
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }


}

private fun TextView.setOnClickListener(profile: Profile) {
    TODO("Not yet implemented")
}
