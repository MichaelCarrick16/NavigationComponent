package com.example.navigationcomponentversion1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    private lateinit var mView : View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.frag_second,container,false)
        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bundle = arguments
        var userModel = bundle?.getSerializable(FirstFragment.KEY_BUNDLE) as UserModel
        Toast.makeText(context,userModel.name+"/"+userModel.address,Toast.LENGTH_SHORT).show()
    }

}