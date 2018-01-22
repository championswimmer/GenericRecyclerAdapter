package `in`.championswimmer.genericrecycleradapter.sample

import `in`.championswimmer.genericrecycleradapter.GenericRecyclerAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_post.view.*

class MainActivity : AppCompatActivity() {

    var posts = genPosts(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPosts.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = GenericRecyclerAdapter<Post>(
                    posts,
                    R.layout.list_item_post,
                    {
                        itemView, item -> itemView.apply { with (item) {

                        tvTitle.text = title
                        tvBody.text = body

                    } } }
            )
        }
    }
}
