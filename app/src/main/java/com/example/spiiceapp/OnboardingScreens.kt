package com.example.spiiceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_onboarding_screens.*

class OnboardingScreens : AppCompatActivity() {


    private lateinit var screenPager: ViewPager
    private lateinit var onBoardingViewPagerAdapter: OnBoardingPagerAdapter
    private lateinit var tabIndicator: TabLayout
    private lateinit var btnNext: TextView
    private lateinit var btnPrev: TextView
    private lateinit var tvSkip: TextView
    var position = 0


    lateinit var viewModelFactory: ViewModelProvider.Factory



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_onboarding_screens)

        // init views
        btnNext = btn_next
        btnPrev = btn_prev
        tabIndicator = tab_indicator
        tvSkip = tv_skip

        val mList: ArrayList<OnBoardingItem> = arrayListOf(
            OnBoardingItem(
                "Find projects from companies \n" +
                        "everywhere in the word",
                R.drawable.bubble_1,
                R.drawable.illustration1
            ),
            OnBoardingItem(
                "Make money while working\n" +
                        "on awesome projects",
                R.drawable.bubble_2,
                R.drawable.illustration_2
            ), OnBoardingItem(
                "Chat with others freelancers\n" +
                        "and develop your network",
                R.drawable.bubble_3,
                R.drawable.illustration_3
            ),
            OnBoardingItem(
                "Work hard and level up!",
                R.drawable.bubble_4,
                R.drawable.illustration_4
            ) ,
                    OnBoardingItem(
                    "Enjoy your progess!",
            R.drawable.bubble_5,
            R.drawable.illustration_5
        )
        )


        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager)
        onBoardingViewPagerAdapter = OnBoardingPagerAdapter(this, mList)
        screenPager.adapter = onBoardingViewPagerAdapter

        // setup tablayout with viewpager
        tabIndicator.setupWithViewPager(screenPager)

        // next button click Listener
        btnNext.setOnClickListener {
            if (btnNext.text == getString(R.string.finish)) {

                startActivity(Intent(applicationContext, SignUpScreen::class.java))
            }

            position = screenPager.currentItem
            if (position < mList.size) {
                position++
                screenPager.currentItem = position
            }
            if (position == mList.size - 1) { // when we reach the last screen
                loadLastScreen()
            }
        }

        // prev button click Listener
        btnPrev.setOnClickListener {
            position = screenPager.currentItem
            if (position > 0) {
                position--
                screenPager.currentItem = position
            }
            if (position == 0) { // when we reach the first screen
                loadFirstScreen()
            }
        }

        // tablayout add change listener
        tabIndicator.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    mList.size - 1 -> {
                        loadLastScreen()
                    }
                    0 -> {
                        loadFirstScreen()
                    }
                    else -> {
                        loadOtherScreens()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}

        })

        // skip button click listener
        tvSkip.setOnClickListener {
            screenPager.currentItem = mList.size
            loadLastScreen()
        }
    }



    private fun loadLastScreen() {
        btnNext.text = getString(R.string.finish)
        tvSkip.visibility = View.INVISIBLE
        btnPrev.visibility = View.VISIBLE
        btnPrev.isEnabled = true
    }

    private fun loadFirstScreen() {
        btnPrev.visibility = View.INVISIBLE
        btnPrev.isEnabled = false
        btnNext.text = getString(R.string.next)
        tvSkip.visibility = View.VISIBLE
    }

    private fun loadOtherScreens() {
        btnPrev.visibility = View.VISIBLE
        btnPrev.isEnabled = true
        btnNext.text = getString(R.string.next)
        tvSkip.visibility = View.VISIBLE
    }


}