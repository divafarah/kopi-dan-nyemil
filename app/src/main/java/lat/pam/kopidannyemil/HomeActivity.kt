package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val userPreferences = UserPreferences(this)

        val tvHomeName = findViewById<TextView>(R.id.tvHomeName)
        tvHomeName.text = "Halo, ${userPreferences.getName()}!"

        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        navHome.setOnClickListener {
        }

        navOrder.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }

        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}