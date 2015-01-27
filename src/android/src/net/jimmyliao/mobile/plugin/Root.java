package net.jimmyliao.mobile.plugin;

import java.io.File;

import net.jimmyliao.mobile.plugin.ExecShell.SHELL_CMD;

/** @author Kevin Kowalewski */
/** @author Jimmy Liao */
public class Root {

    private static String LOG_TAG = Root.class.getName();

    public boolean isDeviceRooted() {
        return checkRootMethod1() || checkRootMethod2() || checkRootMethod3();
    }

    public boolean checkRootMethod1() {
        String buildTags = android.os.Build.TAGS;
        return buildTags != null && buildTags.contains("test-keys");
    }

    public boolean checkRootMethod2() {
        try {
            File file = new File("/system/app/Superuser.apk");
            return file.exists();
        } catch (Exception e){ 
        	return false;
        		}
    }

    public boolean checkRootMethod3() {
        return new ExecShell().executeCommand(SHELL_CMD.check_su_binary)!=null;
    }
}   


