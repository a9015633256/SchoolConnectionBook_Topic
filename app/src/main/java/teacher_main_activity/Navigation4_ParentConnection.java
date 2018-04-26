package teacher_main_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.yangwensing.myapplication.BottomNavigationBarHelper;
import com.example.yangwensing.myapplication.R;

//家長聯絡頁面
public class Navigation4_ParentConnection extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation4_parent_connection);
        setTitle(R.string.ParentConnection);
        TextView title = findViewById(R.id.tvTitle4);
        title.setText("this is view4");
        BottomNavigationView bottomNavigationView = findViewById(R.id.btNavigation_Bar);
        BottomNavigationBarHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.ic_Home:
                        Intent intent0 = new Intent(Navigation4_ParentConnection.this, MainActivity.class);
                        startActivity(intent0);
                        break;

                    case R.id.ic_Management:
                        Intent intent1 = new Intent(Navigation4_ParentConnection.this, Navigation1_ClassManagement.class);
                        startActivity(intent1);
                        break;

                    case R.id.ic_Homework:
                        Intent intent3 = new Intent(Navigation4_ParentConnection.this, Navigation3_Homework.class);
                        startActivity(intent3);
                        break;

                    case R.id.ic_ExamSubject:
                        Intent intent4 = new Intent(Navigation4_ParentConnection.this, Navigation2_ExamSubject.class);
                        startActivity(intent4);
                        break;

                    case R.id.ic_Chat:
                        break;
                }

                return false;
            }
        });
    }
}
