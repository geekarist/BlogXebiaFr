package fr.xebia.blog

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class ArticleListViewModel : ViewModel() {

    private val _articles = MutableLiveData<List<Article>>()
    val articles: LiveData<List<Article>>
        get() = _articles

    init {
        _articles.value = listOf(
                Article(title = "Title 1", content = "Content 1"),
                Article(title = "Title 2", content = "Content 2")
        )
    }
}
