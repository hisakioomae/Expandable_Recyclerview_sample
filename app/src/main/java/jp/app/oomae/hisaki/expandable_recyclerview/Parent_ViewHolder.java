package jp.app.oomae.hisaki.expandable_recyclerview;

import android.view.View;
import android.widget.TextView;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by hisaki on 2017/06/07.
 */

public class Parent_ViewHolder extends GroupViewHolder {

    private TextView text1;

    public Parent_ViewHolder(View itemView) {//親viewのid取得
        super(itemView);
        text1 = (TextView)itemView.findViewById(R.id.parenttext);
    }
    public void open(){
        text1.setText("閉じる");
    }
    public void close(){
        text1.setText("開く");
    }

    @Override
    public void expand() {
        open();
    }
    @Override
    public void collapse() {
        close();
    }
}
