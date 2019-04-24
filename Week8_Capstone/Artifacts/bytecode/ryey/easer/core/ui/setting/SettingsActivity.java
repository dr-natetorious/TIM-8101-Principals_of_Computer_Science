public class ryey.easer.core.ui.setting.SettingsActivity extends android.support.v7.app.e implements android.content.SharedPreferences$OnSharedPreferenceChangeListener {
  public ryey.easer.core.ui.setting.SettingsActivity();
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v7/app/e."<init>":()V
       4: return

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #30                 // Method android/support/v7/app/e.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: invokevirtual #34                 // Method getFragmentManager:()Landroid/app/FragmentManager;
       9: invokevirtual #40                 // Method android/app/FragmentManager.beginTransaction:()Landroid/app/FragmentTransaction;
      12: ldc           #41                 // int 16908290
      14: new           #8                  // class ryey/easer/core/ui/setting/SettingsActivity$a
      17: dup
      18: invokespecial #42                 // Method ryey/easer/core/ui/setting/SettingsActivity$a."<init>":()V
      21: invokevirtual #48                 // Method android/app/FragmentTransaction.replace:(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;
      24: invokevirtual #52                 // Method android/app/FragmentTransaction.commit:()I
      27: pop
      28: aload_0
      29: invokevirtual #56                 // Method getSupportActionBar:()Landroid/support/v7/app/a;
      32: iconst_1
      33: invokevirtual #61                 // Method android/support/v7/app/a.a:(Z)V
      36: aload_0
      37: invokevirtual #56                 // Method getSupportActionBar:()Landroid/support/v7/app/a;
      40: iconst_1
      41: invokevirtual #64                 // Method android/support/v7/app/a.b:(Z)V
      44: return

  public boolean onOptionsItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #71,  1           // InterfaceMethod android/view/MenuItem.getItemId:()I
       6: ldc           #72                 // int 16908332
       8: if_icmpeq     17
      11: aload_0
      12: aload_1
      13: invokespecial #74                 // Method android/support/v7/app/e.onOptionsItemSelected:(Landroid/view/MenuItem;)Z
      16: ireturn
      17: aload_0
      18: invokevirtual #77                 // Method onBackPressed:()V
      21: iconst_1
      22: ireturn

  public void onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String);
    Code:
       0: aload_2
       1: aload_0
       2: ldc           #82                 // int 2131624102
       4: invokevirtual #86                 // Method getString:(I)Ljava/lang/String;
       7: invokevirtual #92                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      10: ifeq          74
      13: new           #94                 // class android/content/ComponentName
      16: dup
      17: aload_0
      18: ldc           #96                 // class ryey/easer/core/BootUpReceiver
      20: invokespecial #99                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      23: astore        5
      25: aload_0
      26: invokevirtual #103                // Method getPackageManager:()Landroid/content/pm/PackageManager;
      29: astore        6
      31: aload         5
      33: astore_3
      34: aload         6
      36: astore        4
      38: aload_1
      39: aload_2
      40: iconst_0
      41: invokeinterface #109,  3          // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
      46: ifeq          65
      49: aload         6
      51: astore_1
      52: aload         5
      54: astore        6
      56: aload_1
      57: aload         6
      59: iconst_1
      60: iconst_1
      61: invokevirtual #115                // Method android/content/pm/PackageManager.setComponentEnabledSetting:(Landroid/content/ComponentName;II)V
      64: return
      65: aload         4
      67: aload_3
      68: iconst_2
      69: iconst_1
      70: invokevirtual #115                // Method android/content/pm/PackageManager.setComponentEnabledSetting:(Landroid/content/ComponentName;II)V
      73: return
      74: aload_2
      75: aload_0
      76: ldc           #116                // int 2131624114
      78: invokevirtual #86                 // Method getString:(I)Ljava/lang/String;
      81: invokevirtual #92                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      84: ifeq          129
      87: new           #94                 // class android/content/ComponentName
      90: dup
      91: aload_0
      92: ldc           #118                // class ryey/easer/core/UpgradeCompleteReceiver
      94: invokespecial #99                 // Method android/content/ComponentName."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      97: astore        6
      99: aload_0
     100: invokevirtual #103                // Method getPackageManager:()Landroid/content/pm/PackageManager;
     103: astore        5
     105: aload         6
     107: astore_3
     108: aload         5
     110: astore        4
     112: aload_1
     113: aload_2
     114: iconst_0
     115: invokeinterface #109,  3          // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
     120: ifeq          65
     123: aload         5
     125: astore_1
     126: goto          56
     129: aload_2
     130: aload_0
     131: ldc           #119                // int 2131624117
     133: invokevirtual #86                 // Method getString:(I)Ljava/lang/String;
     136: invokevirtual #92                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     139: ifeq          186
     142: aload_1
     143: aload_2
     144: iconst_0
     145: invokeinterface #109,  3          // InterfaceMethod android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
     150: ifeq          186
     153: invokestatic  #125                // Method java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
     156: ldc           #127                // String su
     158: invokevirtual #131                // Method java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
     161: pop
     162: return
     163: astore_3
     164: aload_3
     165: invokestatic  #136                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
     168: aload_1
     169: invokeinterface #140,  1          // InterfaceMethod android/content/SharedPreferences.edit:()Landroid/content/SharedPreferences$Editor;
     174: aload_2
     175: iconst_0
     176: invokeinterface #146,  3          // InterfaceMethod android/content/SharedPreferences$Editor.putBoolean:(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
     181: invokeinterface #149,  1          // InterfaceMethod android/content/SharedPreferences$Editor.apply:()V
     186: return
    Exception table:
       from    to  target type
         153   162   163   Class java/io/IOException
}
