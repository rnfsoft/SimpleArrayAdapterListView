package com.rnfsoft.simplearrayadapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> arrayOfUser = new ArrayList<User>();
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUser);
        ListView listView = (ListView)findViewById(R.id.lvItems);
        listView.setAdapter(adapter);

        User user1 = new User("Me1", "San Jose1");
        User user2 = new User("Me2", "San Jose2");
        User user3 = new User("Me3", "San Jose3");



        adapter.add(user1);
        adapter.add(user2);
        adapter.add(user3);

    }


}
