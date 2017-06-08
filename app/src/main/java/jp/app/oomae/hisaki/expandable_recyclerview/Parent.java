package jp.app.oomae.hisaki.expandable_recyclerview;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by hisaki on 2017/06/07.
 */

public class Parent extends ExpandableGroup<Child> {
    public Parent(String title, List<Child> items) {
        super(title, items);
    }
}
