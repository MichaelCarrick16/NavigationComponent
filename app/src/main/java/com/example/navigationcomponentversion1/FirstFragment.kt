package com.example.navigationcomponentversion1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.frag_first.*

class FirstFragment : Fragment() {
    private lateinit var mView : View

    companion object{
        var KEY_BUNDLE = "KEY_BUNDLE"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mView = inflater.inflate(R.layout.frag_first,container,false)
        return mView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var controller = findNavController()

        bt_open_secondfragment.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var bundle : Bundle = Bundle()
                bundle.putSerializable(KEY_BUNDLE,UserModel("Pham Dinh Hiep","Thai Binh"))
                controller.navigate(R.id.secondFragment,bundle)
            }

        })

        bt_open_thirdfragment.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {
                controller.navigate(R.id.thirdFragment)
            }

        })
    }


}