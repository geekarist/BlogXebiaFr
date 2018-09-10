package fr.xebia.blog

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_article_list.*

class ArticleListFragment : Fragment() {

    companion object {
        fun newInstance() = ArticleListFragment()
    }

    private lateinit var viewModel: ArticleListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_article_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ArticleListViewModel::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArticleAdapter()
        adapter.submitList(listOf(
                Article(title = "Title 1", content = "Content 1"),
                Article(title = "Title 2", content = "Content 2")
        ))
        artListRv.adapter = adapter
    }
}
