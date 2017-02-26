package cof.gof.antoidtravistest;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class RoboElectricUnitLikeTest {

    @Test
    public void clickingLogin_shouldStartLoginActivity() {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().visible().get();

        TextView hello = (TextView) activity.findViewById(R.id.hello_message);

        assertTrue(hello.getText().toString().equalsIgnoreCase("hola"));
    }
}
