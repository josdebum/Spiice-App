package com.example.spiiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_navigation_screen.*

class NavigationScreen : AppCompatActivity() {

    private lateinit var homeFragment:HomeFragment
    private lateinit var searchFragment: SearchFragment
    private lateinit var messageFragment: MessageFragment
    private lateinit var profileFragment: ProfileFragment
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_screen)
        bottomNavigationView = findViewById(R.id.bottomNav)

        homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.frame_container, homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_dashboard -> {
                    homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.menu_profile -> {
                    searchFragment = SearchFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, searchFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.menu_innovation -> {
                    messageFragment = MessageFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, searchFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.menu_inventions -> {
                    profileFragment = ProfileFragment()
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                
            }
        }

    }}
