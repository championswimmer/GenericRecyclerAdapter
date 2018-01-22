package in.championswimmer.genericrecycleradapter.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import in.championswimmer.genericrecycleradapter.GenericRecyclerAdapter;

public class JavaActivity extends AppCompatActivity {

    ArrayList<Post> posts = Post.genPosts(100);
    RecyclerView rvPosts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        rvPosts = findViewById(R.id.rvPosts);
        rvPosts.setLayoutManager(new LinearLayoutManager(this));
        rvPosts.setAdapter(new GenericRecyclerAdapter<Post>(
                posts,
                R.layout.list_item_post,
                new GenericRecyclerAdapter.OnItemBindListener<Post>() {
                    @Override
                    public void onBind(View itemView, Post item) {
                        ((TextView) itemView.findViewById(R.id.tvTitle))
                                .setText(item.getTitle());
                        ((TextView) itemView.findViewById(R.id.tvBody))
                                .setText(item.getBody());
                    }
                }
        ));
    }
}
