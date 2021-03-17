package com.bignerdranch.android.mymusic.ui.my_music

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bignerdranch.android.mymusic.R

class MyMusicFragment : Fragment() {

private lateinit var myMusicViewModel: MyMusicViewModel

override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
): View? {

  myMusicViewModel = ViewModelProvider(this).get(MyMusicViewModel::class.java)
  val root = inflater.inflate(R.layout.fragment_my_music, container, false)
  val textView: TextView = root.findViewById(R.id.text_my_music)
  myMusicViewModel.text.observe(viewLifecycleOwner, Observer {
    textView.text = it
  })
  return root
}

}