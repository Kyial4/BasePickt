package com.geektech.BasePict.main

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.geektech.BasePict.Const.KEY
import com.geektech.BasePict.R
import com.geektech.BasePict.base.BaseFragment
import com.geektech.BasePict.base.BaseViewModel
import com.geektech.BasePict.databinding.FragmentMainBinding
import com.geektech.BasePict.ui.Image

class MainFragment :
    BaseFragment<FragmentMainBinding, BaseViewModel>() {
    private val list = ArrayList<Image>()
    private val mainAdapter = MainAdapter()

    override val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity())[MainViewModel::class.java]
    }


    override fun inflateVB(layoutInflater: LayoutInflater): FragmentMainBinding {
        return FragmentMainBinding.inflate(layoutInflater)
    }

    override fun checkInternet() {
    }

    override fun initViews() {
        binding.recyclerPics.adapter = mainAdapter

        if (list.isEmpty()){
            mainAdapter.addList(loadData())
        }
    }

    override fun initViewModel() {

    }

    override fun initListener() {
        binding.fab.setOnClickListener {
            val bundle = Bundle()
            bundle.putStringArrayList(KEY, mainAdapter.selectedList)
            setNavigate(R.id.action_mainFragment_to_picksFragment, bundle)
        }
    }

    private fun loadData(): ArrayList<Image> {
        list.apply {
            add(Image("https://www.paragonvet.com/glide-img/containers/main/julian-schiemann-g-o9lqv51qc-unsplash.jpg/7bf315f8d7c405c7676132e6784c4450.jpg",
                true))
            add(Image("https://www.paragonvet.com/glide-img/containers/main/julian-schiemann-g-o9lqv51qc-unsplash.jpg/7bf315f8d7c405c7676132e6784c4450.jpg",
                true))
            add(Image("https://www.paragonvet.com/glide-img/containers/main/julian-schiemann-g-o9lqv51qc-unsplash.jpg/7bf315f8d7c405c7676132e6784c4450.jpg",
                true))
            add(Image("https://cs5.pikabu.ru/post_img/2015/08/05/10/1438792422_803863016.jpg",
                true))
            add(Image("https://cs5.pikabu.ru/post_img/2015/08/05/10/1438792422_803863016.jpg",
                true))
            add(Image("https://cs5.pikabu.ru/post_img/2015/08/05/10/1438792422_803863016.jpg",
                true))
            add(Image("https://www.forfarmers.co.uk/bestanden/ForFarmers_2018/Nieuws/w724-37966-1/sheep_buckets.jpg",
                true))
            add(Image("https://www.forfarmers.co.uk/bestanden/ForFarmers_2018/Nieuws/w724-37966-1/sheep_buckets.jpg",
                true))
            add(Image("https://www.forfarmers.co.uk/bestanden/ForFarmers_2018/Nieuws/w724-37966-1/sheep_buckets.jpg",
                true))
            add(Image("https://thumbs.dreamstime.com/b/sheep-19034277.jpg",
                true))
            add(Image("https://thumbs.dreamstime.com/b/sheep-19034277.jpg",
                true))

        }
        return list
    }

}