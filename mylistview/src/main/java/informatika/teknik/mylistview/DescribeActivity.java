package informatika.teknik.mylistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DescribeActivity extends AppCompatActivity {

    TextView TvDescName, TvDesc;
    ImageView Picture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);

        Picture = findViewById(R.id.image_view);
        TvDescName = findViewById(R.id.tv_desc_name);
        TvDesc = findViewById(R.id.tv_desc);

        String name = getIntent().getStringExtra("Name");
        String desc = getIntent().getStringExtra("Desc");
        int image = getIntent().getIntExtra("Pict", 0);

        TvDescName.setText(name);
        TvDesc.setText(desc);
        Picture.setImageResource(image);
    }
}
