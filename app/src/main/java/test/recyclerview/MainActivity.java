package test.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        //shixianshuipingbuju
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);

        //shixianpubuliubuju
         recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter=new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits() {
        for (int i = 0; i <2 ; i++) {
            Fruit apple=new Fruit(R.drawable.apple_pic,getRandomLengthName("apple"));
            fruitList.add(apple);
            Fruit banana=new Fruit(R.drawable.banana_pic,getRandomLengthName("banana"));
            fruitList.add(banana);
            Fruit cherry=new Fruit(R.drawable.cherry_pic,getRandomLengthName("cherry"));
            fruitList.add(cherry);
            Fruit grape=new Fruit(R.drawable.grape_pic,getRandomLengthName("grape"));
            fruitList.add(grape);
            Fruit mango=new Fruit(R.drawable.mango_pic,getRandomLengthName("mango"));
            fruitList.add(mango);
            Fruit orange=new Fruit(R.drawable.orange_pic,getRandomLengthName("orange"));
            fruitList.add(orange);
            Fruit o=new Fruit(R.drawable.pear_pic,getRandomLengthName("pear"));
            fruitList.add(o);
            Fruit o1=new Fruit(R.drawable.pineapple_pic,getRandomLengthName("pineapple"));
            fruitList.add(o1);
            Fruit o2=new Fruit(R.drawable.strawberry_pic,getRandomLengthName("strawberry"));
            fruitList.add(o2);
            Fruit o3=new Fruit(R.drawable.watermelon_pic,getRandomLengthName("watermelon"));
            fruitList.add(o3);
        }
    }
    private String getRandomLengthName(String name){
        Random random=new Random();
        int length=random.nextInt(20)+1;
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<length;i++){
            builder.append(name);
        }
        return  builder.toString();
    }
}
