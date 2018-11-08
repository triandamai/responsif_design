package polinema.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResepListFragment extends ListFragment {

    /*static interface Listener{
        void itemClicked(long id);
    }*/

    private Listener listener;

    public ResepListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Resep.resepmakanan.length];
        for (int i=0; i<names.length; i++) {
            names[i] = Resep.resepmakanan[i].getNama_makanan();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    public interface Listener{
        void itemClicked(long id);
    }

    @Override
    public void onAttach( Context context ) {
        super.onAttach ( context );
        this.listener=(Listener) context ;
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        if(listener != null)
        {
            listener.itemClicked(id);
        }
    }

    /*@Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        super.onListItemClick(listView, itemView, position, id);
        Toast.makeText(getActivity(), "Item " + position + " was clicked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(itemView.getContext(), DetailActivity.class);
        Bundle b = new Bundle();
        String[] names = new String[Resep.resepmakanan.length];
        b.putInt("id",position);
        intent.putExtras(b);
        startActivity(intent);
    }*/

}
