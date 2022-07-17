package com.busrayalcin.rvistegelsinonepageclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.busrayalcin.rvistegelsinonepageclone.databinding.CategoryRowBinding
import com.busrayalcin.rvistegelsinonepageclone.entity.Categories

class CategoryAdapter(var mContext: Context,
                      var categoryList:List<Categories>)
    :RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>(){
    inner class CategoryViewHolder(binding:CategoryRowBinding) : RecyclerView.ViewHolder(binding.root){
        var binding:CategoryRowBinding
        init {
            this.binding = binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CategoryRowBinding.inflate(layoutInflater,parent,false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val promotion = categoryList.get(position)
        val hb = holder.binding

        hb.ivCategory.setImageResource(
            mContext.resources.getIdentifier(promotion.categoryImg,"drawable",mContext.packageName))
        hb.tvCategory.text = promotion.categoryName
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }
}