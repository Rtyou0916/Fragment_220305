package com.example.fragment_220305.fragmetns

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragment_220305.R
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false )
    }

    // 프래그먼트에서 동작 관련 코드 별도로 오버라이드

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnLoginFragment.setOnClickListener {

            Log.d("프래그먼트", "첫번째 프래그먼트에서 로그찍기")


        }


    }



}