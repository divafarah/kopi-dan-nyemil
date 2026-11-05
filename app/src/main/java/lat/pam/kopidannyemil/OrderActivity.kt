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

        val userPreferences = UserPreferences(this)

        val savedPreferences = getSharedPreferences(
            "KopiDanNyemil",
            MODE_PRIVATE
        )

        val item = intent.getStringExtra("item") ?: "Pesanan"
        val price = intent.getIntExtra("price", 0)

        val recipient = savedPreferences.getString("recipient", "") ?: ""
        val address = savedPreferences.getString("address", "") ?: ""
        val detail = savedPreferences.getString("detail", "") ?: ""

        tvGreeting.text = "Halo, ${userPreferences.getName()}!"

        val formattedPrice = "Rp %,d".format(price)

        tvSummary.text = """
            Terima kasih sudah memesan di Kopi dan Nyemil!

            Produk: $item
            Total: $formattedPrice

            Penerima: $recipient
            Alamat: $address
            Patokan: $detail

            Pesanan kamu sedang diproses ♡
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