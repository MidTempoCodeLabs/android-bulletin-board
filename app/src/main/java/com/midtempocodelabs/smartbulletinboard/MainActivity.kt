package com.midtempocodelabs.smartbulletinboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.midtempocodelabs.smartbulletinboard.databinding.ActivityMainBinding
import com.midtempocodelabs.smartbulletinboard.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var rootElement: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        rootElement = inflate(layoutInflater)
        val view = rootElement.root
        setContentView(view)
        initViews()
    }

    private fun initViews() {

        val toggle = ActionBarDrawerToggle(
            this,
            rootElement.drawerLayout,
            rootElement.mainContent.toolbar,
            R.string.open,
            R.string.close
        )
        rootElement.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        rootElement.navview.setNavigationItemSelectedListener(this)
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

        rootElement.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}