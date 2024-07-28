package mustafa.muhammedi.ders2

import java.io.Serializable

class Paramedik(
    val ilacad:String, val formulasyon:String, val endikasyon:String,
    val dozaj: String, val faydalar:String, val yanetkiler:String, val gorsel:Int) :Serializable {
}