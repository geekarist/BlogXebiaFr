package fr.xebia.blog

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.view.LayoutInflater
import android.view.ViewGroup

class ArticleAdapter : ListAdapter<Article, ArticleViewHolder>(DiffCallback()) {

    class DiffCallback : DiffUtil.ItemCallback<Article>() {

        override fun areItemsTheSame(p0: Article, p1: Article): Boolean {
            return p0 === p1
        }

        override fun areContentsTheSame(p0: Article, p1: Article): Boolean {
            return p0 == p1
        }

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ArticleViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.view_article, p0, false)
        return ArticleViewHolder(view)
    }

    override fun onBindViewHolder(p0: ArticleViewHolder, p1: Int) {
        val item = getItem(p1)
        p0.bind(item)
    }
}
