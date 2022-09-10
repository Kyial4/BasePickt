package com.geektech.BasePict.ui


import android.provider.Contacts.SettingsColumns.KEY
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.BasePict.base.BaseFragment
import com.geektech.BasePict.base.BaseViewModel
import com.geektech.BasePict.databinding.FragmentPicksBinding


class PicksFragment : BaseFragment<FragmentPicksBinding, BaseViewModel>() {

    private val picsAdapter = Adapter()
    override val viewModel: PicksViewModel by lazy {
        ViewModelProvider(requireActivity())[PicksViewModel::class.java]
    }

    override fun inflateVB(layoutInflater: LayoutInflater): FragmentPicksBinding {
        return FragmentPicksBinding.inflate(layoutInflater)
    }

    override fun checkInternet() {
    }

    override fun initViews() {
        binding.recyclerResult.adapter = picsAdapter
        val argument = arguments?.getStringArrayList(com.geektech.BasePict.Const.KEY)
        argument?.let { picsAdapter.addData(it) }
    }

    override fun initViewModel() {
    }

    override fun initListener() {

    }

    override fun onDestroy() {
        super.onDestroy()
        val argument = arguments?.getStringArrayList(com.geektech.BasePict.Const.KEY)
        argument?.clear()
    }


}