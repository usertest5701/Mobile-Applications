package maksatuly.example.rauan.rauan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {
    String s[] = {"307090040000700920100230060089000406604009000000026709040307000851000004000501092",
            "093000010000609000200030650029005004000000003048001005700040980000903000062000030",
            "700800900034000000000600301005020000090038000040000509008006040000790020400000006",
            "000034000507000000010000206000409080406000075000605010050000108908000000000092000",
            "300000005000607000407000901000103000041000350090204070709000203000902000100030004",
            "090300050400500301000210080176000000002000600000000513060097000709001006010003070",
            "000047000080000500040060010806900001300100904100053000060008000002000790000439000",
            "069000000004000086000067050000802007500000003200304000070690000490000200000000170",
            "020900801840001000000037004900000480002000900053000002500760000000200068108005040",
            "000902004600003500152000800085090000000200090016030000521000900800009200008504008",
            "301000500000300102800014000010002070006000320009806000690050008000290000050000901",
            "000060301240000000006003090830507000000000030650902000007008020910000000000090108",
            "704600000000400030001080020510000009080305070900000085070020800050004000000007601",
            "020307000000000870704000000501020609000908001803040702608000000000000530050109000",
            "005040200010608030030070090700000009000701000600000005060010040020904080009020300",
            "020030000070208000090060780900300001800000004500002008089050060000806050000070020",
            ""};
    int count = 0, seconds = 0, pop;
    Button start,button4;
    EditText[][] t = new EditText[10][10];
    boolean running = true;
    ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> positionOfError = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        count = intent.getIntExtra("count", 0);
        setContentView(R.layout.activity_game);
        button4 = findViewById(R.id.button4);
        start = findViewById(R.id.start);
        t[1][1] =  findViewById(R.id.t11);
        t[1][2] =  findViewById(R.id.t12);
        t[1][3] =  findViewById(R.id.t13);
        t[1][4] =  findViewById(R.id.t14);
        t[1][5] =  findViewById(R.id.t15);
        t[1][6] =  findViewById(R.id.t16);
        t[1][7] =  findViewById(R.id.t17);
        t[1][8] =  findViewById(R.id.t18);
        t[1][9] =  findViewById(R.id.t19);

        t[2][1] =  findViewById(R.id.t21);
        t[2][2] =  findViewById(R.id.t22);
        t[2][3] =  findViewById(R.id.t23);
        t[2][4] =  findViewById(R.id.t24);
        t[2][5] =  findViewById(R.id.t25);
        t[2][6] =  findViewById(R.id.t26);
        t[2][7] =  findViewById(R.id.t27);
        t[2][8] =  findViewById(R.id.t28);
        t[2][9] =  findViewById(R.id.t29);

        t[3][1] =  findViewById(R.id.t31);
        t[3][2] =  findViewById(R.id.t32);
        t[3][3] =  findViewById(R.id.t33);
        t[3][4] =  findViewById(R.id.t34);
        t[3][5] =  findViewById(R.id.t35);
        t[3][6] =  findViewById(R.id.t36);
        t[3][7] =  findViewById(R.id.t37);
        t[3][8] =  findViewById(R.id.t38);
        t[3][9] =  findViewById(R.id.t39);


        t[4][1] =  findViewById(R.id.t41);
        t[4][2] =  findViewById(R.id.t42);
        t[4][3] =  findViewById(R.id.t43);
        t[4][4] =  findViewById(R.id.t44);
        t[4][5] =  findViewById(R.id.t45);
        t[4][6] =  findViewById(R.id.t46);
        t[4][7] =  findViewById(R.id.t47);
        t[4][8] =  findViewById(R.id.t48);
        t[4][9] =  findViewById(R.id.t49);

        t[5][1] =  findViewById(R.id.t51);
        t[5][2] =  findViewById(R.id.t52);
        t[5][3] =  findViewById(R.id.t53);
        t[5][4] =  findViewById(R.id.t54);
        t[5][5] =  findViewById(R.id.t55);
        t[5][6] =  findViewById(R.id.t56);
        t[5][7] =  findViewById(R.id.t57);
        t[5][8] =  findViewById(R.id.t58);
        t[5][9] =  findViewById(R.id.t59);

        t[6][1] = (EditText) findViewById(R.id.t61);
        t[6][2] = (EditText) findViewById(R.id.t62);
        t[6][3] = (EditText) findViewById(R.id.t63);
        t[6][4] = (EditText) findViewById(R.id.t64);
        t[6][5] = (EditText) findViewById(R.id.t65);
        t[6][6] = (EditText) findViewById(R.id.t66);
        t[6][7] = (EditText) findViewById(R.id.t67);
        t[6][8] = (EditText) findViewById(R.id.t68);
        t[6][9] = (EditText) findViewById(R.id.t69);


        t[7][1] = (EditText) findViewById(R.id.t71);
        t[7][2] = (EditText) findViewById(R.id.t72);
        t[7][3] = (EditText) findViewById(R.id.t73);
        t[7][4] = (EditText) findViewById(R.id.t74);
        t[7][5] = (EditText) findViewById(R.id.t75);
        t[7][6] = (EditText) findViewById(R.id.t76);
        t[7][7] = (EditText) findViewById(R.id.t77);
        t[7][8] = (EditText) findViewById(R.id.t78);
        t[7][9] = (EditText) findViewById(R.id.t79);

        t[8][1] = (EditText) findViewById(R.id.t81);
        t[8][2] = (EditText) findViewById(R.id.t82);
        t[8][3] = (EditText) findViewById(R.id.t83);
        t[8][4] = (EditText) findViewById(R.id.t84);
        t[8][5] = (EditText) findViewById(R.id.t85);
        t[8][6] = (EditText) findViewById(R.id.t86);
        t[8][7] = (EditText) findViewById(R.id.t87);
        t[8][8] = (EditText) findViewById(R.id.t88);
        t[8][9] = (EditText) findViewById(R.id.t89);

        t[9][1] = (EditText) findViewById(R.id.t91);
        t[9][2] = (EditText) findViewById(R.id.t92);
        t[9][3] = (EditText) findViewById(R.id.t93);
        t[9][4] = (EditText) findViewById(R.id.t94);
        t[9][5] = (EditText) findViewById(R.id.t95);
        t[9][6] = (EditText) findViewById(R.id.t96);
        t[9][7] = (EditText) findViewById(R.id.t97);
        t[9][8] = (EditText) findViewById(R.id.t98);
        t[9][9] = (EditText) findViewById(R.id.t99);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onB(view);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onCheck(view);
            }
        });
    }

    void onB(View view) {
        seconds = 0;
        int pop = 0;
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(s[count].charAt(pop) == '0') {
                    t[i][j].setText("");
                    t[i][j].setEnabled(true);
                    t[i][j].setTextColor(-16776961);
                }
                else {
                    t[i][j].setText("" + s[count].charAt(pop));
                    t[i][j].setEnabled(false);
                    t[i][j].setTextColor(-16777216);
                }
                pop += 1;
            }
        }
        Button start = (Button) findViewById(R.id.start);
        start.setText("Next Level");
        start.setClickable(false);
        runTimer();


    }

    void onCheck(View view) {
        TextView tv = (TextView) findViewById(R.id.tv);
        EditText[][] t = new EditText[10][10];

        t[1][1] = (EditText) findViewById(R.id.t11);
        t[1][2] = (EditText) findViewById(R.id.t12);
        t[1][3] = (EditText) findViewById(R.id.t13);
        t[1][4] = (EditText) findViewById(R.id.t14);
        t[1][5] = (EditText) findViewById(R.id.t15);
        t[1][6] = (EditText) findViewById(R.id.t16);
        t[1][7] = (EditText) findViewById(R.id.t17);
        t[1][8] = (EditText) findViewById(R.id.t18);
        t[1][9] = (EditText) findViewById(R.id.t19);

        t[2][1] = (EditText) findViewById(R.id.t21);
        t[2][2] = (EditText) findViewById(R.id.t22);
        t[2][3] = (EditText) findViewById(R.id.t23);
        t[2][4] = (EditText) findViewById(R.id.t24);
        t[2][5] = (EditText) findViewById(R.id.t25);
        t[2][6] = (EditText) findViewById(R.id.t26);
        t[2][7] = (EditText) findViewById(R.id.t27);
        t[2][8] = (EditText) findViewById(R.id.t28);
        t[2][9] = (EditText) findViewById(R.id.t29);

        t[3][1] = (EditText) findViewById(R.id.t31);
        t[3][2] = (EditText) findViewById(R.id.t32);
        t[3][3] = (EditText) findViewById(R.id.t33);
        t[3][4] = (EditText) findViewById(R.id.t34);
        t[3][5] = (EditText) findViewById(R.id.t35);
        t[3][6] = (EditText) findViewById(R.id.t36);
        t[3][7] = (EditText) findViewById(R.id.t37);
        t[3][8] = (EditText) findViewById(R.id.t38);
        t[3][9] = (EditText) findViewById(R.id.t39);


        t[4][1] = (EditText) findViewById(R.id.t41);
        t[4][2] = (EditText) findViewById(R.id.t42);
        t[4][3] = (EditText) findViewById(R.id.t43);
        t[4][4] = (EditText) findViewById(R.id.t44);
        t[4][5] = (EditText) findViewById(R.id.t45);
        t[4][6] = (EditText) findViewById(R.id.t46);
        t[4][7] = (EditText) findViewById(R.id.t47);
        t[4][8] = (EditText) findViewById(R.id.t48);
        t[4][9] = (EditText) findViewById(R.id.t49);

        t[5][1] = (EditText) findViewById(R.id.t51);
        t[5][2] = (EditText) findViewById(R.id.t52);
        t[5][3] = (EditText) findViewById(R.id.t53);
        t[5][4] = (EditText) findViewById(R.id.t54);
        t[5][5] = (EditText) findViewById(R.id.t55);
        t[5][6] = (EditText) findViewById(R.id.t56);
        t[5][7] = (EditText) findViewById(R.id.t57);
        t[5][8] = (EditText) findViewById(R.id.t58);
        t[5][9] = (EditText) findViewById(R.id.t59);

        t[6][1] = (EditText) findViewById(R.id.t61);
        t[6][2] = (EditText) findViewById(R.id.t62);
        t[6][3] = (EditText) findViewById(R.id.t63);
        t[6][4] = (EditText) findViewById(R.id.t64);
        t[6][5] = (EditText) findViewById(R.id.t65);
        t[6][6] = (EditText) findViewById(R.id.t66);
        t[6][7] = (EditText) findViewById(R.id.t67);
        t[6][8] = (EditText) findViewById(R.id.t68);
        t[6][9] = (EditText) findViewById(R.id.t69);


        t[7][1] = (EditText) findViewById(R.id.t71);
        t[7][2] = (EditText) findViewById(R.id.t72);
        t[7][3] = (EditText) findViewById(R.id.t73);
        t[7][4] = (EditText) findViewById(R.id.t74);
        t[7][5] = (EditText) findViewById(R.id.t75);
        t[7][6] = (EditText) findViewById(R.id.t76);
        t[7][7] = (EditText) findViewById(R.id.t77);
        t[7][8] = (EditText) findViewById(R.id.t78);
        t[7][9] = (EditText) findViewById(R.id.t79);

        t[8][1] = (EditText) findViewById(R.id.t81);
        t[8][2] = (EditText) findViewById(R.id.t82);
        t[8][3] = (EditText) findViewById(R.id.t83);
        t[8][4] = (EditText) findViewById(R.id.t84);
        t[8][5] = (EditText) findViewById(R.id.t85);
        t[8][6] = (EditText) findViewById(R.id.t86);
        t[8][7] = (EditText) findViewById(R.id.t87);
        t[8][8] = (EditText) findViewById(R.id.t88);
        t[8][9] = (EditText) findViewById(R.id.t89);

        t[9][1] = (EditText) findViewById(R.id.t91);
        t[9][2] = (EditText) findViewById(R.id.t92);
        t[9][3] = (EditText) findViewById(R.id.t93);
        t[9][4] = (EditText) findViewById(R.id.t94);
        t[9][5] = (EditText) findViewById(R.id.t95);
        t[9][6] = (EditText) findViewById(R.id.t96);
        t[9][7] = (EditText) findViewById(R.id.t97);
        t[9][8] = (EditText) findViewById(R.id.t98);
        t[9][9] = (EditText) findViewById(R.id.t99);
        if(!checkFull(t)) {
            tv.setText("Fill all boxes");
        }
        else if(!checkRow(t)) {
            tv.setText("Error on some row\n[" + positionOfError.get(0) + ", " + positionOfError.get(1) + "]");
        }
        else if(!checkColumn(t)) {
            tv.setText("Error on some column\n[" + positionOfError.get(0) + ", " + positionOfError.get(1) + "]");
        }

        else {
            Button start = (Button) findViewById(R.id.start);
            start.setClickable(true);
            tv.setText("");
            count += 1;
            if(count == 16) {
                count = 0;
            }
        }





    }

    boolean checkRow(EditText[][] t) {
        positionOfError.clear();
        for(int i = 1; i <= 9; i++) {
            list.clear();
            for(int j = 1; j<= 9; j++) {
                pop = Integer.parseInt(t[i][j].getText().toString());
                if(list.contains(pop)) {
                    positionOfError.add(i);
                    positionOfError.add(j);
                    return false;
                }
                list.add(pop);

            }
        }
        return true;
    }

    boolean checkColumn(EditText[][] t) {
        positionOfError.clear();
        for(int j = 1; j <= 9; j++) {
            list.clear();
            for(int i = 1; i<= 9; i++) {
                pop = Integer.parseInt(t[i][j].getText().toString());
                if(list.contains(pop)) {
                    positionOfError.add(i);
                    positionOfError.add(j);
                    return false;
                }
                list.add(pop);

            }
        }
        return true;
    }

    boolean checkFull(EditText[][] t) {
        for(int j = 1; j <= 9; j++) {
            list.clear();
            for(int i = 1; i<= 9; i++) {
                if(t[i][j].getText().toString().equals("")) {
                    return false;
                }
                pop = Integer.parseInt(t[i][j].getText().toString());
                list.add(pop);

            }
            if(list.size() != 9) {
                return false;
            }
        }
        return true;
    }

    void runTimer() {
        final TextView timer = (TextView) findViewById(R.id.timer);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int minutes = seconds / 60;
                int second = seconds % 60;
                String time = String.format("%02d:%02d", minutes, second);
                timer.setText(time);
                if(running) {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });
    }
}
