package lat.pam.kopidannyemil

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val preferences = UserPreferences(this)

        val tvGreeting = findViewById<TextView>(R.id.tvProfileGreeting)
        val etName = findViewById<EditText>(R.id.etProfileName)
        val btnSave = findViewById<Button>(R.id.btnSaveProfile)

        val navHome = findViewById<Button>(R.id.navHome)
        val navOrder = findViewById<Button>(R.id.navOrder)
        val navProfile = findViewById<Button>(R.id.navProfile)

        tvGreeting.text = "Halo, ${preferences.getName()}!"
        etName.setText(preferences.getName())

        btnSave.setOnClickListener {
            val newName = etName.text.toString().trim()

            if (newName.isEmpty()) {
                Toast.makeText(
                    this,
                    "Nama tidak boleh kosong!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                preferences.saveUser(
                    newName,
                    preferences.getUsername(),
                    preferences.getPassword()
                )

                tvGreeting.text = "Halo, $newName!"

                Toast.makeText(
                    this,
                    "Profile berhasil disimpan!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        navHome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        navOrder.setOnClickListener {
            startActivity(Intent(this, AddressActivity::class.java))
        }

        navProfile.setOnClickListener {
            // Tetap berada di halaman Profile
        }
    }
}
