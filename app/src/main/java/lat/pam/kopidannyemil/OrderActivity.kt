package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvGreeting = findViewById<TextView>(R.id.tvOrderGreeting)
        val tvSummary = findViewById<TextView>(R.id.tvOrderSummary)
        val btnOk = findViewById<Button>(R.id.btnOrderOk)

        val preferences = UserPreferences(this)

        val item = intent.getStringExtra("item") ?: "Pesanan"
        val price = intent.getIntExtra("price", 0)
        val recipient = intent.getStringExtra("recipient") ?: ""
        val address = intent.getStringExtra("address") ?: ""
        val detail = intent.getStringExtra("detail") ?: ""

        tvGreeting.text = "Halo, ${preferences.getName()}!"

        val formattedPrice = "Rp %,d".format(price)

        tvSummary.text = """
            Produk: $item
            Total: $formattedPrice

            Penerima: $recipient
            Alamat: $address
            Patokan: $detail
        """.trimIndent()

        btnOk.setOnClickListener {
            val homeIntent = Intent(this, HomeActivity::class.java)
            homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or
                    Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(homeIntent)
            finish()
        }
    }
}