package jp.app.oomae.hisaki.expandable_recyclerview;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hisaki on 2017/06/07.
 */

public class Home{
    final private static int parents_num = 9;//親の数
    final private static int child_num = 5;//子の数

    public static List<Parent> makehome() {
        Parent[] num = new Parent[parents_num];
        for(int i = 0; i < parents_num; i++) {
            num[i] = new Parent("parent" + String.valueOf(i),receive_child());
        }
        return Arrays.asList(num);
    }



    public static List<Child> receive_child() {
        Child[] num = new Child[child_num];
        for(int i = 0; i < child_num; i++) {
            num[i] = new Child("child" + String.valueOf(i));
        }
        return Arrays.asList(num);
    }
}
