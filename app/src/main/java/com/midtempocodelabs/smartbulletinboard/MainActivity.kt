package com.midtempocodelabs.smartbulletinboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_content.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.id_ad_my_ads -> {
                Toast.makeText(this, "Pressed id_ad_my_ads", Toast.LENGTH_LONG).show()
            }
            R.id.id_ad_car -> {
                Toast.makeText(this, "Pressed id_ad_car", Toast.LENGTH_LONG).show()
            }
            R.id.id_ad_pc -> {
                Toast.makeText(this, "Pressed id_ad_pc", Toast.LENGTH_LONG).show()
            }
            R.id.id_ad_smartphone -> {
                Toast.makeText(this, "Pressed id_ad_smartphone", Toast.LENGTH_LONG).show()
            }
            R.id.id_ad_ha -> {
                Toast.makeText(this, "Pressed id_ad_ha", Toast.LENGTH_LONG).show()
            }
            R.id.id_ac_sign_in -> {
                Toast.makeText(this, "Pressed id_ac_sign_in", Toast.LENGTH_LONG).show()
            }
            R.id.id_ac_sign_up -> {
                Toast.makeText(this, "Pressed id_ac_sign_up", Toast.LENGTH_LONG).show()
            }
            R.id.id_ac_sign_out -> {
                Toast.makeText(this, "Pressed id_ac_sign_out", Toast.LENGTH_LONG).show()
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}