package com.srivatsa.bottomnavigationmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //creating fragments objects
    lateinit var homeFragment: homeFragment
    lateinit var favFragment: favFragment
    lateinit var profileFragment: profileFragment
    lateinit var settingsFragment: settingsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creating different fragments
        //adding menu event listener

        //setting default fragment
        homeFragment= homeFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.framelayout,homeFragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()

        bottomNavView.setOnNavigationItemSelectedListener { item->
            when(item.itemId){
                R.id.home->{
                    homeFragment= homeFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,homeFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.fav->{
                    favFragment= favFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,favFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }

                R.id.profile->{
                    profileFragment= profileFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,profileFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }
                R.id.settings->{
                    settingsFragment= settingsFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.framelayout,settingsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit()
                }



            }
            true
        }





    }
}
