package com.example.myapplicationlistview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class listviewMain2Activity extends AppCompatActivity {

    ListView listViewBooks;
    private List<Book> listBooks=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_main2);

        init();
        listViewBooks=this.findViewById(R.id.list_view_books);

        BookAdapter adapter = new BookAdapter(listviewMain2Activity.this, R.layout.list_view_item_book,listBooks);
        ((ListView) findViewById(R.id.list_view_books)).setAdapter(adapter);
    }

    private void init() {
        listBooks.add(new Book("软件项目管理方案教程（第四版）",R.drawable.book_1));
        listBooks.add(new Book("创新工程实践",R.drawable.book_2));
        listBooks.add(new Book("信息安全数学基础（第2版）",R.drawable.book_no_name));
    }

    class BookAdapter extends ArrayAdapter<Book> {

        private int resourceId;

        public BookAdapter(Context context, int resource, List<Book> objects) {
            super(context, resource, objects);
            resourceId = resource;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Book book = getItem(position);//获取当前项的实例
            View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            ((ImageView) view.findViewById(R.id.image_view_book_cover)).setImageResource(book.getCoverResourceId());
            ((TextView) view.findViewById(R.id.text_view_book_title)).setText(book.getTitle());
            return view;
        }
    }
}
