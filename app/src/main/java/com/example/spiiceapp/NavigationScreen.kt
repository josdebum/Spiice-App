package com.example.spiiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class NavigationScreen : AppCompatActivity() {

    private lateinit var homeFragment:HomeFragment
    private lateinit var searchFragment: SearchFragment
    private lateinit var messageFragment: MessageFragment
    private lateinit var profileFragment: ProfileFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_screen)

        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

    }

    }
