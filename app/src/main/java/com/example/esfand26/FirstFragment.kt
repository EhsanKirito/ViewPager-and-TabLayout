package com.example.esfand26

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

object Ehsan{
    const val ARG_OBJECT = "object"
}

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.takeIf { it.containsKey(Ehsan.ARG_OBJECT)
        }?.apply {
            view.findViewById<TextView>(R.id.txtId).text = getString(Ehsan.ARG_OBJECT)
        }

    }
}