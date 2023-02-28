package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private MyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(itemDecoration);

        adapter = new MyAdapter(getItemList(), this);
        recyclerView.setAdapter(adapter);

    }

    private List<MyItem> getItemList() {
        List<MyItem> itemList = new ArrayList<>();

        MyItem myItem1 = new MyItem(R.drawable.champagne_toast, "Champagne Toast", "Champagne Toast is a popular fragrance that is often used in body mists, candles, and other personal care products. It typically has a sweet, fruity scent with notes of champagne, juicy nectarine, and blackcurrant.\n" +
                "\n" +
                "Body mists are a type of fragrance product that are applied directly to the skin for a lighter and more subtle scent than traditional perfumes. They often contain lower concentrations of fragrance oils and are designed to be refreshing and invigorating. Body mists can be used throughout the day to refresh and revive the senses.\n" +
                "\n" +
                "Champagne Toast body mist is a popular fragrance option for those who enjoy fruity and sweet scents with a touch of sophistication. It can be found in various brands and formulations, so you may want to research and try different options to find the one that best suits your preferences.");
        MyItem myItem2 = new MyItem(R.drawable.a_thousand_wishes, "A Thousand Wishes", "A Thousand Wishes is another popular fragrance that is often used in body mists and other personal care products. It is a warm and luxurious scent that combines notes of sparkling champagne, crystal peonies, and almond crème. The fragrance also features hints of star fruit, quince, and freesia, along with undertones of amber, sandalwood, and musk.\n" +
                "\n" +
                "Body mists that feature A Thousand Wishes fragrance are often described as feminine and romantic, with a warm and inviting scent that lingers lightly on the skin. The body mist is designed to be refreshing and invigorating, and can be used throughout the day to provide a subtle, but long-lasting scent.\n" +
                "\n" +
                "Like other body mists, A Thousand Wishes body mist can be found in various brands and formulations, so you may want to research and try different options to find the one that best suits your preferences.");
        MyItem myItem3 = new MyItem(R.drawable.gingham, "Gingham", "Gingham is a popular fragrance used in body mists and other personal care products. It is a fresh and clean scent that is designed to evoke feelings of happiness and positivity. The fragrance is a blend of bright citrus, soft florals, and sweet fruits, with top notes of bergamot, mandarin, and grapefruit, middle notes of blue freesia, sweet peony, and violet petals, and base notes of white woods, musk, and sandalwood.\n" +
                "\n" +
                "Body mists that feature Gingham fragrance are often described as refreshing and uplifting, with a light and airy scent that is perfect for everyday wear. The body mist is designed to provide a subtle, but long-lasting fragrance that can be used throughout the day to refresh and revive the senses.\n" +
                "\n" +
                "Gingham body mist can be found in various brands and formulations, so you may want to research and try different options to find the one that best suits your preferences. The fragrance is popular among those who enjoy fresh, clean scents with a touch of sweetness and floral notes.");
        MyItem myItem4 = new MyItem(R.drawable.ginghamlove, "Gingham Love", "Gingham Love is a newer fragrance variation of the original Gingham scent that has become popular in body mists and other personal care products. It features a fresh and modern twist on the original fragrance, with a blend of fruity and floral notes that are designed to evoke feelings of joy and romance.\n" +
                "\n" +
                "Gingham Love body mist features top notes of raspberry, pear, and bergamot, which are complemented by middle notes of peony, jasmine. The fragrance is rounded out by base notes of white musk, sandalwood, and vanilla, which provide a warm and comforting finish.\n" +
                "\n" +
                "Body mists that feature Gingham Love fragrance are often described as sweet and feminine, with a light and refreshing scent that is perfect for everyday wear. The body mist is designed to provide a subtle, but long-lasting fragrance that can be used throughout the day to refresh and revive the senses.");
        MyItem myItem5 = new MyItem(R.drawable.in_the_stars, "In the stars", "In the Stars is a popular fragrance used in body mists and other personal care products. It is a warm and inviting scent that is designed to evoke feelings of confidence and glamour. The fragrance features a blend of star flower, sandalwood musk, sugared tangelo, white agarwood, and radiant amber notes.\n" +
                "\n" +
                "Body mists that feature In the Stars fragrance are often described as sophisticated and alluring, with a rich and luxurious scent that lingers lightly on the skin. The body mist is designed to provide a subtle, but long-lasting fragrance that can be used throughout the day to refresh and revive the senses.");
        MyItem myItem6 = new MyItem(R.drawable.into_the_night, "Into the night", "Into the Night is a popular fragrance used in body mists and other personal care products. It is a sensual and mysterious scent that is designed to evoke feelings of confidence and intrigue. The fragrance features a blend of dark berries, midnight jasmine, and rich amber notes.\n" +
                "\n" +
                "Body mists that feature Into the Night fragrance are often described as seductive and alluring, with a deep and mysterious scent that lingers lightly on the skin. The body mist is designed to provide a subtle, but long-lasting fragrance that can be used throughout the day to refresh and revive the senses.\n" +
                "\n");

        itemList.add(myItem1);
        itemList.add(myItem2);
        itemList.add(myItem3);
        itemList.add(myItem4);
        itemList.add(myItem5);
        itemList.add(myItem6);

        return itemList;
    }

    public void onItemClick(MyItem myItem) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("item", myItem.getText());
        startActivity(intent);
    }

}