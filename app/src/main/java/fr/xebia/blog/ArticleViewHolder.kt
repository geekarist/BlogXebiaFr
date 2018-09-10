package fr.xebia.blog

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.view_article.view.*

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(item: Article) {
        itemView.articleTitle.text = item.title
        itemView.articleContent.text = item.content
    }
}
