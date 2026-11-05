package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<TextView>(R.id.tvHomeName).text = "Pilih Menu"

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
            val card = findViewById<LinearLayout>(item.third)

            val content = card.getChildAt(1) as? LinearLayout
                ?: continue

            card.layoutParams = card.layoutParams.apply {
                height = ViewGroup.LayoutParams.WRAP_CONTENT
            }

            val button = Button(this)
            button.text = "PESAN"
            button.textSize = 12f
            button.isAllCaps = true
            button.setTextColor(getColor(R.color.white))
            button.backgroundTintList =
                getColorStateList(R.color.strawberry_dark)

            button.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                42.dp
            ).apply {
                topMargin = 5.dp
            }

            button.setOnClickListener {
                val intent = Intent(this, OrderActivity::class.java)
                intent.putExtra("item", item.first)
                intent.putExtra("price", item.second)
                startActivity(intent)
            }

            content.addView(button)
        }

        val root = findViewById<ViewGroup>(android.R.id.content)
            .getChildAt(0) as ViewGroup

        if (root.childCount > 1) {
            root.getChildAt(1).visibility = View.GONE
        }
    }

    private val Int.dp: Int
        get() = (this * resources.displayMetrics.density).toInt()
}