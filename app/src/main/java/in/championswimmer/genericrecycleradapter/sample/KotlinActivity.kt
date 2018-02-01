package `in`.championswimmer.genericrecycleradapter.sample

import `in`.championswimmer.genericrecycleradapter.GenericRecyclerAdapter
import `in`.championswimmer.genericrecycleradapter.sample.Post.Companion.genPosts
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_kotlin.*
import kotlinx.android.synthetic.main.list_item_post.view.*

class KotlinActivity : AppCompatActivity() {

    var posts = genPosts(100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        rvPosts.apply {
            layoutManager = LinearLayoutManager(this@KotlinActivity)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity_kotlin, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.menu_java -> {
                startActivity(Intent(this, JavaActivity::class.java))
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
