package jp.app.oomae.hisaki.expandable_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandCollapseController;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by hisaki on 2017/06/07.
 */

public class Home_Adapter extends ExpandableRecyclerViewAdapter<Parent_ViewHolder, Child_ViewHolder> {

    private ExpandCollapseController expandCollapseController;

    public Home_Adapter(List<? extends ExpandableGroup> groups) {
        super(groups);
        this.expandCollapseController = new ExpandCollapseController(expandableList, this);
    }

    @Override
    public Parent_ViewHolder onCreateGroupViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_item, parent, false);
        return new Parent_ViewHolder(view);
    }

    @Override
    public Child_ViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item, parent, false);
        return new Child_ViewHolder(view);
    }

    @Override
    public void onBindGroupViewHolder(Parent_ViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.set(String.valueOf(flatPosition));
    }

    @Override
    public void onBindChildViewHolder(Child_ViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        holder.set(String.valueOf(childIndex));
    }

}
