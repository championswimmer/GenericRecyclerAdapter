package `in`.championswimmer.genericrecycleradapter.sample

import java.util.*
import kotlin.collections.ArrayList

/**
 * Created by championswimmer on 22/01/18.
 */

data class Post(
        val title: String?,
        val body: String?,
        val id: Int?
)

fun genPosts(n: Int): ArrayList<Post> = (ArrayList<Post>(n)).apply {
    for (i in 1..n) {
        add(Post(
                UUID.randomUUID().toString(),
                "${UUID.randomUUID().toString()} ${UUID.randomUUID().toString()} " +
                        "${UUID.randomUUID().toString()} ${UUID.randomUUID().toString()} " +
                        "${UUID.randomUUID().toString()} ${UUID.randomUUID().toString()} ",
                Random().nextInt(100)
        ))
    }
}
