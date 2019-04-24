public class ryey.easer.plugins.a.k.d extends ryey.easer.plugins.c<ryey.easer.plugins.a.k.a> {
  android.app.ProgressDialog a;

  public ryey.easer.plugins.a.k.d();
    Code:
       0: aload_0
       1: invokespecial #34                 // Method ryey/easer/plugins/c."<init>":()V
       4: aload_0
       5: new           #36                 // class java/util/concurrent/locks/ReentrantLock
       8: dup
       9: invokespecial #37                 // Method java/util/concurrent/locks/ReentrantLock."<init>":()V
      12: putfield      #39                 // Field g:Ljava/util/concurrent/locks/ReentrantLock;
      15: aload_0
      16: new           #7                  // class ryey/easer/plugins/a/k/d$1
      19: dup
      20: aload_0
      21: invokespecial #42                 // Method ryey/easer/plugins/a/k/d$1."<init>":(Lryey/easer/plugins/a/k/d;)V
      24: putfield      #44                 // Field h:Landroid/content/BroadcastReceiver;
      27: return

  static void a(ryey.easer.plugins.a.k.d);
    Code:
       0: aload_0
       1: invokespecial #108                // Method c:()V
       4: return

  static void a(ryey.easer.plugins.a.k.d, ryey.easer.plugins.a.k.d$a);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #111                // Method a:(Lryey/easer/plugins/a/k/d$a;)V
       5: return

  static boolean a(ryey.easer.plugins.a.k.d, boolean);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #114                // Field f:Z
       5: iload_1
       6: ireturn

  static java.util.concurrent.locks.ReentrantLock b(ryey.easer.plugins.a.k.d);
    Code:
       0: aload_0
       1: getfield      #39                 // Field g:Ljava/util/concurrent/locks/ReentrantLock;
       4: areturn

  static android.net.wifi.WifiManager c(ryey.easer.plugins.a.k.d);
    Code:
       0: aload_0
       1: getfield      #118                // Field e:Landroid/net/wifi/WifiManager;
       4: areturn

  public ryey.easer.commons.local_plugin.f a();
    Code:
       0: aload_0
       1: invokevirtual #212                // Method b:()Lryey/easer/plugins/a/k/a;
       4: areturn

  protected void a(ryey.easer.plugins.a.k.a);
    Code:
       0: aload_0
       1: getfield      #91                 // Field c:Landroid/widget/RadioButton;
       4: aload_1
       5: getfield      #217                // Field ryey/easer/plugins/a/k/a.a:Z
       8: invokevirtual #221                // Method android/widget/RadioButton.setChecked:(Z)V
      11: aload_0
      12: getfield      #48                 // Field b:Landroid/widget/EditText;
      15: aload_1
      16: getfield      #224                // Field ryey/easer/plugins/a/k/a.b:Ljava/util/Set;
      19: iconst_0
      20: invokestatic  #227                // Method ryey/easer/b.a:(Ljava/util/Collection;Z)Ljava/lang/String;
      23: invokevirtual #231                // Method android/widget/EditText.setText:(Ljava/lang/CharSequence;)V
      26: return

  public ryey.easer.plugins.a.k.a b();
    Code:
       0: new           #215                // class ryey/easer/plugins/a/k/a
       3: dup
       4: aload_0
       5: getfield      #48                 // Field b:Landroid/widget/EditText;
       8: invokevirtual #54                 // Method android/widget/EditText.getText:()Landroid/text/Editable;
      11: invokevirtual #60                 // Method java/lang/Object.toString:()Ljava/lang/String;
      14: aload_0
      15: getfield      #91                 // Field c:Landroid/widget/RadioButton;
      18: invokevirtual #97                 // Method android/widget/RadioButton.isChecked:()Z
      21: invokespecial #234                // Method ryey/easer/plugins/a/k/a."<init>":(Ljava/lang/String;Z)V
      24: areturn

  protected void b(ryey.easer.commons.local_plugin.f);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #215                // class ryey/easer/plugins/a/k/a
       5: invokevirtual #237                // Method a:(Lryey/easer/plugins/a/k/a;)V
       8: return

  public void onAttach(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #240                // Method ryey/easer/plugins/c.onAttach:(Landroid/content/Context;)V
       5: aload_0
       6: aload_1
       7: invokevirtual #245                // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      10: ldc           #247                // String wifi
      12: invokevirtual #251                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      15: checkcast     #189                // class android/net/wifi/WifiManager
      18: putfield      #118                // Field e:Landroid/net/wifi/WifiManager;
      21: aload_1
      22: aload_0
      23: getfield      #44                 // Field h:Landroid/content/BroadcastReceiver;
      26: new           #253                // class android/content/IntentFilter
      29: dup
      30: ldc           #255                // String android.net.wifi.SCAN_RESULTS
      32: invokespecial #257                // Method android/content/IntentFilter."<init>":(Ljava/lang/String;)V
      35: invokevirtual #261                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      38: pop
      39: return

  public android.view.View onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle);
    Code:
       0: aload_1
       1: ldc_w         #264                // int 2131427443
       4: aload_2
       5: iconst_0
       6: invokevirtual #270                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
       9: astore_1
      10: aload_0
      11: aload_1
      12: ldc_w         #271                // int 2131296753
      15: invokevirtual #277                // Method android/view/View.findViewById:(I)Landroid/view/View;
      18: checkcast     #50                 // class android/widget/EditText
      21: putfield      #48                 // Field b:Landroid/widget/EditText;
      24: aload_0
      25: aload_1
      26: ldc_w         #278                // int 2131296573
      29: invokevirtual #277                // Method android/view/View.findViewById:(I)Landroid/view/View;
      32: checkcast     #93                 // class android/widget/RadioButton
      35: putfield      #91                 // Field c:Landroid/widget/RadioButton;
      38: aload_0
      39: aload_1
      40: ldc_w         #279                // int 2131296572
      43: invokevirtual #277                // Method android/view/View.findViewById:(I)Landroid/view/View;
      46: checkcast     #93                 // class android/widget/RadioButton
      49: putfield      #281                // Field d:Landroid/widget/RadioButton;
      52: aload_1
      53: ldc_w         #282                // int 2131296347
      56: invokevirtual #277                // Method android/view/View.findViewById:(I)Landroid/view/View;
      59: new           #9                  // class ryey/easer/plugins/a/k/d$2
      62: dup
      63: aload_0
      64: invokespecial #283                // Method ryey/easer/plugins/a/k/d$2."<init>":(Lryey/easer/plugins/a/k/d;)V
      67: invokevirtual #287                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      70: aload_1
      71: areturn

  public void onDetach();
    Code:
       0: aload_0
       1: invokevirtual #130                // Method getContext:()Landroid/content/Context;
       4: astore_1
       5: aload_0
       6: aload_1
       7: invokevirtual #245                // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      10: ldc           #247                // String wifi
      12: invokevirtual #251                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      15: checkcast     #189                // class android/net/wifi/WifiManager
      18: putfield      #118                // Field e:Landroid/net/wifi/WifiManager;
      21: aload_1
      22: aload_0
      23: getfield      #44                 // Field h:Landroid/content/BroadcastReceiver;
      26: invokevirtual #292                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      29: aload_0
      30: invokespecial #294                // Method ryey/easer/plugins/c.onDetach:()V
      33: return
}
