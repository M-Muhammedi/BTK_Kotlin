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
        val cari = Paramedik("112 Çağrı Merkezi ","112 acil çağrı merkezi," +
                " acil durumlarda hızlı ve etkili yardım sağlamak için önemli bir hizmet sunar." +
                " Bu hizmeti kullanırken dikkat edilmesi gereken bazı önemli noktalar vardır. " +
                "İşte 112 çağrı merkezini ararken yapılması gerekenler ve gereksiz çağrılardan kaçınma konusunda bilinmesi gerekenler:\n"+"" +
                "112 Çağrı Merkezini Ararken Yapılması Gerekenler:\n" +
                "\n1.\tSakin ve Net Olun:\n" +
                "\n•\tPanik yapmayın, sakin kalın.\n" +
                "\n•\tKonuşurken net ve anlaşılır bir şekilde bilgi verin.\n" +
                "\n2.\tDurumu Kısa ve Öz Anlatın:\n" +
                "\n•\tAcil durumun ne olduğunu ve ne tür bir yardıma ihtiyaç duyduğunuzu kısa ve öz bir şekilde açıklayın.\n" +
                "\n•\tÖrneğin: \"Ciddi bir trafik kazası var. Bir kişi yaralandı ve bilinci kapalı.\"\n" +
                "\n3.\tKonum Bilgisi Verin:\n" +
                "\n•\tOlayın meydana geldiği yerin açık adresini veya bilinen bir yer tarifini verin.\n" +
                "\n•\tKonumunuzu netleştirmek için yakınlardaki belirgin yapıları veya caddeleri tarif edin.\n" +
                "\n4.\tKendinizi Tanıtın:\n" +
                "\n•\tAdınızı ve olay yerindeki rolünüzü (tanık, mağdur, yardımcı) belirtin.\n" +
                "\n•\tGerekirse iletişim bilgilerinizi verin.\n" +
                "\n5.\tSoruları Cevaplayın:\n" +
                "\n•\t112 operatörünün size sorduğu soruları tam ve doğru bir şekilde yanıtlayın.\n" +
                "\n•\tGerekli bilgilerin hızlı ve doğru bir şekilde alınması, yardımın etkin bir şekilde sağlanmasına yardımcı olur.\n" +
                "\n6.\tTavsiyeleri Dinleyin:\n" +
                "\n•\tOperatörün size verdiği talimatları dikkatlice dinleyin ve uygulayın.\n" +
                "\n•\tGerekirse, operatörün yönlendirmeleri doğrultusunda ilk yardım uygulamalarını gerçekleştirin.\n" +
                "\n7.\tHattı Meşgul Etmeyin:\n" +
                "\n•\tGerekli bilgileri verdikten ve operatörün talimatlarını aldıktan sonra telefonu kapatın.\n" +
                "\n•\tHattı gereksiz yere meşgul etmeyin; başka acil durumlar için hattın açık kalması önemlidir.\n" +
                "\n112 Çağrı Merkezini Gereksiz Yere Rahatsız Etmeme:\n" +
                "\n1.\tAcil Durumlar İçin Arayın:\n" +
                "\n•\t112 yalnızca acil durumlar için aranmalıdır. Acil durumlar, hayatı tehdit eden veya ciddi yaralanmalara neden olan olayları içerir.\n" +
                "\n•\tÖrneğin: Yangın, ciddi trafik kazaları, kalp krizi, ağır yaralanmalar, bilinç kaybı, boğulma, zehirlenme.\n" +
                "\n2.\tBilgi ve Danışma İçin Başka Numaraları Kullanın:\n" +
                "\n•\tTıbbi danışma, hastane randevusu, genel bilgi veya diğer acil olmayan konular için 112'yi aramayın.\n" +
                "\n•\tBu tür durumlar için yerel sağlık hizmetleri veya danışma hatlarını kullanın.\n" +
                "\n3.\tYanlış Alarmlar ve Şakalar Yapmayın:\n" +
                "\n•\tAcil çağrı merkezini şaka yapmak veya yanlış alarm vermek için aramak ciddi sonuçlar doğurabilir ve gerçek acil durumlarda ihtiyaç duyulan yardımı geciktirebilir.\n" +
                "\n•\tBu tür davranışlar yasa dışıdır ve cezai yaptırımlara tabidir.\n" +
                "\n4.\tÇocukları Bilgilendirin:\n" +
                "\n•\tÇocuklara 112'nin ne zaman ve nasıl aranması gerektiğini öğretin.\n" +
                "\n•\t112'nin yalnızca acil durumlar için aranması gerektiğini ve yanlış kullanımın ciddi sonuçları olabileceğini anlatın.\n" +
                "\n5.\tGereksiz Tekrar Aramalardan Kaçının:\n" +
                "\n•\tAynı olay için gereksiz yere tekrar arama yapmaktan kaçının. Yardım yolda olduğunda bu bilgiyi tekrar teyit etmek için arama yapmayın.\n" +
                "\n112 acil çağrı merkezi, hayat kurtarmak için hızlı ve etkili bir hizmet sunar. Bu hizmeti gereksiz yere meşgul etmek, sadece hukuki ve cezai sonuçlara yol açmakla kalmaz, aynı zamanda gerçek acil durumlarda yardıma ihtiyaç duyan insanların yardım almasını engeller." +
                "\n Bu nedenle, 112'nin doğru ve yerinde kullanılması hayati önem taşır ve gereksiz yere rahatsız edilmesi durumunda ciddi cezalar uygulanır.\n",R.drawable.cagrmerkez)
        val bildirim = Paramedik("BİLDİRME","Türkiye’de ilk yardım gerektiren her durumda 112 Acil aranır. 112 Acil’in aranması sırasında: \n" +
                "\n• Sakin olunmalıdır.\n" +
                "\n• 112 Acil tarafından sorulan sorulara net bir şekilde cevap verilmelidir. \n" +
                "\n• Kesin yer ve adres bilgileri verilmelidir.\n" +
                "\n• Olayın ne (yangın, trafi k kazası, zehirlenme) olduğu bildirilmelidir.\n" +
                "\n • Hasta veya yaralının sayısı ve durumu bildirilmelidir.\n" +
                "\n• Eğer herhangi bir ilk yardım uygulaması yapıldıysa nasıl bir yardım yapıldığı belirtilmelidir. \n" +
                "\n• Gerekli olan tüm bilgilerin alındığı söylenmeden telefon kapatılmamalıdır.\n",R.drawable.bildirme)
        val kurtarma = Paramedik("KURTARMA ( MÜDAHALE )","Hasta veya yaralılara ilk yardım uygulayabilmek için durumları hızla değerlendirilir. Bunun için aşağıdaki işlemler yapılır; \n" +
                "\n• Hasta veya yaralıların; Hava yolu açıklığının sağlanması. Solunumun sağlanması. Dolaşımının sağlanması. \n" +
                "\n• Hasta veya yaralıların korku ve endişeleri giderilmelidir. \n" +
                "\n• Çevredeki kişilerden yardım istenmelidir. \n" +
                "\n• Kişinin yarasını görmesine izin verilmelidir. \n" +
                "\n• Hasta veya yaralıya, hareket ettirmeden ilk yardım yapılmalıdır. \n" +
                "\n• Hasta/yaralının en uygun yöntemlerle en yakın sağlık kuruluşuna sevki sağlanır (112 Acil)\n" +
                "\nUYARI: Zorunlu olmadıkça hasta veya yaralılar yerinden Hareket ettirilmemelidir.\n",R.drawable.kurtarma)
        val vucut = Paramedik("Vücut Sistemleri","Hareket Sistemi:\n" +
                "\nKemik, kas ve eklemlerden oluşur. Vücudun hareket etmesinde rol oynar, dik durmamızı sağlar. Hayati organlarımızı dış etkenlerden korur.\n" +
                "\nDolaşım Sistemi:\n" +
                "\nKalp, damar ve kandan oluşur. Yaşamamız için gerekli olan oksijen ve besin maddeleri kalbimizin pompaladığı kan ile vücudumuzun her yerine ulaştırılır.\n" +
                "\nSolunum Sistemi:\n" +
                "\nBurun, ağız, yutak, gırtlak, soluk borusu ve akciğerlerden oluşur. Soluk aldığımızda havadaki oksijen akciğerlerimizden kana geçerek vücuda dağılır. Tüm vücudumuza dağılan oksijen, besinlerin enerjisini açığa çıkarmada kullanılır. Bu işlem sonunda ortaya çıkan karbon dioksit damarlar içinde dolaşan kan aracılığıyla akciğerlere getirilir. Akciğerlerdeki havaya geçen karbon dioksit soluk verdiğimizde dışarı atılır.\n" +
                "\nSindirim Sistemi:\n" +
                "\nAğız, yemek borusu, ince bağırsak, kalın bağırsak ve anüsten oluşur. Tükürük bezleri, pankreas ve karaciğer de sindirime yardımcı organlardır. Besinler ağızdan alınarak çiğnenir. Sindirimin kanalı boyunca ağız, yemek borusu, mide, ince bağırsak ve kalın bağırsaktan geçerek değişikliğe uğrar. Sindirilemeyen artıklar anüsten dışarı atılır.\n" +
                "\nBoşaltım Sistemi:\n" +
                "\nBöbrekler, üreterler, mesane ve üretradan oluşur. Kandaki artık, zararlı ve fazla ürünleri süzer; idrar yapan ve yapan idrar idrar ile birlikte zararlı ürünleri vücut dışına boşaltan sistemdir.\n" +
                "\nSinir Sistemi:\n" +
                "\nBeyin, beyincik, omurilik ve omurilik soğanından oluşur. Merkezi ve çevresel sinir sistemi olarak ikiye ayrılır. Vücudu oluşturan hücre, doku, organ ve sistemlerin birbirine bağlı olarak koordine bir şekilde çalışmasını sağlar ve bunları yönetir.\n",R.drawable.vucut)

        val yasam= Paramedik("Bilinç Durumu ","Normal bir kişi kendine yöneltilen tüm uyarılara cevap verir. Elle dokunarak veya sesli uyarılara cevap vermiyorsa bilinç kaybı vardır.\n" +
                "\nSolunum\n" +
                "\nNormalde 1 dakikadaki solunum sayısı yetişkinlerde 12-20, çocuklarda ve bebeklerde ise 20-25 arasındadır.\n" +
                "\nVücut Sıcaklığı\n" +
                "\nİlk yardımda vücut sıcaklığı koltuk altından ölçülmelidir. Normal değeri 36.5 °C'dir.\n" +
                "\nBilinç Kontrolü Yapılır\n" +
                "\nHasta veya yaralıya seslenerek ya da hafifçe omzuna dokunarak \"İyi misiniz?\" diye sorularak bilinç kontrolü yapılır.\n",R.drawable.bilinc)
        val ilkyardim = Paramedik("İlk Yardım Değerlendirilir","İlk değerlendirmeyi yaparken aşağıdaki aşamaları sırayla izlemek gerekir.\n" +
                "\nHava Yolu Açıklığının Sağlanması:\n" +
                "\nHavanın akciğerlere ulaşabilmesi için hava yolu açık olmalıdır. Özellikle bilinç kaybı olanlarda dilin geriye kaçması, yabancı cisim, kusmuk gibi nedenlerle solunum yolu tıkanabilir. Hava yolunu açmak için aşağıdaki basamaklar izlenir.\n" +
                "\n•\tHava yolu açıklığı sağlanırken hasta veya yaralı baş, boyun, gövde ekseni düz olacak şekilde yatırılmalıdır.\n" +
                "\n•\tAğız içi kontrol edilmeli, yabancı cisim varsa dikkatlice çıkarılmalıdır.\n" +
                "\n•\tDaha sonra bir el hasta veya yaralının alnına konarak, diğer elin 2-3 parmağı ile çene tutularak baş geriye doğru itilerek “Baş geri-Çene yukarı” pozisyonu verilmelidir.\n" +
                "\nSolunum Değerlendirilmesi\n" +
                "\n1. Bilinç Kontrolü:\n" +
                "\n•\tHasta veya yaralıya seslenerek ya da hafifçe omzuna dokunarak \"İyi misiniz?\" diye sorarak bilinç kontrolü yapın.\n" +
                "\n•\tBilinçsizse ve yanıt vermiyorsa yardım çağırın (112).\n" +
                "\n2. Hava Yolu Açıklığının Sağlanması:\n" +
                "\n•\tHavanın akciğerlere ulaşabilmesi için hava yolu açık olmalıdır. Bilinç kaybı olanlarda dilin geriye kaçması, yabancı cisim, kusmuk gibi nedenlerle solunum yolu tıkanabilir.\n" +
                "\n•\tBaş, boyun, gövde ekseni düz olacak şekilde hastayı veya yaralıyı yatırın.\n" +
                "\n•\tAğız içini kontrol edin ve yabancı cisim varsa dikkatlice çıkarın.\n" +
                "\n•\tBir el hasta veya yaralının alnına konarak, diğer elin 2-3 parmağı ile çene tutularak baş geriye doğru itilerek \"Baş geri-Çene yukarı\" pozisyonu verin.\n" +
                "\n3. Solunum Kontrolü:\n" +
                "\n•\tSolunum kontrolü için 10 saniye boyunca hastanın veya yaralının göğüs hareketlerini izleyin, nefes seslerini dinleyin ve nefes alıp almadığını kontrol edin.\n" +
                "\n•\tBak-Dinle-Hisset Yöntemi:\n" +
                "\n•\tBak: Göğsün yükselip alçaldığını gözlemleyin.\n" +
                "\n•\tDinle: Hastanın ağzına veya burnuna yakın bir şekilde nefes seslerini dinleyin.\n" +
                "\n•\tHisset: Hastanın ağzından veya burnundan nefesin gelmesini hissedin.\n" +
                "\n4. Solunumun Değerlendirilmesi:\n" +
                "\n•\tNormal Solunum: Normalde 1 dakikadaki solunum sayısı yetişkinlerde 12-20, çocuklarda ve bebeklerde ise 20-25 arasındadır.\n" +
                "\n•\tHızlı Solunum: Dakikada 20'den fazla (yetişkinler için) solunum olması.\n" +
                "\n•\tYavaş Solunum: Dakikada 12'den az (yetişkinler için) solunum olması.\n" +
                "\n•\tDüzensiz Solunum: Düzensiz solunum paternleri, derin nefes alıp verme, hırıltılı nefes alma gibi belirtiler.\n" +
                "\n5. Acil Durumlarda Müdahale:\n" +
                "\n•\tSolunum yoksa veya yetersizse hemen CPR (kardiyopulmoner resüsitasyon) başlatın.\n" +
                "\n•\tCPR yaparken 30 göğüs basısı ve 2 kurtarıcı nefes oranını uygulayın.\n" +
                "\n•\tOtomatik Eksternal Defibrilatör (AED) varsa kullanın ve talimatları izleyin.\n" +
                "\n6. Yardım Çağırma:\n" +
                "\n•\tSolunum problemleri olan bir hasta veya yaralı için acil yardım çağırın (112).\n" +
                "\n•\tProfesyonel yardım gelene kadar hastayı izleyin ve gerekiyorsa ilk yardım uygulamalarını sürdürün.\n",R.drawable.tenefusdinle)
        val diskanama = Paramedik("DIŞ KANAMALAR","• Hasta veya yaralının durumu değerlendirilir. \n" +
                "\n• 112 Acil aranır. \n" +
                "\n• Kanayan yer üzerine temiz bir bezle bastırılır. \n" +
                "\n• Kanama durmazsa ikinci bir bez koyarak bastırılır. \n" +
                "\n• Gerekirse bir bez ile sarılarak basınç uygulanır. \n" +
                "\n• Kanayan bölge yukarı kaldırılır. \n" +
                "\n• Hasta ve yaralıya şok pozisyonu verilir\n" +
                "ŞOK POZİSYONU VERİLİRKEN AŞAĞDAKİ BASAMAKLAR İZLENİR\n" +
                "\n• Hasta veya yaralı sırt üstü yatırılır. \n" +
                "\n• Bacakları 30 cm yükseltilir. \n" +
                "\n• Üzeri örtülür. \n" +
                "\n• 112 Acil aranır. \n" +
                "\n• 112 Acil ekibi gelene kadar hasta veya yaralının yanında beklenir.\n",R.drawable.diskanama)
        val yaratur = Paramedik("YARA ÇEŞİTLERİ","Kesik yaralar: Bıcak, çakı gibi kesici aletlerle oluşur. Genellikle basit yaralardır. \n" +
                "\nEzik yaralar: Taş, yumruk ya da sopa gibi cisimlerin şiddetli olarak çarpması ile oluşan yaralardır. \n" +
                "\nDelici yaralar: Sivri aletlerle oluşan yaralardır. \n" +
                "\nParçalı yaralar: Dokular üzerinde bir çekme etkisi ile meydana gelir. Doku ile ilgili tüm organ, saçlı deride zarar görebilir. \n" +
                "\nKirli (enfekte) yaralar: Mikrop kapma ihtimali olan yaralardır. Enfeksiyon riski yüksek yaralar şunlardır: \n" +
                "\n• Gecikmiş yaralar (6 saatten fazla) \n" +
                "\n• Dikişleri ayrılmış yaralar, \n" +
                "\n• Kenarları muntazam olmayan yaralar \n" +
                "\n• Çok kirli ve derin yaralar, \n" +
                "\n• Ateşli silah yaraları, Isırma ve sokma ile oluşan yaralar.\n",R.drawable.yaratur)
        val cocuk = Paramedik("Çocuklarda Boğaz Tıkanma ","Çocuklarda Ağızda Yabancı Cisim Tıkanıklığı Müdahalesi\n" +
                "1. Hava Yolu Tıkanıklığını Değerlendirme:\n" +
                "\n•\tKısmi Tıkanıklık:\n" +
                "\n•\tÇocuk öksürebilir, nefes alabilir ve konuşabilir.\n" +
                "\n•\tÇocuğa öksürmeye devam etmesini söyleyin.\n" +
                "\n•\tÖksürük etkisiz hale gelirse veya kötüleşirse tam tıkanıklığa dönüşebilir.\n" +
                "\n•\tTam Tıkanıklık:\n" +
                "\n•\tÇocuk öksüremez, nefes alamaz, konuşamaz ve cildi maviye dönebilir.\n" +
                "\n•\tHemen müdahale gerektirir.\n" +
                "\n2. Müdahale Adımları:\n" +
                "\n•\tKısmi Tıkanıklık:\n" +
                "\n•\tÇocuk öksürebiliyorsa, kendi kendine nefes alabiliyorsa ve konuşabiliyorsa, öksürmeye devam etmesini teşvik edin.\n" +
                "\n•\tÇocuğun yanında kalın ve durumu gözlemleyin.\n" +
                "\n•\tTam Tıkanıklık:\n" +
                "\n•\tSırt Vuruşları:\n" +
                "\n•\tÇocuğu yüzükoyun bir şekilde dizinize veya kucağınıza yatırın.\n" +
                "\n•\tÇocuğun başını aşağıya doğru eğin ve vücut ekseni boyunca destekleyin.\n" +
                "\n•\tSırtın ortasına, kürek kemiklerinin arasına 5 sert vuruş yapın.\n" +
                "\n•\tHeimlich Manevrası (Karın İtme):\n" +
                "\n•\tÇocuğu ayağa kaldırın.\n" +
                "\n•\tBir elinizi yumruk yaparak, başparmağınızı çocuğun göbeği ile göğüs kemiği arasına yerleştirin.\n" +
                "\n•\tDiğer elinizle yumruğunuzu tutarak, hızlı ve yukarı doğru 5 itme yapın.\n" +
                "\n•\tTekrar Etme:\n" +
                "\n•\tYabancı cisim çıkmazsa, sırayla 5 sırt vuruşu ve 5 Heimlich manevrası yapmaya devam edin.\n" +
                "\n3. Bilinç Kaybı Olursa:\n" +
                "\n•\tÇocuk bilinç kaybederse, hemen CPR (kardiyopulmoner resüsitasyon) başlatın.\n" +
                "\n•\tÇocuğu düz bir zemine sırtüstü yatırın.\n" +
                "\n•\t30 göğüs basısı yapın (çocuğun göğüs kemiğinin alt yarısına, 2 parmak genişliğinde).\n" +
                "\n•\tArdından ağızdan ağıza 2 nefes verin.\n" +
                "\n•\tCPR yapmaya devam edin ve yardım çağırın (112).\n" +
                "\n4. Acil Durum Yardımı:\n" +
                "\n•\tTıbbi yardım gelene kadar bu adımları uygulamaya devam edin.\n" +
                "\n•\tMümkünse bir başkası acil yardımı ararken, siz müdahaleye devam edin.\n" +
                "\nÇocuklarda ağızda yabancı cisim tıkanıklığı durumunda hızlı ve doğru müdahale hayat kurtarıcı olabilir. " +
                "\nBu adımları uygularken sakin kalmak ve çocuğun durumunu sürekli izlemek önemlidir.\n",R.drawable.cocukb)
        val buyuk = Paramedik("Yetişkinlerde Boğaz Tıkanma ","Yetişkinlerde Ağızda Yabancı Cisim Tıkanıklığı Müdahalesi\n" +
                "\n1. Hava Yolu Tıkanıklığını Değerlendirme:\n" +
                "\n•\tKısmi Tıkanıklık:\n" +
                "\n•\tYetişkin öksürebilir, nefes alabilir ve konuşabilir.\n" +
                "\n•\tKişiye öksürmeye devam etmesini söyleyin.\n" +
                "\n•\tÖksürük etkisiz hale gelirse veya kötüleşirse tam tıkanıklığa dönüşebilir.\n" +
                "\n•\tTam Tıkanıklık:\n" +
                "\n•\tYetişkin öksüremez, nefes alamaz, konuşamaz ve cildi maviye dönebilir.\n" +
                "\n•\tHemen müdahale gerektirir.\n" +
                "\n2. Müdahale Adımları:\n" +
                "\n•\tKısmi Tıkanıklık:\n" +
                "\n•\tYetişkin öksürebiliyorsa, kendi kendine nefes alabiliyorsa ve konuşabiliyorsa, öksürmeye devam etmesini teşvik edin.\n" +
                "\n•\tKişinin yanında kalın ve durumu gözlemleyin.\n" +
                "\n•\tTam Tıkanıklık:\n" +
                "\n•\tSırt Vuruşları:\n" +
                "\n•\tKişiyi öne doğru eğin ve vücut ekseni boyunca destekleyin.\n" +
                "\n•\ttSırtın ortasına, kürek kemiklerinin arasına 5 sert vuruş yapın.\n" +
                "\n•\tHeimlich Manevrası (Karın İtme):\n" +
                "\n•\tKişiyi ayakta veya oturur pozisyonda durmasını sağlayın.\n" +
                "\n•\tBir elinizi yumruk yaparak, başparmağınızı kişinin göbeği ile göğüs kemiği arasına yerleştirin.\n" +
                "\n•\tDiğer elinizle yumruğunuzu tutarak, hızlı ve yukarı doğru 5 itme yapın.\n" +
                "\n•\tTekrar Etme:\n" +
                "\n•\tYabancı cisim çıkmazsa, sırayla 5 sırt vuruşu ve 5 Heimlich manevrası yapmaya devam edin.\n" +
                "\n3. Bilinç Kaybı Olursa:\n" +
                "\n•\tKişi bilinç kaybederse, hemen CPR (kardiyopulmoner resüsitasyon) başlatın.\n" +
                "\n•\tKişiyi düz bir zemine sırtüstü yatırın.\n" +
                "\n•\t30 göğüs basısı yapın (göğüs kemiğinin alt yarısına, iki elin topukları ile).\n" +
                "\n•\tArdından ağızdan ağıza 2 nefes verin.\n" +
                "\n•\tCPR yapmaya devam edin ve yardım çağırın (112).\n" +
                "\n4. Acil Durum Yardımı:\n" +
                "\n•\tTıbbi yardım gelene kadar bu adımları uygulamaya devam edin.\n" +
                "\n•\tMümkünse bir başkası acil yardımı ararken, siz müdahaleye devam edin.\n" +
                "\nAşamaların Detaylı Açıklaması:\n" +
                "\n1.\tSırt Vuruşları:\n" +
                "\n•\tKişinin başını öne doğru eğin.\n" +
                "\n•\tDestekleyici bir pozisyonda durun ve kişinin sırtına, kürek kemiklerinin arasına 5 kuvvetli vuruş yapın.\n" +
                "\n2.\tHeimlich Manevrası:\n" +
                "\n•\tKişiyi dik duracak şekilde pozisyonlandırın.\n" +
                "\n•\tArkasından sarılarak bir elinizi yumruk yapın ve başparmağınızı kişinin göbeği ile göğüs kemiği arasına yerleştirin.\n" +
                "\n•\tDiğer elinizle yumruğunuzu tutun ve hızlı, yukarı doğru itme hareketi yapın.\n" +
                "\n•\tCPR (Kardiyopulmoner Resüsitasyon):\n" +
                "\n•\tKişi bilinç kaybederse, sırtüstü yatmasını sağlayın.\n" +
                "\n•\tGöğüs kemiğinin alt yarısına 30 hızlı ve derin bası yapın.\n" +
                "\n•\tArdından iki nefes verin, ağızdan ağıza solunum yaparken burun deliklerini kapatın ve göğsün yükselmesini gözlemleyin.\n" +
                "\nYetişkinlerde yabancı cisim tıkanıklığı durumunda hızlı ve doğru müdahale hayati önem taşır. " +
                "\nBu adımları uygularken sakin kalmak ve kişinin durumunu sürekli izlemek çok önemlidir.\n",R.drawable.buyukb)


        ParamedikListesi = arrayListOf(cari,bildirim,kurtarma,vucut,yasam,ilkyardim,diskanama,yaratur,cocuk,buyuk)

        val adapter = ParamedikAdapter(ParamedikListesi)
        binding.paramedikRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.paramedikRecyclerView.adapter=adapter


    }
}


