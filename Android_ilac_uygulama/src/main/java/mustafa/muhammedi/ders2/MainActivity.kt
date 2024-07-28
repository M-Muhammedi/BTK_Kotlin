package mustafa.muhammedi.ders2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import mustafa.muhammedi.ders2.databinding.ActivityMainBinding
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ParamedikListesi : ArrayList<Paramedik>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val Adrenalin = Paramedik("Adrenalin (Epinefrin)","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Anafilaksi (şiddetli alerjik reaksiyon)\n" +
                    "2- Kardiyak arrest (kalp durması)\n" +
                    "3- Astım krizi (ağır bronkospazm)\n" +
                    "4- Ciddi hipotansiyon (düşük kan basıncı)\n" +
                    "5- Septik şok",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Anafilaksi: 0.3-0.5 mg intramüsküler (IM) veya subkutan (SC), gerektiğinde her 5-15 dakikada bir tekrarlanabilir.\n" +
                    "2- Kardiyak arrest: 1 mg intravenöz (IV) veya intraosseöz (IO), her 3-5 dakikada bir tekrarlanabilir.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-12 yaş: Anafilaksi: 0.01 mg/kg (maksimum 0.3 mg) IM veya SC, gerektiğinde her 5-15 dakikada bir tekrarlanabilir.)\n" +
                    "2- ( 12-17 yaş: Anafilaksi: 0.3 mg IM veya SC, gerektiğinde her 5-15 dakikada bir tekrarlanabilir.)\n" +
                    "3- ( 0-17 yaş: Kardiyak arrest: 0.01 mg/kg (maksimum 1 mg) IV veya IO, her 3-5 dakikada bir tekrarlanabilir.)",
            "Faydaları: Hızlı etki ederek hayat kurtarıcı olabilir.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Hızlı kalp atışı (taşikardi)\n" +
                    "2- Yüksek tansiyon (hipertansiyon)\n" +
                    "3- Titreme\n" +
                    "4- Baş ağrısı\n" +
                    "5- Anksiyete\n" +
                    "6- Bulantı ve kusma\n" +
                    "7- Göğüs ağrısı",R.drawable.adrenalin)

        val Atropin = Paramedik("Atropin","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Bradikardi (düşük kalp hızı)\n" +
                    "2- Organofosfat veya karbamat zehirlenmesi\n" +
                    "3- Premedikasyon (cerrahi veya tıbbi prosedürler öncesi)\n" +
                    "4- Antikolinerjik zehirlenmeler",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Bradikardi (düşük kalp hızı): 0.5-1 mg intravenöz (IV) her 3-5 dakikada bir, maksimum toplam doz 3 mg.\n" +
                    "2- Organofosfat zehirlenmesi: 2-6 mg IV, IM veya subkutan (SC), gerektiğinde her 5-60 dakikada bir, belirtiler düzelene kadar tekrarlanabilir.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-12 yaş: Bradikardi: 0.02 mg/kg IV, minimum doz 0.1 mg, maksimum tek doz 0.5 mg, gerektiğinde her 3-5 dakikada bir tekrarlanabilir, maksimum toplam doz 1 mg.)\n" +
                    "2- ( 12-17 yaş: Bradikardi: 0.02 mg/kg IV, minimum doz 0.1 mg, maksimum tek doz 1 mg, gerektiğinde her 3-5 dakikada bir tekrarlanabilir, maksimum toplam doz 3 mg.)\n" +
                    "3- ( 0-17 yaş: Organofosfat zehirlenmesi: 0.05-0.1 mg/kg IV, IM veya SC, gerektiğinde her 5-60 dakikada bir tekrarlanabilir, belirtiler düzelene kadar.)","Faydaları: Kalp hızını artırır, zehirlenmelerde etkili olabilir.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Ağız kuruluğu\n" +
                    "2- Bulanık görme\n" +
                    "3- İdrar retansiyonu\n" +
                    "4- Kabızlık\n" +
                    "5- Taşikardi (hızlı kalp atışı)\n" +
                    "6- Baş ağrısı\n" +
                    "7- Sersemlik",R.drawable.atropin)

        val Aspirin = Paramedik("Aspirin","Formülasyon: Tablet.",
            "\nEndikasyon:\n" +
                    "\n"+
                "1- Akut koroner sendrom (kalp krizi)\n" +
                "2- Angina (göğüs ağrısı)\n" +
                "3- Ateş ve hafif-orta şiddette ağrı (sadece yetişkinlerde)\n" +
                "4- Romatizmal ateş ve diğer inflamatuar durumlar (sadece yetişkinlerde)",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Akut koroner sendrom (kalp krizi): 160-325 mg çiğnenir veya yutulur.\n" +
                    "2- Ağrı, ateş, iltihap: 325-650 mg oral her 4-6 saatte bir, maksimum günlük doz 4 g.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-18 yaş: Aspirin genellikle çocuklarda kullanılmaz. Çocuklarda aspirin kullanımı Reye sendromu riskinden dolayı önerilmez.)",
            "Faydaları: Kan pıhtılaşmasını önler.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Mide kanaması ve gastrointestinal ülserler\n" +
                    "2- Alerjik reaksiyonlar (deri döküntüleri, anjiyoödem, bronkospazm)\n" +
                    "3- Mide bulantısı ve kusma\n" +
                    "4- Karaciğer ve böbrek fonksiyonlarında bozulma (uzun süreli kullanımlarda)\n" +
                    "5- Tinnitus (kulak çınlaması) ve işitme kaybı (yüksek dozlarda)\n" +
                    "6- Reye sendromu (çocuklarda, aspirin kullanımı ile ilişkili ciddi bir durum)",R.drawable.aspirin)

        val Nitrogliserin = Paramedik("Nitrogliserin","Formülasyon: Dil altı tablet veya sprey.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Akut angina pektoris (göğüs ağrısı)\n" +
                    "2- Akut miyokard infarktüsü (kalp krizi)\n" +
                    "3- Kronik stabil angina (göğüs ağrısının önlenmesi)",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Akut angina (göğüs ağrısı): 0.4 mg sublingual (dil altı) her 5 dakikada bir, maksimum 3 doz.\n" +
                    "2- Akut miyokard infarktüsü (kalp krizi): 0.4 mg sublingual her 5 dakikada bir, maksimum 3 doz; veya intravenöz olarak 5-200 mcg/dak infüzyon, hasta durumu ve yanıtına göre ayarlanır.\n" +
                    " Çocuklar:\n" +
                    "1- Nitrogliserin genellikle çocuklarda kullanılmaz. Çocuklarda kullanımı özel durumlara göre doktor kontrolünde gerçekleştirilmelidir.","Faydaları: Kan damarlarını genişleterek ağrıyı hafifletir.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Baş ağrısı\n" +
                    "2- Düşük tansiyon (hipotansiyon)\n" +
                    "3- Baş dönmesi veya bayılma\n" +
                    "4- Refleks taşikardi (hızlı kalp atışı)\n" +
                    "5- Bulantı ve kusma\n" +
                    "6- Flushing (yüzde kızarma)",R.drawable.nitrogliserin)

        val Diazepam = Paramedik("Diazepam","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Anksiyete bozuklukları\n" +
                    "2- Kas spazmları\n" +
                    "3- Status epileptikus (uzamış nöbetler)\n" +
                    "4- Sedasyon (cerrahi veya tıbbi prosedürler öncesi)\n" +
                    "5- Alkol yoksunluk belirtileri",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Anksiyete: 2-10 mg oral, 2-4 kez/gün.\n" +
                    "2- Kas spazmları: 2-10 mg oral, 3-4 kez/gün.\n" +
                    "3- Status epileptikus: 5-10 mg intravenöz veya rektal, gerektiğinde 10-15 dakika aralıklarla, maksimum 30 mg.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-6 ay: Kullanımı önerilmez.)\n" +
                    "2- ( 6 ay - 5 yaş: 0.2-0.5 mg/kg rektal, gerektiğinde 4-12 saatte bir, maksimum 5 mg/doz.)\n" +
                    "3- ( 6-12 yaş: 0.3-0.5 mg/kg rektal, gerektiğinde 4-12 saatte bir, maksimum 10 mg/doz.)\n" +
                    "4- ( 12-17 yaş: 0.1-0.2 mg/kg intravenöz, gerektiğinde 2-4 saatte bir, maksimum 10 mg/doz.)","Faydaları: Kas gevşetici ve sakinleştirici etkisi vardır.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Uyuşukluk\n" +
                    "2- Baş dönmesi\n" +
                    "3- Kas zayıflığı\n" +
                    "4- Yorgunluk\n" +
                    "5- Karışıklık ve unutkanlık (özellikle yaşlılarda)\n" +
                    "6- Solunum depresyonu (özellikle yüksek dozlarda veya diğer depresanlarla birlikte)",R.drawable.diazepam)

        val Salbutamol = Paramedik("Salbutamol (Albuterol)","Formülasyon: Nebulizer solüsyonu veya inhaler.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Akut astım krizi\n" +
                    "2- Kronik obstrüktif akciğer hastalığı (KOAH) alevlenmeleri\n" +
                    "3- Egzersiz kaynaklı bronkospazm",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Akut astım krizi: 2.5-5 mg nebülize edilerek, her 20 dakikada bir, toplam 3 doz; ardından gerekli ise her 1-4 saatte bir veya sürekli nebülizasyon.\n" +
                    "2- Kronik obstrüktif akciğer hastalığı (KOAH): 2.5 mg nebülize edilerek, gerektiğinde her 6-8 saatte bir.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-2 yaş: Genellikle nebülize salbutamol kullanılmaz; ancak gerekli ise doktor kontrolünde düşük dozlar kullanılabilir.)\n" +
                    "2- ( 2-12 yaş: Akut astım krizi: 0.15 mg/kg (maksimum 2.5 mg) nebülize edilerek, her 20 dakikada bir, toplam 3 doz; ardından gerekli ise her 1-4 saatte bir.)\n" +
                    "3- ( 12-17 yaş: Akut astım krizi: 2.5-5 mg nebülize edilerek, her 20 dakikada bir, toplam 3 doz; ardından gerekli ise her 1-4 saatte bir veya sürekli nebülizasyon.)","Faydaları: Hızlı bronkodilatasyon sağlar.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Titreme\n" +
                    "2- Hızlı kalp atışı (taşikardi)\n" +
                    "3- Baş ağrısı\n" +
                    "4- Anksiyete\n" +
                    "5- Kas krampları\n" +
                    "6- Hipokalemi (düşük potasyum seviyeleri)\n" +
                    "7- Hiperaktivite (özellikle çocuklarda)",R.drawable.salbutamol)

        val Furosemid = Paramedik("Furosemid","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Akut pulmoner ödem\n" +
                    "2- Kronik kalp yetmezliği\n" +
                    "3- Hipertansiyon\n" +
                    "4- Böbrek yetmezliği ile ilişkili ödem\n" +
                    "5- Karaciğer sirozu ile ilişkili ödem",
            "\nDozaj: \n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Akut pulmoner ödem: 20-40 mg intravenöz (IV) olarak yavaş enjeksiyon, gerektiğinde her 1-2 saatte bir doz artırılarak, maksimum toplam doz 200 mg.\n" +
                    "2- Kalp yetmezliği, hipertansiyon, ödem: 20-80 mg oral, tek doz veya bölünmüş dozlar halinde; gerektiğinde doz artırılarak.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-12 yaş: Ödem: 1-2 mg/kg oral, maksimum tek doz 6 mg/kg; gerektiğinde her 6-12 saatte bir.)\n" +
                    "2- ( 12-17 yaş: Ödem: 20-40 mg oral, gerektiğinde her 6-12 saatte bir, maksimum toplam doz 600 mg/gün.)",
            "Faydaları: Hızlı diürez sağlar.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Elektrolit dengesizlikleri (hipokalemi, hiponatremi, hipokalsemi)\n" +
                    "2- Dehidrasyon\n" +
                    "3- Düşük tansiyon (hipotansiyon)\n" +
                    "4- Böbrek fonksiyon bozuklukları\n" +
                    "5- İşitme kaybı (özellikle yüksek dozlarda)\n" +
                    "6- Baş ağrısı\n" +
                    "7- Kas krampları",R.drawable.furosemid)

        val Morfin = Paramedik("Morphine (Morfin)","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                "1- Şiddetli akut ve kronik ağrı\n" +
                "2- Akut miyokard infarktüsü (kalp krizi)\n" +
                "3- Cerrahi sonrası ağrı kontrolü\n" +
                "4- Travmatik yaralanmalar",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Akut ağrı: 2-10 mg intravenöz (IV) yavaş enjeksiyon, gerektiğinde her 4 saatte bir.\n" +
                    "2- Şiddetli ağrı: 5-15 mg intramüsküler (IM) veya subkutan (SC), gerektiğinde her 4 saatte bir.\n" +
                    "3- Akut miyokard infarktüsü: 2-4 mg IV, gerektiğinde her 5-15 dakikada bir 2-8 mg ek doz.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-12 yaş: Akut ağrı: 0.05-0.1 mg/kg IV her 4-6 saatte bir, maksimum doz 10 mg.)\n" +
                    "2- ( 12-17 yaş: Akut ağrı: 0.05-0.2 mg/kg IV her 4-6 saatte bir, maksimum doz 10 mg.)",
            "Faydaları: Ağrı kesici ve anksiyolitik etkisi vardır",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Solunum depresyonu\n" +
                    "2- Bulantı ve kusma\n" +
                    "3- Kabızlık\n" +
                    "4- Baş dönmesi\n" +
                    "5- Uyuşukluk\n" +
                    "6- İdrar retansiyonu\n" +
                    "7- Hipotansiyon (düşük tansiyon)\n" +
                    "8- Kaşıntı\n" +
                    "9- Tolerans ve bağımlılık gelişimi (uzun süreli kullanımlarda)",R.drawable.morfin)

        val Glukagon = Paramedik("Glukagon","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Şiddetli hipoglisemi (düşük kan şekeri) durumunda, özellikle bilinç kaybı veya şiddetli semptomlarla birlikte.\n" +
                    "2- Glukoz enjeksiyonu veya ağızdan glikoz alınamayan durumlarda hipoglisemi tedavisi.",
            "\nDozaj:\n"+
                    "\n"+
                    "1- Yetişkinler (18 yaş ve üstü):\n" +
                    "2- Hipoglisemi (düşük kan şekeri): 1 mg intramüsküler (IM) veya subkutan (SC), gerektiğinde 15-20 dakika sonra tekrar edilebilir.\n" +
                    "3- Hipoglisemi tedavisinin etkili olmadığı durumlarda: 0.5-1 mg IV, gerekiyorsa tekrarlanabilir.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-12 yaş: 0.5 mg IM veya SC, gerektiğinde 15-20 dakika sonra tekrar edilebilir.)\n" +
                    "2- ( 12-17 yaş: 1 mg IM veya SC, gerektiğinde 15-20 dakika sonra tekrar edilebilir.)",
            "Faydaları: Kan şekerini hızla yükseltir.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Mide bulantısı ve kusma\n" +
                    "2- Alerjik reaksiyonlar (deri döküntüleri, kaşıntı)\n" +
                    "3- Baş ağrısı\n" +
                    "4- Tahrip olmuş enjeksiyon bölgesinde ağrı veya tahriş\n" +
                    "5- Hipotansiyon (düşük tansiyon)\n" +
                    "6- Hızlı kalp atışı (taşikardi)",R.drawable.glukagon)
        val Naloksan = Paramedik("Naloksan (Narcan)","Formülasyon: Ampul.",
            "\nEndikasyon:\n" +
                    "\n"+
                    "1- Opioid zehirlenmesi (morfin, heroin, fentanyl vb.) durumunda acil antidot olarak kullanılır.\n" +
                    "2- Opioidlerin etkilerini tersine çevirme ve solunum depresyonunu gidermede.\n",
            "\nDozaj:\n"+
                    "\n"+
                    "Yetişkinler (18 yaş ve üstü):\n" +
                    "1- Opioid zehirlenmesi: 0.4-2 mg intramüsküler (IM) veya intravenöz (IV), gerektiğinde 2-3 dakikada bir tekrar edilebilir, toplamda maksimum 10 mg.\n" +
                    "2- Burun spreyi: 4 mg burun yoluyla, gerektiğinde 2-3 dakikada bir tekrar edilebilir, toplamda maksimum 2 doz.\n" +
                    "Çocuklar:\n" +
                    "1- ( 0-17 yaş: 0.1 mg/kg IV, IM veya SC, gerektiğinde 2-3 dakikada bir tekrarlanabilir, maksimum doz 2 mg.)",
            "Faydaları: Opioidlerin etkisini tersine çevirir.",
            "\nYan Etkiler:\n" +
                    "\n"+
                    "1- Yüksek tansiyon (hipertansiyon)\n" +
                    "2- Kalp atış hızında değişiklikler (taşikardi veya bradikardi)\n" +
                    "3- Baş ağrısı\n" +
                    "4- Nausea (bulantı) ve kusma\n" +
                    "5- Terleme\n" +
                    "6- Agitasyon ve sinirlilik",R.drawable.naloksan)
        ParamedikListesi = arrayListOf(Adrenalin,Atropin,Aspirin,Nitrogliserin,Diazepam,Salbutamol,Furosemid,Morfin,Glukagon,Naloksan)

        val adapter = ParamedikAdapter(ParamedikListesi)
        binding.paramedikRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.paramedikRecyclerView.adapter=adapter


    }
}


