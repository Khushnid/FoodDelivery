package uz.androidmk.fooddelivery.ui.food;

import java.util.ArrayList;

import uz.androidmk.fooddelivery.model.Food;
import uz.androidmk.fooddelivery.model.Menu;
import uz.androidmk.fooddelivery.ui.base.MvpView;

/**
 * Created by Azamat on 8/10/2018.
 */

public interface FoodMvpView extends MvpView {

    void onFoodListReady(ArrayList<Food> foods);

    void onMenuListReady(ArrayList<Menu> list);

}
