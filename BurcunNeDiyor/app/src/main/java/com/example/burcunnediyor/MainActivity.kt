package com.example.burcunnediyor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: BurcAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val burcListesi = createBurcList()
        adapter = BurcAdapter(burcListesi)
        recyclerView.adapter = adapter
        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager


    }

    private fun createBurcList(): List<BurcData> {
        val burcListesi = mutableListOf<BurcData>()

        burcListesi.add(
            BurcData(
                "Koç \n   -\n 21 Mart - 20 Nisan",
                R.drawable.aries200,
                "Sevgili Koçlar ve yükselen burcu Koç olanlar, Satürn'ün Balık burcunda geri hareketine başlamasıyla kendinizi düşündüğünüz ve düşünmediğiniz zamanların ayrımı yapabilirsiniz. Neyin etkisi altında kaldığınızı daha iyi görebilirsiniz. Bu da sizi bir yanlıştan döndürebilir ya da iyi olmayı başardığınız bir konuyu geliştirmenizi sağlayabilir."
            )
        )
        burcListesi.add(
            BurcData(
                "Boğa    \n-  \n 21 Nisan – 20 Mayıs",
                R.drawable.taurus200,
                "Sevgili Boğalar ve yükselen burcu Boğa olanlar, Satürn'ün Balık burcundaki geri hareketi aynı havayı soluduğunuz bazı insanların gerçek niyetlerini size gösterebilir. Sosyal ortamlarda bulunmak ve bununla ilgili kalıplarınızı değiştirmek adına yanlış seçimler yapmış olabilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "İkizler \n  \n - 21 Mayıs – 21 Haziran",
                R.drawable.gemini200,
                "Sevgili İkizler burçları ve yükselen burcu İkizler olanlar, Satürn'ün Balık burcundaki geri hareketiyle beraber iş hayatınızdaki beklenmedik değişimlerin ya da bazı mecburiyetlerin hayatınıza etkisini düşünebilirsiniz. Zorlansanız da çalışmayı bırakmamanız gereken konularda kendinize yeni stiller oluşturabilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "Yengeç  \n - \n  22 Haziran – 22 Temmuz",
                R.drawable.cancer200,
                "Sevgili Yengeçler ve yükselen burcu Yengeç olanlar, Satürn'ün Balık burcunda geri hareketine başlamasıyla hayata bakış açınızı neyin üzerinden değiştirdiğinizi ya da sabit tuttuğunuzu düşünebilirsiniz. Sizin için iyi olmayan konuları görmemek için verdiğiniz çabayı şimdi tam tersi için kullanmalısınız. Bir alanda gelişmek, yol kat etmek ve bir sistem üzerinden devam etmek için çaba göstermeniz gerektiğiyle yüzleşebilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "Aslan   \n- \n  23 Temmuz – 23 Ağustos",
                R.drawable.leo200,
                "Sevgili Aslanlar ve yükselen burcu Aslan olanlar, Balık burcundaki Satürn'ün geri hareketine başlaması hakkınız olanın size dönüşü ve sizin bu konudaki çabanızı söz konusu hale getirebilir. Dürüst ve adil bir yaklaşım sergilediğiniz alanlarda haklılığınız ortaya çıkabilir, maddi ve manevi açıdan desteklenebilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "Başak  \n-  \n 24 Ağustos – 23 Eylül",
                R.drawable.virgo200,
                "Sevgili Başaklar ve yükselen burcu Başak olanlar, Satürn'ün Balık burcundaki geri hareketiyle kendinizi hangi konularda geri plana attığınızı daha iyi görebilirsiniz. Bu konuda bir atılım yapıp davranışlarınızı ve ilişkilerinizi düzenleme, gerçekleri konuşma yoluna gittiyseniz retro sürecinde bunu nasıl geliştireceğinizi düşünebilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "Terazi \n - \n 24 Eylül – 23 Ekim",
                R.drawable.libra200,
                "Sevgili Teraziler ve yükselen burcu Terazi olanlar, Satürn'ün Balık burcundaki geri hareketiyle günlük yaşantınızı sekteye uğratan konulara karşı yeni planlarınızı ve bunların gerekliliklerini gözden geçirebilirsiniz. Sorumluluklarınızın dışında öncelik verdiğiniz işler, destekler gibi durumlar söz konusu ise fedakarlıklarınızın bir ölçüsü olması gerektiğini hatırlamalısınız."
            )
        )
        burcListesi.add(
            BurcData(
                "Akrep  \n -\n  4 Ekim – 22 Kasım",
                R.drawable.scorpio200,
                "Sevgili Akrepler ve yükselen burcu Akrep olanlar, Satürn'ün Balık burcundaki geri hareketi size mutluluk kavramınızı sorgulatabilir. Mutlu olabilmek adına verdiğiniz mücadelenin, yaptığınız fedakarlıkların yönünü daha iyi görebilirsiniz. Kaçtığınız ya da göremediğiniz detayların ortaya çıkmasıyla kendinize yeni sınırlar çizebilirsiniz."
            )
        )
        burcListesi.add(
            BurcData(
                "Yay \n - \n 23 Kasım – 21 Aralık",
                R.drawable.sagittarius200,
                "Sevgili Yaylar ve yükselen burcu Yay olanlar, Satürn'ün Balık burcundaki geri hareketi aile hayatınızı etkileyen kararlarınızın üzerinden bir kez daha geçmenizi hatırlatabilir. Eksikleri tamamlamak isterken sorumluluğu bölüşebildiğinizden, aynı dili konuşabildiğinizden emin olmalısınız. Bunu sağlamaktan kaçındığınız noktalarla yüzleşmek gerekebilir."
            )
        )
        burcListesi.add(
            BurcData(
                "Oğlak \n - \n 22 Aralık – 20 Ocak",
                R.drawable.capricorn200,
                "Sevgili Oğlaklar ve yükselen burcu Oğlakolanlar, Balık burcundaki Satürn'ün geri hareketine başlamasıyla her ne kadar gerçek konular ve sağlam zeminlerle ilgilenseniz de kendi içinizde kaçındığınız durumlar göz önüne gelebilir."
            )
        )
        burcListesi.add(
            BurcData(
                "Kova  \n-  \n21 Ocak – 19 Şubat",
                R.drawable.aquarius200,
                "Sevgili Kovalar ve yükselen burcu Kova olanlar, Balık burcundaki Satürn’ün geri hareketiyle parasal konulardaki kayıplarınız ve kazanımlarınız üzerinde durabilirsiniz. Nasıl kazandığınız, nasıl kullandığınız ve kullanamadığınızla ilgili sorulara yanıt bulmak isteyebilirsiniz. Çevrenize, ailenize sunduğunuz maddi desteklerin sizi zarara uğrattığı noktaları toparlamak adına iyi fırsatlarınız olabilir."
            )
        )
        burcListesi.add(
            BurcData(
                "Balık \n - \n 20 Şubat – 20 Mart",
                R.drawable.pisces200,
                "Sevgili Balıklar ve yükselen burcu Balık olanlar, burcunuzda geri hareketine başlayan Satürn size bazı dersleri yeniden hatırlatabilir. Kendi değerinizi, hayatınızı ve isteklerinizi geri plana atmak konusundaki sorunları çözmelisiniz. Bugüne kadar bu konuda istediğiniz sevgiyi ve başarıyı elde edemediğinizi düşünüyorsanız, bakış açınızı ve yaklaşımlarınızı değiştirmelisiniz."
            )
        )

        return burcListesi
    }
}
