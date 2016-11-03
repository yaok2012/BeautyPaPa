package com.rance.beautypapa.adapter.holder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.rance.beautypapa.R;
import com.rance.beautypapa.model.NewsEntity;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：Rance on 2016/10/25 15:35
 * 邮箱：rance935@163.com
 */
public class NewsViewHolder extends BaseViewHolder<NewsEntity.StoriesBean> {

    @BindView(R.id.item_news_title)
    TextView itemNewsTitle;
    @BindView(R.id.item_news_img)
    ImageView itemNewsImg;

    public NewsViewHolder(ViewGroup parent) {
        super(parent, R.layout.item_news);
        ButterKnife.bind(this, itemView);
    }

    @Override
    public void setData(NewsEntity.StoriesBean newsEntity) {
        Picasso.with(getContext()).load(newsEntity.getImages().get(0)).into(itemNewsImg);
        itemNewsTitle.setText(newsEntity.getTitle());
    }
}
