package maksatuly.example.rauan.rauan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {
    Button b[][] = new Button[20][20];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        b[1][1] = (Button)findViewById(R.id.b11);
        b[1][2] = (Button)findViewById(R.id.b12);
        b[1][3] = (Button)findViewById(R.id.b13);
        b[2][1] = (Button)findViewById(R.id.b21);
        b[2][2] = (Button)findViewById(R.id.b22);
        b[2][3] = (Button)findViewById(R.id.b23);
        b[3][1] = (Button)findViewById(R.id.b31);
        b[3][2] = (Button)findViewById(R.id.b32);
        b[3][3] = (Button)findViewById(R.id.b33);
        b[4][1] = (Button)findViewById(R.id.b41);
        b[4][2] = (Button)findViewById(R.id.b42);
        b[4][3] = (Button)findViewById(R.id.b43);
        b[5][1] = (Button)findViewById(R.id.b51);
        b[5][2] = (Button)findViewById(R.id.b52);
        b[5][3] = (Button)findViewById(R.id.b53);

        b[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[1][1].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[1][2].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[1][3].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });

        b[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[2][1].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[2][2].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[2][3].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[3][1].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[3][2].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[3][3].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[4][1].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[4][2].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[4][3].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[5][1].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[5][2].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });
        b[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count;
                Intent intent = new Intent(LevelActivity.this, GameActivity.class);
                count = Integer.parseInt((String) b[5][3].getText()) - 1;
                intent.putExtra("count", count);
                //Log.d("count = ", "" + count);
                startActivity(intent);
            }
        });


    }
}
