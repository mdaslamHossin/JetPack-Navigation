package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This line will configure whole navigation destination in NavHost
        NavigationUI.setupWithNavController(
                toolbar,
                Navigation.findNavController(this, R.id.nav_host_fragment)
        )
        bottom_nav.setupWithNavController(Navigation.findNavController(this, R.id.nav_host_fragment))
    }


    override fun onSupportNavigateUp() =
            Navigation.findNavController(this, R.id.nav_host_fragment).navigateUp() // Back button enable method
                    || super.onSupportNavigateUp()
}
