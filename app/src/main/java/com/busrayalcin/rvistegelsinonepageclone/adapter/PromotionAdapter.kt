package com.busrayalcin.rvistegelsinonepageclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busrayalcin.rvistegelsinonepageclone.databinding.PromotionRowBinding
import com.busrayalcin.rvistegelsinonepageclone.entity.Promotion

class PromotionAdapter(var mContext: Context,
                       var promotionList:List<Promotion>)
    :RecyclerView.Adapter<PromotionAdapter.PromotionViewHolder>(){
    inner class PromotionViewHolder(binding:PromotionRowBinding) : RecyclerView.ViewHolder(binding.root){
        var binding:PromotionRowBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromotionViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = PromotionRowBinding.inflate(layoutInflater,parent,false)
        return PromotionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PromotionViewHolder, position: Int) {
        val promotion = promotionList.get(position)
        val hb = holder.binding
        hb.ivPromotion.setImageResource(
            mContext.resources.getIdentifier(promotion.promotionImg,"drawable",mContext.packageName))
        hb.tvPromotionName.text = promotion.promotionName
    }

    override fun getItemCount(): Int {
        return promotionList.size
    }
}