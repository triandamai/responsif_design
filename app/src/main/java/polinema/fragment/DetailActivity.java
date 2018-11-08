package polinema.fragment;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ResepDetailFragment frag = (ResepDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFrag);
        Bundle b = getIntent().getExtras();
        frag.setResep(b.getLong("id"));
    }
}
