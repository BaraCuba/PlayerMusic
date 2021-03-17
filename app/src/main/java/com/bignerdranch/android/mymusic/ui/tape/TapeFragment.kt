package com.bignerdranch.android.mymusic.ui.tape

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bignerdranch.android.mymusic.R

class TapeFragment : Fragment() {

  private lateinit var tapeViewModel: TapeViewModel

  override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {

    tapeViewModel = ViewModelProvider(this).get(TapeViewModel::class.java)
    val root = inflater.inflate(R.layout.fragment_tape, container, false)
    val textView: TextView = root.findViewById(R.id.text_tape)
    tapeViewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })
    return root
  }

}