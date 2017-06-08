package jp.app.oomae.hisaki.expandable_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import static jp.app.oomae.hisaki.expandable_recyclerview.Home.makehome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        Home_Adapter adapter = new Home_Adapter(makehome());
        recyclerView.setAdapter(adapter);//アダプターをセット

    }
}
