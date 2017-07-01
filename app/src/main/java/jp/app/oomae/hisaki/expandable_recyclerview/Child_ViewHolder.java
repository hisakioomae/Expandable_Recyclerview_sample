package jp.app.oomae.hisaki.expandable_recyclerview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by hisaki on 2017/06/07.
 */

public class Child_ViewHolder extends ChildViewHolder {

    private TextView text1;

    public Child_ViewHolder(View itemView) {//子viewのid取得
        super(itemView);
        text1 = (TextView)itemView.findViewById(R.id.childtext);
    }

}
