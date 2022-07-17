package com.busrayalcin.rvistegelsinonepageclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busrayalcin.rvistegelsinonepageclone.databinding.BannerRowBinding
import com.busrayalcin.rvistegelsinonepageclone.entity.Banner

class BannerAdapter(var mContext: Context,
                    var bannerList:List<Banner>)
    :RecyclerView.Adapter<BannerAdapter.BannerViewHolder>(){
    inner class BannerViewHolder(binding:BannerRowBinding) : RecyclerView.ViewHolder(binding.root){
        var binding:BannerRowBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = BannerRowBinding.inflate(layoutInflater,parent,false)
        return BannerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        val banner = bannerList[position]
        val hb = holder.binding
        hb.ivBanner.setImageResource(
            mContext.resources.getIdentifier(banner.bannerImg,"drawable",mContext.packageName))
    }

    override fun getItemCount(): Int {
        return bannerList.size
    }
}