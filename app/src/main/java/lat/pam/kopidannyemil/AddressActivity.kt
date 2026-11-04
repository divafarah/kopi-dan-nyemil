package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddressActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)

        val etRecipient = findViewById<EditText>(R.id.etRecipient)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val etDetail = findViewById<EditText>(R.id.etDetail)
        val btnOrderSend = findViewById<Button>(R.id.btnOrderSend)

        val preferences = getSharedPreferences(
            "KopiDanNyemil",
            MODE_PRIVATE
        )

        val selectedItem = intent.getStringExtra("item") ?: "Pesanan"
        val selectedPrice = intent.getIntExtra("price", 0)

        etRecipient.setText(preferences.getString("recipient", ""))
        etAddress.setText(preferences.getString("address", ""))
        etDetail.setText(preferences.getString("detail", ""))

        btnOrderSend.setOnClickListener {

            val recipient = etRecipient.text.toString().trim()
            val address = etAddress.text.toString().trim()
            val detail = etDetail.text.toString().trim()

            if (recipient.isEmpty() || address.isEmpty() || detail.isEmpty()) {
                Toast.makeText(
                    this,
                    "Semua alamat pengiriman harus diisi!",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                preferences.edit()
                    .putString("recipient", recipient)
                    .putString("address", address)
                    .putString("detail", detail)
                    .apply()

                val orderIntent = Intent(this, OrderActivity::class.java)

                orderIntent.putExtra("item", selectedItem)
                orderIntent.putExtra("price", selectedPrice)
                orderIntent.putExtra("recipient", recipient)
                orderIntent.putExtra("address", address)
                orderIntent.putExtra("detail", detail)

                startActivity(orderIntent)
            }
        }
    }
}
