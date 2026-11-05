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

        val userPreferences = UserPreferences(this)

        val tvHomeName = findViewById<TextView>(R.id.tvHomeName)
        tvHomeName.text = "Halo, ${userPreferences.getName()}!"

        val savedPreferences = getSharedPreferences(
            "KopiDanNyemil",
            MODE_PRIVATE
        )

        val showOrderButtons = savedPreferences.getBoolean(
            "showOrderButtons",
            false
        )

        val menuItems = listOf(
            Triple("Kopi Susu Gula Aren", 22000, R.id.menu1),
            Triple("Donat Cokelat", 12000, R.id.menu2),
            Triple("Sourdough Loaf", 35000, R.id.menu3),
            Triple("Cappuccino", 25000, R.id.menu4),
            Triple("Matcha Latte", 27000, R.id.menu5),
            Triple("French Fries", 15000, R.id.menu6),
            Triple("Mojito", 18000, R.id.menu7),
            Triple("Pisang Goreng", 15000, R.id.menu8),
            Triple("Teh Manis", 8000, R.id.menu9)
        )

        for (item in menuItems) {

            val menuView = findViewById<View>(item.third)

            val orderButton = Button(this).apply {
                text = "PESAN"
                textSize = 12f
                isAllCaps = false
                setTextColor(getColor(R.color.white))
                backgroundTintList = getColorStateList(R.color.strawberry_dark)
            }

            if (showOrderButtons) {
                (menuView as android.view.ViewGroup).addView(orderButton)

                orderButton.setOnClickListener {

                    val intent = Intent(this, OrderActivity::class.java)
                    intent.putExtra("item", item.first)
                    intent.putExtra("price", item.second)
                    startActivity(intent)
                }
            }
        }

        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        navHome.setOnClickListener {
            // Tetap di Home
        }

        navOrder.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }

        navProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
