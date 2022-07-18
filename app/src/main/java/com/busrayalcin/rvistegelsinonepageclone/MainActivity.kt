package com.busrayalcin.rvistegelsinonepageclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.busrayalcin.rvistegelsinonepageclone.adapter.BannerAdapter
import com.busrayalcin.rvistegelsinonepageclone.adapter.CategoryAdapter
import com.busrayalcin.rvistegelsinonepageclone.adapter.PromotionAdapter
import com.busrayalcin.rvistegelsinonepageclone.databinding.ActivityMainBinding
import com.busrayalcin.rvistegelsinonepageclone.entity.Banner
import com.busrayalcin.rvistegelsinonepageclone.entity.Categories
import com.busrayalcin.rvistegelsinonepageclone.entity.Promotion

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false
        promotionAdapterBind()
        categoryAdapterBind()
        bannerAdapterBind()
        setContentView(binding.root)
    }

    private fun bannerAdapterBind() {
        binding.rvBanner.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val bannerList = ArrayList<Banner>()
        val b1 = Banner(1,"banner1")
        val b2 = Banner(2,"banner2")
        val b3 = Banner(3,"banner3")
        val b4 = Banner(4,"banner4")
//        val b5 = Banner(5,"banner5")
//        val b6 = Banner(6,"banner6")
        bannerList.add(b1)
        bannerList.add(b2)
        bannerList.add(b3)
        bannerList.add(b4)
//        bannerList.add(b5)
//        bannerList.add(b6)
        val bannerAdapter = BannerAdapter(this,bannerList)
        binding.rvBanner.adapter = bannerAdapter
    }

    private fun promotionAdapterBind() {
        binding.rvPromotion.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val promotionList = ArrayList<Promotion>()
        val p1 = Promotion(1,"promo1","Bayrama Özel")
        val p2 = Promotion(2,"promo2","İndirimli Ürünler")
        val p3 = Promotion(3,"promo3","Yeni Ürünler")
        val p4 = Promotion(4,"promo4","Bitmeden Gelsin")
        val p5 = Promotion(5,"promo5","Uygun Fiyat")
        val p6 = Promotion(6,"promo6","Organik")
        promotionList.add(p1)
        promotionList.add(p2)
        promotionList.add(p3)
        promotionList.add(p4)
        promotionList.add(p5)
        promotionList.add(p6)
        val promotionAdapter = PromotionAdapter(this,promotionList)
        binding.rvPromotion.adapter = promotionAdapter
    }

    private fun categoryAdapterBind() {
        binding.rvCategory.layoutManager = StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL)
        val categoryList = ArrayList<Categories>()
        val c1 = Categories(1,"sebzemeyve","Meyve, Sebze")
        val c2 = Categories(2,"etbalik","Et, Tavuk, Balık")
        val c3 = Categories(3,"suturunleri","Süt Ürünleri")
        val c4 = Categories(4,"kahvaltilik","Kahvaltilik")
        val c5 = Categories(5,"temelgida","Temel Gıda")
        val c6 = Categories(6,"donukgida","Donuk Gıda")
        val c7 = Categories(7,"dondurma","Dondurma")
        val c8 = Categories(8,"su","Su, İçecek")
        val c9 = Categories(9,"bebek","Bebek")
        val c10 = Categories(10,"ekmek","Ekmek")
        val c11 = Categories(11,"kisiselbakim","Kişisel Bakım")
        val c12 = Categories(12,"temizlikurunleri","Temizlik Ürünleri")
        categoryList.add(c1)
        categoryList.add(c2)
        categoryList.add(c3)
        categoryList.add(c4)
        categoryList.add(c5)
        categoryList.add(c6)
        categoryList.add(c7)
        categoryList.add(c8)
        categoryList.add(c9)
        categoryList.add(c10)
        categoryList.add(c11)
        categoryList.add(c12)
        val categoryAdapter = CategoryAdapter(this,categoryList)
        binding.rvCategory.adapter = categoryAdapter

    }
}