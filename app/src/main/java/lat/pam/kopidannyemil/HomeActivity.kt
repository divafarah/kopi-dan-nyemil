package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val preferences = UserPreferences(this)

        val tvHomeName = findViewById<TextView>(R.id.tvHomeName)
        tvHomeName.text = "Halo, ${preferences.getName()}!"

        val menuItems = listOf(
            Triple("Kopi Susu Gula Aren", 22000, R.id.menu1),
            Triple("Donat Cokelat", 12000, R.id.menu2),
            Triple("Sourdough Loaf", 35000, R.id.menu3),
            Triple("Cappuccino", 25000, R.id.menu4),
            Triple("Matcha Latte", 27000, R.id.menu5)
        )

        for (item in menuItems) {
            val menuView = findViewById<View>(item.third)

            menuView.setOnClickListener {
                val intent = Intent(this, AddressActivity::class.java)
                intent.putExtra("item", item.first)
                intent.putExtra("price", item.second)
                startActivity(intent)
            }
        }

        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        navHome.setOnClickListener {
            // Tetap berada di halaman Home
        }

        navOrder.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }

        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
