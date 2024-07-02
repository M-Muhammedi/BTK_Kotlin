package mustafa.muhammedi.learningkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("Hello world")
        println("The second line to be printed in the logs")
        // comment line
        println(5 * 2)
        println(10 / 5)
        println(5/2)

        //Data types and variables in Kotlin


        //Integer - Whole Number
        println("---------Integer--------")
        var x = 10
        println(x)
        println(x * 20)

        x = 30
        println(x * 20)

        var y = 5
        println(y)
        println(x + y)

        //implicit
        val z = 20
        println(z * 50)

        val ornek : Long = 10
        println(ornek * 10)

        //explicit
        val ornekShort : Short = 20
        val ornekByte : Byte = 15
        val ornekInt : Int = 30
        println(ornekByte * ornekShort)

        val userage = 35
        val user_age  = 35
        val UserAge = 35

        // snake_case
        // camelCase

        val m = 10
        val n = 20
        val conclusion = m + n
        println(conclusion)

        //Double - Float - fractional numbers
        println("-------Double&Float-------")

        val pi = 3.14
        println(pi * 2)

        println(5/2)
        println(5.0/2.0)
        val ornekDouble = 3.0

        val sonucDouble = pi * ornekDouble
        println(sonucDouble)

        val ornekFloat : Float = 2.25f
        println(ornekFloat * 2)

        //Unsigned Integer

        val unsignedByte : UByte = 10u
        val unsignedShort : UShort = 10u
        val unsignedInteger : UInt = 10u
        val unsignedLong : ULong = 10u

        //String -> texts
        println("----------String--------")

        val MyString = "My String"
        println(MyString)

        val ExString : String = "example"

        val name = "Mustafa"
        println(name.uppercase())

        val Lname = "Muhammedi"
        println(name + " " + Lname)

        val age = "25"
        val ornekDeger = "20"
        println(age + ornekDeger)

        val benimStr : String
        //benimStr.uppercase()
        benimStr = "benim stringim" //initalize, init, initialization

        //Conversion
        val yasInt = age.toInt()
        val xLong = x.toLong()
        println(xLong)

        println(yasInt * 20)

        //Boolean
        println("------Boolean-------")

        var benimBool : Boolean = true
        benimBool = false

        println(3 > 5)
        println(3 < 5)
        println(4 == 4)

        val kullaniciYas = "35"
        println(kullaniciYas.toInt() > 18)

        // <     is small
        // >     is greater than
        // <=    less than equal
        // >=    greater than equal
        // ==    equal
        // !=    is not equal
        // &&    and
        // ||    or

        println("Mustafa" == "Mustafa")
        println(10 != 10)

        println(4>3 && 3>5)
        println(4>3 || 3>5)


        //Veri Yapıları

        //Diziler - Array

        println("-------Array-------")

        val stringOrnegi = "Muhammedi"

        val benimDizim = arrayOf(stringOrnegi,"Mustafa","zeynep","fatih","osman")

        println(benimDizim[0])
        println(benimDizim[1])
        println(benimDizim.last())

        benimDizim[1] = "sam"

        println(benimDizim[1])
        println(benimDizim.get(3))

        //benimDizim[5] = "yeni eleman"
        //println(benimDizim[5])

        val numaraDizisi = arrayOf(1,10,20,15,2,4)
        println(numaraDizisi[3] * 10)

        val karisikDizi = arrayOf(10,3.14,20,"Muhammedi",false,true)
        println(karisikDizi[2])

        println("-------ArrayList-------")

        val isimListesi = arrayListOf("Muhammdi","Mustafa","zeynep")

        println(isimListesi[0])
        println(isimListesi[1])
        println(isimListesi[2])

        println(isimListesi.size)
        isimListesi.add("mahmut")
        println(isimListesi.get(3))
        isimListesi[3] = "mehmet"
        println(isimListesi.get(3))

        //isimListesi.removeAt(3)

        val numaraListesi = arrayListOf<Int>()
        val digerOrnekListe = ArrayList<Int>()

        numaraListesi.add(10)
        numaraListesi.add(20)
        numaraListesi.add(30)

        digerOrnekListe.add(40)
        digerOrnekListe.add(50)
        digerOrnekListe.add(60)

        println(numaraListesi[1] * digerOrnekListe[2])

        val karisikListe = arrayListOf(10,3.14,"Muhammedi",true)
        val karisikBosListe = arrayListOf<Any>()
        karisikBosListe.add(10)
        karisikBosListe.add("Muhammedi")
        karisikBosListe.add(false)

        println(karisikBosListe.get(0))

        println("----------Set----------")

        val ornekDizi = arrayOf(10,10,10,10,20,30,40)

        println(ornekDizi[0])
        println(ornekDizi[1])

        val ornekSet = setOf(10,10,10,10,20,30,40)
        println(ornekSet.size)


        ornekSet.forEach {
            println(it)
        }

        val bosSetOrnegi = HashSet<String>()

        bosSetOrnegi.add("Muhammedi")
        bosSetOrnegi.add("Muhammedi")
        bosSetOrnegi.add("Muhammedi")
        bosSetOrnegi.add("Muhammedi")
        bosSetOrnegi.add("Zeynep")

        bosSetOrnegi.forEach {
            println(it)
        }

        val ornekTekilSet = ornekDizi.toHashSet()
        ornekTekilSet.forEach {
            println(it)
        }

        println("----------Map---------")

        // Anahtar - Değer Eşleşmesi

        val yemekDizisi = arrayListOf("Elma","Armut","Karpuz")
        val kaloriDizisi = arrayListOf(100,150,200)

        println("${yemekDizisi[1]}'nın kalorisi ${kaloriDizisi[1]}")

        val yemekKaloriMapi = hashMapOf<String, Int>()
        yemekKaloriMapi.put("Elma",100)
        yemekKaloriMapi.put("Armut",150)
        yemekKaloriMapi.put("Karpuz",200)

        println(yemekKaloriMapi["Elma"])
        println(yemekKaloriMapi.get("Armut"))

        yemekKaloriMapi.put("Elma",300)
        println(yemekKaloriMapi.get("Elma"))

        val ornekHashMap = HashMap<String, String>()
        ornekHashMap.put("Mustafa","Muhammedi")
        ornekHashMap.put("abc","def")


        println("------- If Kontrolleri ----------")

        println(3 > 5)

        var sayi = 10
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        //kalanını bulma - remainder
        println(10 % 4)

        val skor = 60

        if(skor < 10) {
            println("you lost the game")
        } else if (skor >= 10 && skor < 20) {
            println("You got a decent score in the game")
        } else if (skor >= 20 && skor < 30) {
            println("you got a good score")
        } else {
            println("You have achieved a very good score.")
        }


        println("---------When---------")

        val notRakam = 6
        var notString = ""

        when(notRakam) {
            0 -> notString = "invalid grade"
            1 -> notString = "Weak"
            2 -> notString = "Bad"
            3 -> notString = "Middle"
            4 -> notString = "good"
            5 -> notString = "very good"
            else -> notString = "We do not know such a note"
        }

        println(notString)


        println("--------- While Döngüsü ---------")

        var j = 0
        println("döngü başladı")
        while (j <= 10) {
            println(j)
            j = j + 1
        }
        println("döngü bitti")


        println("--------- For Döngüsü ---------")

        val baskaDizi = arrayListOf(5,10,15,20,25,30)
        println(baskaDizi[0] / 5 * 3)
        println(baskaDizi[1] / 5 * 3)

        println("döngü başladı")
        for (numara in baskaDizi) {
            println(numara / 5 * 3)
        }
        println("döngü bitti")

        //range
        for (num in 0..9) {
            println(num * 10)
        }


        val benimStringDizim = ArrayList<String>()
        benimStringDizim.add("Mustafa")
        benimStringDizim.add("Zeynep")
        benimStringDizim.add("Atlas")

        for (kelime in benimStringDizim) {
            println(kelime.uppercase())
        }

        benimStringDizim.forEach {
            println(it.uppercase())
        }
    }
}