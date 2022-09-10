package com.geektech.BasePict

import android.webkit.URLUtil
import android.widget.Toast
import com.bumptech.glide.Glide
import com.geektech.BasePict.base.BaseActivity
import com.geektech.BasePict.base.BaseViewModel
import com.geektech.BasePict.databinding.ActivityMainBinding



class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {

    override fun inflateVB(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    }