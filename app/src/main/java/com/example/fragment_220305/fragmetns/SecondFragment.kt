package com.example.fragment_220305.fragmetns

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragment_220305.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        return inflater.inflate(R.layout.fragment_second,container,false)
//        루트까지 가는거 아니다, 컨테이너에까지 넣는다

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnToastFrament.setOnClickListener {
            Toast.makeText(requireContext(), "토스트 띄우기", Toast.LENGTH_SHORT).show()

        }



    }


}


