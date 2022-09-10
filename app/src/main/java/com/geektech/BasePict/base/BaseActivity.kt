package com.geektech.BasePict.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding,VM: BaseViewModel> : AppCompatActivity() {

    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    abstract fun inflateVB(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateVB()
        setContentView(binding.root)

        checkInternet()
        initViews()
        initViewModel()
        initListener()
    }

    open fun checkInternet() {} // Метод для проверки интернета
    open fun initViews() {}
    open fun initListener() {}
    open fun initViewModel() {} // Все обзерверы нашего viewModel'a
}