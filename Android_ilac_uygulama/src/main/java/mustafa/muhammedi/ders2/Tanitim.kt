package mustafa.muhammedi.ders2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import mustafa.muhammedi.ders2.databinding.ActivityMainBinding
import mustafa.muhammedi.ders2.databinding.ActivityTanitimBinding

class Tanitim : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val gelenintent = intent
        //gelenintent.getSerializableExtra("sicilenveri",Paramedik::class.java)
        val sicilenveri = gelenintent.getSerializableExtra("sicilenveri") as Paramedik

        binding.imagegorsel.setImageResource(sicilenveri.gorsel)
        binding.adtext.text=sicilenveri.ilacad
        binding.formutext.text=sicilenveri.formulasyon
        binding.kullanimtext.text=sicilenveri.endikasyon
        binding.dozajtext.text=sicilenveri.dozaj
        binding.faydatext.text=sicilenveri.faydalar
        binding.zarartext.text=sicilenveri.yanetkiler
    }
}